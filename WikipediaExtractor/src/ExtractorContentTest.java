import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.lazy.LinkTargetException;


public class ExtractorContentTest {

	@Test
	public void test() throws FileNotFoundException, IOException, LinkTargetException, CompilerException {
		
				     
		WikiPageContentExtractor wikipediaExtractor = new WikiPageContentExtractor() ;
		String wikiPageName = "Comparison_of_video_converters" ;
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
		String sectionName = section.getElementsByTag("h2").first().text() ;
		
		// FIXME (1. optional step) some comments
		
		// 2. retrieve tabular
		Elements tables = section.getElementsByTag("table");
		if (!tables.isEmpty()) 
			System.err.println("\n****** " + sectionName + " *******\n");
		
		
		List<List<Product>> products = new ArrayList<List<Product>>();
		
		for (Element table : tables) {
			// (0. optional step) act as subviewname
			Elements caption = table.getElementsByTag("caption") ;
			if (!caption.isEmpty()) {
				String captionName = caption.first().text() ; 
				System.err.println("caption:" + captionName);
			}
			// 1 headers
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
			
			//System.err.println("rHeaders=" + rHeaders);
			
			// at this step, cell (I, J) corresponds to value of the J-th header of I-th product 
			// 2 treat row
			int I = 0 ; 			
			List<Product> product = new ArrayList<Product>() ;
			for (Element row : table.select("tr")) {
               
				Elements lines = row.select("td");
				
				Product p = new Product ("product_" + I + "_of_" + sectionName, rHeaders);
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

}
