import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.lazy.LinkTargetException;

import fr.unice.polytech.modalis.familiar.operations.FMLMergerBDDSPLOT;
import fr.unice.polytech.modalis.familiar.operations.Mode;
import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariableBDDFormula;


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
		
		//FileUtils.writeStringToFile(new File ("comparisonsData.csv"), content.toString());
			
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
	public void testStatistics() throws Exception {
		
		
		
		List<Element> hrefs = new ArrayList<Element>() ; 
		_collectAllComparisonOf("/w/index.php?title=Special%3APrefixIndex&prefix=Comparison&namespace=0&hideredirects=1",  hrefs);

		Set<String> excludePCMs = new HashSet<String>(Arrays.asList(new String[] {
				// not relevant (and actually it does not parse)
				"Comparison_between_Esperanto_and_Ido", 
				"Comparison_between_Esperanto_and_Interlingua", 
				"Comparison_between_Esperanto_and_Novial", 
				"Comparison_between_Ido_and_Interlingua",
				"Comparison_between_Ido_and_Novial", 
				"Comparison_between_U.S._states_and_countries_by_GDP_(PPP)",
				"Comparison_of_ALGOL_68_and_C%2B%2B",
				"Comparison_of_Afrikaans_and_Dutch",
				"Comparison_of_Asian_national_space_programs",
				"Comparison_of_Axis_%26_Allies_games",
				
				"Comparison_of_C_Sharp_and_Visual_Basic_.NET", // no table !
				"Comparison_of_Chernobyl_and_other_radioactivity_releases", // no table !
				
				"Comparison_of_Home_Owners%27_and_Civic_Associations", // no table !
				
				"Comparison_of_IOC,_FIFA,_and_ISO_3166_country_codes", // limited interest
				
				"Comparison_of_Java_and_C%2B%2B", // limited interest (rather a qualitative comparison, based on natural language)
				
				"Comparison_of_MD_and_DO_in_the_United_States", // no table and interest ! 
				
				"Comparison_of_Norwegian_Bokm%C3%A5l_and_Standard_Danish", // limited interest
				
				"Comparison_of_Portuguese_and_Spanish", // limited interest (pattern: comparison of "languages" being Esperanto, Norwe., Spanish, etc.)
				
				"Comparison_of_privilege_authorization_features", // no table  (rather a qualitative comparison, based on natural language)
				
				"Comparison_of_the_Hare_and_Droop_quotas", // limited interest
				
				"Comparison_of_the_imperial_and_US_customary_measurement_systems", // out of the scope  
				
				
				// due to the current status of the parser
				// FIXME
				"Comparison_of_Android_e-book_reader_software",
				"Comparison_of_Exchange_ActiveSync_clients",
				"Comparison_of_Linux_distributions",
				"Comparison_of_Symbian_devices",
				"Comparison_of_browser_synchronizers",
				"Comparison_of_business_integration_software",
				"Comparison_of_consumer_brain%E2%80%93computer_interfaces",
				"Comparison_of_domestic_robots",
				"Comparison_of_e-book_formats",
				"Comparison_of_e-book_readers",
				"Comparison_of_file_hosting_services",
				"Comparison_of_layout_engines_(Cascading_Style_Sheets)",
				"Comparison_of_layout_engines_(MathML)",
				"Comparison_of_machine_translation_applications",
				"Comparison_of_mobile_operating_systems",
				"Comparison_of_network_diagram_software",
				"Comparison_of_numerical_analysis_software",
				"Comparison_of_statistics_journals",
				"Comparison_of_text_editors",
				"Comparison_of_web_server_software",
				
				// limited interest IMO 
				"Comparison_of_United_States_presidential_candidates,_2008",
				"Comparison_of_World_War_I_tanks",
				"Comparison_of_programming_languages_(object-oriented_programming)",
				"Comparison_of_programming_languages_(string_functions)",
				
				
				
		}));
	
		int j = 0 ; // j-th comparison 
		int nRelevant = 0 ; 
		for (Element href : hrefs) {
			String hURL = href.attr("href") ;
			int n = "/wiki/".length() ; 
			String wikiPageName = hURL.substring(n);
			System.err.println("(" + j++ + ") " + wikiPageName);
			
			if (excludePCMs.contains(wikiPageName)) {
				System.err.println("Ignoring");
				continue ; 
			}
			
			
			PCMStatistic stat = computeStatistic (wikiPageName);
			
			// we exploit here the stats by printing 
			
			int nTable = stat.getNumbersOfTables() ; 
			System.err.println("numbers of tables:" + nTable);
			
			if (nTable > 0)
				nRelevant++ ; 
			
			Collection<CatalogStat> catalogStats = stat.getCatalogStats() ;
			int i = 1 ;
			for (CatalogStat catalogStat : catalogStats) {
				System.err.println("table(" + i + ")");
				System.err.println("#headers=" + catalogStat.getNumbersOfHeaders());
				System.err.println("#products=" + catalogStat.getNumbersOfProduct());
			}
			System.err.println("\n\n\n"); 
			
		}
		
		System.err.println("number of relevant PCMs: " + nRelevant);
		
		
	//	String wikiPageName = "Comparison_of_Java_virtual_machines"; 
		
		
		
		
	
		
	}
	

	private PCMStatistic computeStatistic (String wikiPageName) throws Exception {
		WikiPageContentExtractor wikipediaExtractor = new WikiPageContentExtractor() ;
		
		String content = wikipediaExtractor.getContent(wikiPageName) ;
		
		assertNotNull(content);
		FileUtils.writeStringToFile(new File("output/" + wikiPageName + ".wikipedia"), content);
		//System.err.println("content = " + content);
		
		WikiTabularExtractor wikiTabExtractor = new WikiTabularExtractor() ;
		
		//content = "'''Video converters''' are [[computer program]]s" ; 
		String htmlContent = wikiTabExtractor.run(content, "" + wikiPageName);
		
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

		Collection<CatalogStat> catalogStats = new ArrayList<CatalogStat>() ; 
		for (Catalog catalog : catalogs) {
			int nHeaders = catalog.getHeaders().size() ; 
			int nProduct = catalog.size() ; 
			catalogStats.add(new CatalogStat(nHeaders, nProduct));
			
		}
		
		int nTable = catalogs.size() ; 
		
		return new PCMStatistic( 
				nTable,	
				catalogStats
				);
		
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
		FeatureModelVariable fmMerged = //new FMLMergerDisjunctiveSAT(fmvs).union();
				 // new FMLMergerBDDSPLOT(fmvs, _builder).union() ; 
					new FeatureModelVariableBDDFormula("", new FMLMergerBDDSPLOT(fmvs, _builder).calculateFormula(Mode.Union), _builder); 
		//System.err.println("#IG " + fmMerged.computeImplicationGraph().edges().size()); 
		//System.err.println("fmMerged = " + fmMerged);
		
		
		//System.err.println("doc=" + sections);
		//System.err.println("doc=" + doc.getElementsByTag("title"));
		//System.err.println("doc=" + doc.title());
		
		
		
		
		
		
		
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
				if (!toRemove.isEmpty() && !catalog.isEmpty())
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
