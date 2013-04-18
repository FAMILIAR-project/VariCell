import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.prop4j.And;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Or;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.lazy.LinkTargetException;

import com.google.common.collect.Sets;

import de.ovgu.featureide.fm.core.editing.NodeCreator;

import fr.unice.polytech.modalis.familiar.operations.FMLMergerBDDSPLOT;
import fr.unice.polytech.modalis.familiar.operations.ImplicationGraphUtil;
import fr.unice.polytech.modalis.familiar.operations.featureide.SATFMLFormula;
import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import fr.unice.polytech.modalis.familiar.variable.featureide.FeatureModelVariableSATFormula;
import gsd.graph.ImplicationGraph;


public class ExtractorContentTest extends FMLTest {
	
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
		String wikiPageName = "Comparison_of_Java_virtual_machines"; 
				// "Comparison_of_XML_editors" ;   
				//"Comparison_of_free_web_hosting_services"; 
				//"Comparison_of_free_and_open-source_software_licenses" ;  
				//"Comparison_of_file_systems" ;
				//"Comparison_of_Subversion_clients"; 
				//"Comparison_of_SSH_clients" ; 
				//"Comparison_of_Prolog_implementations" ;    
				//"Comparison_of_BitTorrent_clients" ; 
							 //"Comparison_of_FTP_client_software" ; 
							 //"Comparison_of_hardware_random_number_generators" ; //"Comparison_of_image_formats" ; //"Comparison_of_video_editing_software" ; // "Comparison_of_video_codecs" ; //"Comparison_of_container_formats" ; 
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
		FileUtils.writeStringToFile(new File("output/" + wikiPageName + ".html"), doc.toString());

		//Element docContentEntryPoint = doc ; // doc.getElementsByClass("article-content").first(); 
		//Elements sections = docContentEntryPoint.getElementsByClass("section") ; 
		// FIXME what about no section ?
		//treatSection(doc.body());
		
		Elements tabs = doc.select("table"); 
		
		List<Catalog> catalogs = new ArrayList<Catalog>();
		for (Element section : tabs) {
			treatTable (section, catalogs);
			
		}
		/*for (Element section : sections) {
			treatSection (section, catalogs);
			
		}*/
		
		// set the "ID" / names
		// clean up
		
		
		// FIXME here it is specific 
		
		/*
		 * Scoping directives here
		 */
		
		for (Catalog catalog : catalogs) {
			String[] columnNames = {} ; //{ "Latest release date", "Latest stable version", "First public release", "Creator", "Name" }  ;
			for (String columnName : columnNames) {
				if (!catalog.hasHeader(columnName)) 
					continue ; 
				if (!catalog.removeColumn(columnName)) {
					System.err.println("Unable to remove the column " + columnName);
				}
			}
			
			
			
		}
		
		
		List<FeatureModelVariable> fmvs = new ArrayList<FeatureModelVariable>() ; 
		for (Catalog catalog : catalogs) {
			System.err.println("***" +  catalog.getStructuralInformation() + "****");
			if (!catalog.getName().equals("General information"))
				continue ; 
			for (Product product : catalog) {
				FeatureModelVariable fmv = product.toFeatureDiagram() ;
				fmvs.add(fmv);
				
			}
			System.err.println("\n\n");
		}
		
		
		for (FeatureModelVariable fmv : fmvs) {
			System.err.println("\n" + fmv.getIdentifier() + " = " + fmv);
			
		}
		
