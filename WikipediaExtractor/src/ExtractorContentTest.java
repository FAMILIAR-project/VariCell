import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.lazy.LinkTargetException;


public class ExtractorContentTest {
	
	public static String URL_BASE_NAME = "http://en.wikipedia.org" ; 
	
	@Test
	public void collectAllComparisonOf() throws IOException {
		
		List<Element> hrefs = new ArrayList<Element>() ; 
		_collectAllComparisonOf("/w/index.php?title=Special%3APrefixIndex&prefix=Comparison&namespace=0&hideredirects=1",  hrefs);
		
		System.err.println("#hrefs=" + hrefs.size());
		StringBuilder content = new StringBuilder() ; 
		content.append("Title ; URL\n") ; // header
		for (Element href : hrefs) {
			String hText = href.attr("title");
			String hURL = href.attr("href") ;
			content.append("" + hText + " ; " + URL_BASE_NAME + hURL + "\n");
		}
		
		FileUtils.writeStringToFile(new File ("comparisonsData.csv"), content.toString());
			
	}

	private void _collectAllComparisonOf(String url, List<Element> hrefs) throws IOException {
		
		Document doc = Jsoup.connect("" + URL_BASE_NAME + url).get();
		Elements aHrefs = doc.select("a[href]");
	
		Element urlNext = null ;
		for (Element aHref : aHrefs) {
				Element h = aHref.getElementsByAttribute("href").first() ; // val() ;
				String hText = h.attr("title");
				String hURL = h.attr("href") ; 
				if (hText.contains("Comparison") && hURL.startsWith("/wiki/")) {
					hrefs.add(aHref);
				}
				String aText = aHref.text() ; 
				if (aText.contains("Next page") && hURL.startsWith("/w/index.php?"))
					urlNext = aHref ; 
					
					
			
		}

		if (urlNext != null) {
			_collectAllComparisonOf(urlNext.attr("href"), hrefs) ; 
		}
		
	}

	@Test
	public void test() throws FileNotFoundException, IOException, LinkTargetException, CompilerException {
		
				     
		WikiPageContentExtractor wikipediaExtractor = new WikiPageContentExtractor() ;
		String wikiPageName = "Comparison_of_FTP_client_software" ; //"Comparison_of_hardware_random_number_generators" ; //"Comparison_of_image_formats" ; //"Comparison_of_video_editing_software" ; // "Comparison_of_video_codecs" ; //"Comparison_of_container_formats" ; 
							 //"Comparison_of_video_converters" ;
		String content = wikipediaExtractor.getContent(wikiPageName) ;
		
		assertNotNull(content);
		//System.err.println("content = " + content);
		
		WikiTabularExtractor wikiTabExtractor = new WikiTabularExtractor() ;
		
		//content = "'''Video converters''' are [[computer program]]s" ; 
		String htmlContent = wikiTabExtractor.run(content, "video");
		
		assertNotNull(htmlContent);
		
		//Document doc = Jsoup.connect("http://en.wikipedia.org/w/index.php?title=" + wikiPageName).get();
		Document doc = Jsoup.parse(htmlContent);
		Elements sections = doc.getElementsByClass("section") ; 
		
		// FIXME what about no section ?
		//treatSection(doc.body());
		for (Element section : sections) {
			treatSection(section);				
		}
		
		
		//System.err.println("doc=" + sections);
		//System.err.println("doc=" + doc.getElementsByTag("title"));
		//System.err.println("doc=" + doc.title());
		
		
		
		
		
		
		
	}

	private void treatSection(Element section) {
		
		// 1. get section name
		// FIXME what is it does not exist?
		// FIXME can be "h3"
		Elements sect2 = section.getElementsByTag("h2") ; 
		String sectionName = null ; 
		if (!sect2.isEmpty())
			sectionName = sect2.first().text() ; // FIXME what about more than 1 ?
		else {
			Elements sect3 = section.getElementsByTag("h3") ;
			if (!sect3.isEmpty())
				sectionName = sect3.first().text() ;
		}
		// FIXME can be subsection
		
		
		// FIXME (1. optional step) some comments
		
		// 2. retrieve tabular
		Elements tables = section.getElementsByTag("table");
		if (!tables.isEmpty()) 
			System.err.println("\n****** " + sectionName + " *******\n");

		List<List<Product>> products = new ArrayList<List<Product>>();
		
		for (Element table : tables) {
			
			
			
			
			// (0. optional step) act as subviewname
			Elements caption = table.select("caption") ;
			String captionName = null ; 
			if (!caption.isEmpty()) 
				captionName = caption.first().text() ;
			
			
			
			/*** 
			 * Headers
			 */
			//
			List<Header> rHeaders = collectHeaders(table);		
			
			boolean sortable = !table.select("[class=sortable wikitable]").isEmpty() 
					||  !table.select("[class=wikitable sortable]").isEmpty() 
					;
			// FIXME: other cases
			Elements heads = table.select("thead") ; 
			if (sortable && 
					(!heads.isEmpty())) {
				rHeaders =  collectHeaders(heads.first());
			}
			
			// 2 treat row					
			List<Product> product = null ;
			if (sortable) {
				product = treatRows (table.select("tbody").first(), sectionName, captionName, rHeaders, sortable);
			}
			else
			 	product = treatRows (table, sectionName, captionName, rHeaders, sortable);
			products.add(product);
						
			// 
			
		}
		
		// set the "ID" / names
		// clean up
		for (List<Product> list : products) {
			for (Product product : list) {				
				Header primaryHeader = product.getHeaders().get(0);
				product.setName(product.getValue(primaryHeader.getName()));
				System.err.println("" + product);
			}
		}
	
		
		
	}

	// at this step, cell (I, J) corresponds to value of the J-th header of I-th product 
	private List<Product> treatRows(Element table, String sectionName, String captionName, List<Header> rHeaders, boolean sortable) {
		int I = 0 ; 	
		List<Product> product = new ArrayList<Product>() ;
		for (Element row : table.select("tr")) {
           
			Elements lines ; 
			if (sortable) {
				lines = row.select("th"); // first entry is a header in sortable table
				lines.addAll(row.select("td"));
			}
			else {
				lines = row.select("td");
			}
			
			
			Product p = new Product ("product_" + I, mkStructuralInformation (sectionName, captionName), rHeaders);
			int J = 0 ; 
			for (Element line : lines) {
				p.add(J, line.text());
				J++ ; 
			}
			
			// necessarily a tr with a td
			if (!lines.isEmpty()) {
				product.add(p);
				I++ ; 
			}
			
        }
		return product ; 
	}

	private List<Header> collectHeaders(Element table) {
		List<Header> headers = new ArrayList<Header>() ;
		List<Header> headersWithNestedHeaders = new ArrayList<Header>() ;
		List<List<Header>> nestedHeaders = new ArrayList<List<Header>>() ;
		
		int levelHeader = 0 ; // FIXME nested header > 1
		
		
		for (Element row : table.select("tr")) {
			
			
			if (levelHeader == 0) {
				for (Element header : row.select("th")) {
					Header headerV = new Header(header.text()); 
					Elements colspan = header.getElementsByAttribute("colspan");
					if (!colspan.isEmpty()) 
						headersWithNestedHeaders.add(headerV);
	                headers.add(headerV);
	            }
				levelHeader++ ; 
			}
			
			else if (levelHeader == 1) {
				// nested header
				List<Header> nHeaders = new ArrayList<Header>();
				for (Element header : row.select("th")) {
					Header headerV = new Header(header.text()); 
	                nHeaders.add(headerV);
	            }
				nestedHeaders.add(nHeaders);
				
			}
			
		}
		
		// FIXME table.select("thead"); 
		
		// FIXME assign a "number" of appearance for headers 
		// especially important for nested headers (colspan="3")
		List<Header> rHeaders = new ArrayList<Header>() ; 
		int n = 0 ; 
		for (Header header : headers) {
			// nested
			if (headersWithNestedHeaders.contains(header)) {
				List<Header> nHeaders = nestedHeaders.get(n);
				for (Header nH : nHeaders) {
					rHeaders.add(nH);
				}
			}
			else {
				rHeaders.add(header);
			}
		}
		return rHeaders ; 
	}

	private String mkStructuralInformation(String sectionName, String captionName) {
		if (captionName == null)
			return sectionName ; 
		return sectionName + " -> " + captionName ; 
 	}

}