		_shell.setVerbose(true);
		FeatureModelVariable fmMerged = new FMLMergerBDDSPLOT(fmvs, _builder).union(); 
		System.err.println("fmMerged = " + fmMerged);
		
		
		//System.err.println("doc=" + sections);
		//System.err.println("doc=" + doc.getElementsByTag("title"));
		//System.err.println("doc=" + doc.title());
		
		
		
		
		
		
		
	}

	

	private FeatureModelVariable mergeSATUnion(List<FeatureModelVariable> fmvs) {
		Node n = new Literal(NodeCreator.varFalse); 
		Set<String> fts = new HashSet<String>();
		for (FeatureModelVariable fmv : fmvs) {
			fts.addAll(fmv.features().names());
		}
		
		
		for (FeatureModelVariable fmv : fmvs) {
			Node fmvNode = new SATFMLFormula(fmv).getNode() ;
			Set<String> fmvFts = fmv.features().names() ;
			Set<String> toNegates = Sets.difference(fts, fmvFts);
			Node nots = new Literal(NodeCreator.varTrue);
			for (String toNegate : toNegates) {
				nots = new And(nots, new Literal(toNegate, false));
			}
			
			fmvNode = new And(fmvNode, nots); 
			n = new Or(n, fmvNode); //.toCNF(); 
		}
		
		System.err.println("#" + fts.size());
		//n = n.toCNF() ;
		ImplicationGraph<String> ig = new SATFMLFormula(n).computeImplicationGraph(fts);
		ImplicationGraphUtil.debugImplicationGraph(ig);
		
		return new FeatureModelVariableSATFormula("", new SATFMLFormula(n)) ; 
	}

	private void treatTable(Element table, List<Catalog> catalogs) {
			// 1. get section name
 
			Elements sect2 = table.parents().select("h2"); // section.getElementsByTag("h2") ; 
			String s2 = null ; 			
			if (!sect2.isEmpty())
				s2 = sect2.first().text() ; // FIXME what about more than 1 ?
			
			String s3 = null ; 
			Elements sect3 = table.parents().select("h3") ;
			if (!sect3.isEmpty())
				s3 = sect3.first().text() ;
			
			String dt = null ; 
			Elements sectDT = table.parents().select("p") ;
			if (!sectDT.isEmpty()) {
				String contentDT = sectDT.first().text() ;
				if (contentDT.startsWith(";"))
					dt = contentDT.replaceAll(";", "") ;  
			}
					
					
			Elements caption = table.select("caption") ;
			String captionName = null ; 
			if (!caption.isEmpty()) 
				captionName = caption.first().text() ;
			
			// FIXME other forms of structural information 
			
			
			
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
			Catalog product = null ;
			Tree<String> structuralInformation = mkStructuralInformation (s2, s3, dt, captionName) ; 
			if (sortable) {
				product = treatRows (table.select("tbody").first(), structuralInformation, rHeaders, sortable);
			}
			else
			 	product = treatRows (table, structuralInformation, rHeaders, sortable);
			catalogs.add (product);
						
			// 
				
		
			// set the "ID" / names
			// clean up
			
			for (Catalog catalog : catalogs) {
				List<Product> toRemove = new ArrayList<Product>() ;
				for (Product p : catalog) {				
					Header primaryHeader = p.getHeaders().get(0);
					p.setName(p.getValue(primaryHeader.getName()));
					
					// some products are headers (each value equals to header name)
					List<Header> headers = p.getHeaders() ;
					boolean isHeader = true ; 
					for (Header header : headers) {
						String hName = header.getName() ;
						String pValue = p.getValue(hName) ;
						if (pValue == null)
							continue ; 
						if (!hName.contains(pValue)) {
							isHeader = false ; 
						}						
					}
					if (isHeader) {
						toRemove.add(p);
					}
				}
				if (!toRemove.isEmpty())
					catalog.removeAll(toRemove);
			}
			
		
		
	}

	private void treatSection(Element section, List<Catalog> catalogs) {
		
		// 1. get section name
		// FIXME what is it does not exist?
		// FIXME can be "h3"
		Elements sect2 = section.getElementsByTag("h2") ; 
		String s2 = null ; 
		
		if (!sect2.isEmpty())
			s2 = sect2.first().text() ; // FIXME what about more than 1 ?
		
		String s3 = null ; 
		Elements sect3 = section.getElementsByTag("h3") ;
		if (!sect3.isEmpty())
			s3 = sect3.first().text() ;
		
		String dt = null ; 
		Elements sectDT = section.getElementsByTag("p") ;
		if (!sectDT.isEmpty()) {
			String contentDT = sectDT.first().text() ;
			if (contentDT.startsWith(";"))
				dt = contentDT.replaceAll(";", "") ;  
		}
		
		

		// FIXME can be subsection
		
		
		// FIXME (1. optional step) some comments
		
		// 2. retrieve tabular
		Elements tables = section.getElementsByTag("table");
		//if (!tables.isEmpty()) 
			//System.err.println("\n****** " + s2 + " " + s3 + " *******\n");

		
		
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
			Catalog product = null ;
			Tree<String> structuralInformation = mkStructuralInformation (s2, s3, dt, captionName) ; 
			if (sortable) {
				product = treatRows (table.select("tbody").first(), structuralInformation, rHeaders, sortable);
			}
			else
			 	product = treatRows (table, structuralInformation, rHeaders, sortable);
			catalogs.add (product);
						
			// 
			
		}
		
	
		// set the "ID" / names
		// clean up
		for (Catalog catalog : catalogs) {
			for (Product p : catalog) {				
				Header primaryHeader = p.getHeaders().get(0);
				p.setName(p.getValue(primaryHeader.getName()));
			}
		}
		
		
	}

	// Catalog aka list of product
	// at this step, cell (I, J) corresponds to value of the J-th header of I-th product 
	private Catalog treatRows(Element table, Tree<String> structuralInformation, List<Header> rHeaders, boolean sortable) {
		int I = 0 ; 	
		Catalog product = new Catalog(structuralInformation, rHeaders) ; 
		for (Element row : table.select("tr")) {
           
			Elements lines ; 
			if (sortable) {
				lines = row.select("th"); // first entry is a header in sortable table
				lines.addAll(row.select("td"));
			}
			else {
				lines = row.select("td");
			}
			
			
			Product p = new Product ("product_" + I, structuralInformation, rHeaders);
			int J = 0 ; 
			for (Element line : lines) {
				p.add(J, line.text());
				J++ ; 
			}
			
			// necessarily a tr with a td
			if (!lines.isEmpty()) {
				if (sortable && (I == 0)) {
					// header (first entry) is not a product
				}
				else
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
					String hName = header.text() ; 
					Header headerV = new Header(hName); 
					Elements colspan = header.getElementsByAttribute("colspan");
					if (!colspan.isEmpty()) {
						headersWithNestedHeaders.add(headerV);
						int v = Integer.parseInt(colspan.first().attr("colspan"));
						headerV.setNumbersOfNestedHeaders(v) ; 
					}
					
	                headers.add(headerV);
	                
	            }
				levelHeader++ ; 
			}
			
			else if (levelHeader == 1) {
				// nested header
				List<Header> nHeaders = new ArrayList<Header>();
				for (Element header : row.select("th")) {
					String hName = header.text() ; 
					Header headerV = new Header(hName); 
	                nHeaders.add(headerV);
	            }
				nestedHeaders.add(nHeaders);
				levelHeader++ ; 
			}
			
		}
		
		// FIXME table.select("thead"); 
		
		// FIXME assign a "number" of appearance for headers 
		// especially important for nested headers (colspan="3")
		List<Header> rHeaders = new ArrayList<Header>() ; 
		List<Header> nHeaders = nestedHeaders.get(0); // FIXME 0 at the moment but normally it can be refined

		int lastIndex = 0 ; 
		for (Header header : headers) {
			// nested
			if (headersWithNestedHeaders.contains(header)) { // header has nested headers
				
				int nNestedHeaders = header.getNumbersOfNestedHeaders() ; // number of hested headers 
				
				// now associating an header to nested headers
				// nHeaders[lastIndex...lastIndex+nNestedHeaders]
				
				int v = 0;
				int u = 0 ; 
				for (Header nH : nHeaders) {
					if (u++ < lastIndex)
						continue ; 
					rHeaders.add(nH);	
					if (v < nNestedHeaders) {						
						header.addNestedHeader(nH);
						nH.addParentHeader(header);
						v++ ; 	
					}
					
				}
				lastIndex += nNestedHeaders ; 
				
			}
			else {
				rHeaders.add(header);
			}
			
		}
		//System.err.println("rHeaders=" + rHeaders);
		return rHeaders ; 
	}

	private Tree<String> mkStructuralInformation(String... fts) {
		boolean first = true ;
		Tree<String> t = null ;
		String lastFt = null ; 
		for (String ft : fts) {
			if (ft == null || ft.isEmpty())
				continue ; 
			if (first) {
				first = false ; 
				t = new Tree<String>(ft); 
				lastFt = ft ; 
			}
			else {
				t.addLeaf(lastFt, ft);
				lastFt = ft ; 
			}
		}
		
		return t ; 
 	}

}
