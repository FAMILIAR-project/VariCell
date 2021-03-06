import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.xtext.example.mydsl.fML.FMFormat;

import z3.TseitinTransformationDisjunctive;
import fr.unice.polytech.modalis.familiar.experimental.KSynthesisConfiguration;
import fr.unice.polytech.modalis.familiar.operations.AggregatorFM;
import fr.unice.polytech.modalis.familiar.operations.ExpressionUtility;
import fr.unice.polytech.modalis.familiar.operations.FMLMergerBDD;
import fr.unice.polytech.modalis.familiar.operations.FMLMergerDisjunctiveSAT;
import fr.unice.polytech.modalis.familiar.operations.featureide.SATFMLFormula;
import fr.unice.polytech.modalis.familiar.parser.FMBuilder;
import fr.unice.polytech.modalis.familiar.parser.MyExpressionParser;
import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.featureide.FeatureModelVariableSATFormula;
import gsd.graph.ImplicationGraph;
import gsd.graph.SimpleEdge;
import gsd.graph.TransitiveReduction;
import gsd.synthesis.Expression;
import gsd.synthesis.Formula;


public class ExtractorContentTest extends FMLTest {
	
	
	
	public static String OUTPUT_DIRECTORY = "outputFML/wikipedia-comparison-tables/" ; 
	
	public static String URL_BASE_NAME = "http://en.wikipedia.org" ; 
	
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
			"Comparison_of_TeX_editors",
			// limited interest IMO 
			"Comparison_of_United_States_presidential_candidates,_2008",
			"Comparison_of_World_War_I_tanks",
			"Comparison_of_programming_languages_(object-oriented_programming)",
			"Comparison_of_programming_languages_(string_functions)",
			
			
			
	}));
	
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
				System.err.println("table(" + i++ + ")");
				System.err.println("#headers=" + catalogStat.getNumbersOfHeaders());
				System.err.println("#products=" + catalogStat.getNumbersOfProduct());
			}
			System.err.println("\n\n\n"); 
			
		}
		
		System.err.println("number of relevant PCMs: " + nRelevant);
		
		
	//	String wikiPageName = "Comparison_of_Java_virtual_machines"; 
		
		
		
		
	
		
	}
	
	@Test
	public void testQuantitativeStats() throws Exception {
		
		
		
		List<Element> hrefs = new ArrayList<Element>() ; 
		_collectAllComparisonOf("/w/index.php?title=Special%3APrefixIndex&prefix=Comparison&namespace=0&hideredirects=1",  hrefs);

	
	
		int j = 0 ; // j-th comparison 
		int nRelevant = 0 ; 
		
		
		int nHeaders = 0 ; 
		int nProducts = 0 ; 
		//int nUncertains = 0 ;
		int nBooleanValues = 0 ; 
		int nEmpty = 0 ; 
		int nTotalValues = 0 ; 
		
		int nMultiValues = 0 ;
		int nSingleValues = 0 ;
		int nUnknowns = 0 ; 
		int nConstrains = 0 ; 
		
		for (Element href : hrefs) { // for each page
			String hURL = href.attr("href") ;
			int n = "/wiki/".length() ; 
			String wikiPageName = hURL.substring(n);
			System.err.println("(" + j++ + ") " + wikiPageName);
			
			if (excludePCMs.contains(wikiPageName)) {
				System.err.println("Ignoring");
				continue ; 
			}
			
			
			PCMStatistic stat = computeStatistic (wikiPageName);
			int nTable = stat.getNumbersOfTables() ; 
			System.err.println("numbers of tables:" + nTable);
			
			if (nTable > 0)
				nRelevant++ ; 
			
			//analyzeStat (stat);
			
			Collection<CatalogStat> catalogStats = stat.getCatalogStats() ;
			
			
			for (CatalogStat catalogStat : catalogStats) { // for each table
				// System.err.println("table(" + i++ + ")");
				nHeaders += catalogStat.getNumbersOfHeaders() ;
				nProducts += catalogStat.getNumbersOfProduct() ;
				//nUncertains += catalogStat.getnUncertains() ; 
				nBooleanValues += catalogStat.getnBooleans();
				nEmpty += catalogStat.getnEmpty();
				nMultiValues += catalogStat.getnMultiValues();
				nSingleValues += catalogStat.getnSingleV() ; 
				nUnknowns += catalogStat.getnUnknowns() ; 
				nConstrains += catalogStat.getnConstrained() ; 
				
				int lHeaders = catalogStat.getNumbersOfHeaders()  ; 
				int lProducts = catalogStat.getNumbersOfProduct() ; 
				nTotalValues += (lHeaders * lProducts) - (lHeaders + lProducts); // effective values 
				
				nSingleValues -= lHeaders + lProducts ; // not cell values but headers or product names
				
				// 1 pattern
				 
				
			}
			
			System.err.println("#headers=" + nHeaders);
			System.err.println("#products=" + nProducts);
			
			System.err.println("#nBooleanValues(1)=" + nBooleanValues);
			System.err.println("#nSingleValues(3)=" + nSingleValues);
			System.err.println("#nMultiValues(4)=" + nMultiValues);
			//System.err.println("#nUncertains()=" + nUncertains);
			
			System.err.println("#nEmpty(6)=" + nEmpty);
		
			System.err.println("#nUnknowns(5)="+ nUnknowns);
			System.err.println("#nConstrains(2)="+ nConstrains);
			System.err.println("\n\n\n"); 
			System.err.println("#nTotalValues=" + nTotalValues);
			System.err.println("#nTotalValues (bis)=" + (nBooleanValues + nSingleValues + nMultiValues + nEmpty + nUnknowns + nConstrains));
			
			
			
		}
		
		System.err.println("number of relevant PCMs: " + nRelevant);
		
		
	//	String wikiPageName = "Comparison_of_Java_virtual_machines"; 
		
		
		
		
	
		
	}
	
	private void analyzeStat(PCMStatistic stat) {
		// we exploit here the stats by printing 
		
			
			
			Collection<CatalogStat> catalogStats = stat.getCatalogStats() ;
			int i = 1 ;
			int nHeaders = 0 ; 
			int nProducts = 0 ; 
			//int nUncertains = 0 ;
			int nBooleanValues = 0 ; 
			int nEmpty = 0 ; 
			int nTotalValues = 0 ; 
			
			int nMultiValues = 0 ;
			int nSingleValues = 0 ;
			int nUnknowns = 0 ; 
			int nConstrains = 0 ; 
			
			for (CatalogStat catalogStat : catalogStats) { // for each table
				// System.err.println("table(" + i++ + ")");
				nHeaders += catalogStat.getNumbersOfHeaders() ;
				nProducts += catalogStat.getNumbersOfProduct() ;
				//nUncertains += catalogStat.getnUncertains() ; 
				nBooleanValues += catalogStat.getnBooleans();
				nEmpty += catalogStat.getnEmpty();
				nMultiValues += catalogStat.getnMultiValues();
				nSingleValues += catalogStat.getnSingleV() ; 
				nUnknowns += catalogStat.getnUnknowns() ; 
				nConstrains += catalogStat.getnConstrained() ; 
				
				int lHeaders = catalogStat.getNumbersOfHeaders()  ; 
				int lProducts = catalogStat.getNumbersOfProduct() ; 
				nTotalValues += lHeaders * lProducts ; 
				
				
				// 1 pattern
				 
				
			}
			
			System.err.println("#headers=" + nHeaders);
			System.err.println("#products=" + nProducts);
			
			System.err.println("#nBooleanValues(1)=" + nBooleanValues);
			System.err.println("#nSingleValues(3)=" + nSingleValues);
			System.err.println("#nMultiValues(4)=" + nMultiValues);
			//System.err.println("#nUncertains()=" + nUncertains);
			
			System.err.println("#nEmpty(6)=" + nEmpty);
		
			System.err.println("#nUnknowns(5)="+ nUnknowns);
			System.err.println("#nConstrains(2)="+ nConstrains);
			System.err.println("\n\n\n"); 
			System.err.println("#nTotalValues=" + nTotalValues);
		
	}

	@Test
	public void testAdobe() throws Exception {
		PCMStatistic stat = computeStatistic("Comparison_of_Adobe_Flex_charts");
		analyzeStat(stat);
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
			CatalogStat catalogStat = new CatalogStat();
			catalogStat.setNHeaders(nHeaders);
			catalogStat.setNProduct(nProduct);
			
			// analyze each product and all values
			int nUncertain = 0 ; 
			int nBoolean = 0 ;
			int nEmpty = 0 ; 
			int nMulti = 0 ; 
			int nSingleV = 0 ;
			int nUnknowns = 0 ;
			int nConstrained = 0 ; 
			
			for (Product product : catalog) {
				Collection<String> values = product.getAllValues() ;
				for (String val : values) {
					if (VariabilityPatternsUtils.isUncertain(val)) {
						nUncertain++ ; 
					}
					
					else if (VariabilityPatternsUtils.isYes(val) || 
							VariabilityPatternsUtils.isNot(val)
							) { // pattern #1
						nBoolean++ ; 
					}
					else if (VariabilityPatternsUtils.isBlanked(val)) { // pattern #6
						nEmpty++ ; 
					}
					else if (VariabilityPatternsUtils.isMultiValues(val)) { // pattern #4
						nMulti++ ; 
					}
					else if (VariabilityPatternsUtils.isUnknowns(val)) { // pattern #5
						nUnknowns++ ; 
					}
					else if (VariabilityPatternsUtils.isConstrained(val)) { // pattern #2
						nConstrained++ ; 
					}
					else { // pattern #3
						nSingleV++ ; 
					}
				}
				
			}
			
			catalogStat.setnConstrained(nConstrained);
			catalogStat.setnUnknowns(nUnknowns);
			catalogStat.setnSingleV(nSingleV);
			catalogStat.setnMultiValues(nMulti) ; 
			catalogStat.setnEmpty(nEmpty);
			catalogStat.setnBooleans(nBoolean);
			catalogStat.setnUncertains(nUncertain);			
			catalogStats.add(catalogStat);
			
		}
		
		int nTable = catalogs.size() ; 
		
		return new PCMStatistic( 
				nTable,	
				catalogStats
				);
		
	}

	@Test
	public void test() throws Exception {
		
		
		final String[] _EMPTY = new String[]{};
		
		String wikiPageName = "Comparison_of_Java_virtual_machines"; 
		//"Comparison_of_free_web_hosting_services"; 
		//"Comparison_of_free_and_open-source_software_licenses" ;  
		//"Comparison_of_file_systems" ;
		//"Comparison_of_Subversion_clients"; 
		//"Comparison_of_Prolog_implementations" ;    
		//"Comparison_of_BitTorrent_clients" ; 
					 //"Comparison_of_FTP_client_software" ; 
					 //"Comparison_of_hardware_random_number_generators" ; //"Comparison_of_image_formats" ; //"Comparison_of_video_editing_software" ; // "Comparison_of_video_codecs" ; //"Comparison_of_container_formats" ; 
					 //"Comparison_of_video_converters" ;
				     
		
		/*
		 * Scoping directives here
		 */
		
		_shell.setVerbose(false);
		
		/****
		 * DONE 
		 */
		
		
		
		String[] excludeColumnNames = { "Latest supported Java version", "Other", "Status", "Latest release date", "Latest stable version", "First public release", "Creator", "Name" }  ; // {} ; 
		String[] excludeProductNames =  { "IKVM.NET" } ; 		
		postTreatFM (
				executeWikipediaToFML("Comparison_of_Java_virtual_machines", excludeColumnNames, excludeProductNames, new String[] {}),
				new String[] {"Under development", "Preliminary ARMv5 support", "On Jailbroken iPhone", "Port", "With third-party patches", "Java true.6"}
				);

		postTreatFM (
		executeWikipediaToFML("Comparison_of_SSH_clients", new String[]{"Name", 
				"iPhone,{{Noteiphone}} iPod Touch, iPad", "Based on", "Latest release", "Status", "First release", "Developer", "Compromised by the NSA <ref>...</ref>"
		, 
		"Port forwarding", "SOCKS{{NoteSOCKS}}", "VPN{{NoteVPN}}", "Port forwarding", "SOCKS{{NoteSOCKS}}", "VPN{{NoteVPN}}", "Session multiplexing{{Notemux}}", "Kerberos", "IPv6", "Terminal", "SFTP/SCP", "Proxy client{{NoteconnectViaProxy}}"
		}, 
				new String[]{}, new String[] {"Features"}),
				new String[] {"Port forwarding"}
				); 
				
		postTreatFM (executeWikipediaToFML("Comparison_of_audio_synthesis_environments", new String[] {
				"Primary Purpose(s)", "Most recent update", "First release date", "Cost", "Creator", "Most recent version", "Name",
				"Other technical features", "Programming (plugin) API language(s)" // due to problem with multi-features
		}, _EMPTY, new String[] {"Data interface methods"}), _EMPTY, new String[] {
			"Programming language features", "General", "Technical"
		});
	
		postTreatFM (executeWikipediaToFML("Comparison_of_HTML_editors",  
				
				 new String[] {
				"Website", "Editor", "Creator", "Version", "Cost (USD)", "XHTML"
				}
				, new String[] {
			"Maqetta", "Brackets", 
		},
				new String[] {
				"HTML/XHTML specification support"
		}), _EMPTY);
		
		
		postTreatFM (
		executeWikipediaToFML("Comparison_of_photo_gallery_software", new String[] {
				"Name"
		}		, _EMPTY, new String[] {
		
			"Desktop applications"	
		}), 
		_EMPTY)	;
		
		postTreatFM (
		executeWikipediaToFML("Comparison_of_Internet_Relay_Chat_clients", new String[] {"Primary developers", "Client"
				
		},
				_EMPTY, new String[] {
				"Release history"
		}),
		_EMPTY) ;
		
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_YouTube_downloaders", _EMPTY, _EMPTY, _EMPTY), 
		_EMPTY);
		
		
		// 8. 
		postTreatFM(
		executeWikipediaToFML("Comparison_of_file_comparison_tools", 
				new String[] {"Name", "Other platforms", "Creator", "Cost", "First public release date", "Year of latest stable version", "Max Supported File Size" }, 
				_EMPTY, _EMPTY),
		new String[] {"both", "Both"});
		
		
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_iOS_e-book_reader_software", new String[] {"Product", "total # of formats"}, 
				_EMPTY, new String[] {"Special features"}),
				new String[] {"as of v2.0", "Unlimited"});
				
		postTreatFM(
		executeWikipediaToFML("Comparison_of_iPod_managers", 
				new String[] {"Manager", "Creator(s)", "First public release date", "Latest stable version"}, _EMPTY, _EMPTY),
				new String[] {"", ""}
				);
				
		
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_image_viewers", 
				new String[] {"Name", "other / special", "Program", "View functions", "Other functions 3", "Price", "Comic book"}, _EMPTY, _EMPTY),
				new String[] {"", ""}
				);
				
				
		
		
		// 12.
		postTreatFM(
		executeWikipediaToFML("Comparison_of_mobile_Internet_Relay_Chat_clients", 
				new String[] {"Client", "Primary developers", "Website"}, _EMPTY, new String[] {"Release history"}),
				new String[] {"", ""}
				);
				
				
				
		// 13.
		Map<String, String> renamings = new HashMap<String, String>() ; 
		renamings.put("See also", "Comparison_of_help_desk_issue_tracking_software");
		postTreatFM(
		executeWikipediaToFML("Comparison_of_help_desk_issue_tracking_software", 
				new String[] {"System", "Creator", "Launch Date"}, _EMPTY, _EMPTY, renamings),
				new String[] {""}, 
				new String[] {"License", "Back end", "Implementation language(s)"}
				);
		
		
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_relational_database_management_systems", new String[] {
				"Maintainer", "First public release date", "Latest stable version", "Latest release date",
		}, 
				_EMPTY, new String[] {"Limits", "Data types"}),
				new String[] {""}
				);
		
		
		
			
		// 15.
		postTreatFM(
		 executeWikipediaToFML("Comparison_of_project_management_software", new String[] {"Software"}, _EMPTY, _EMPTY),
				new String[] {"unk", "Programming Language"}, 
				new String[] {"License", "Programming language"}
				);
		
		
	
				
		

	
		
	    // 18.
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_open-source_operating_systems", 
				new String[] {"Name", "Kernel type",  "Oldest non-EOL version{{Notea1}}", "Kernel thread support", "Forks", 
				"other special file system features", "Others", "other"
				}
				
				, _EMPTY, _EMPTY),
				_EMPTY)
				;
						
		
		// 19.		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_remote_desktop_software", new String[] {"Software", "Creator", 
				"First public release date", "Latest stable version", "Maximum simultaneous connections",		
		}, _EMPTY, _EMPTY),
		_EMPTY)
		;
		
		
		// 20. 
		postTreatFM(
		executeWikipediaToFML("Comparison_of_video_converters", new String[]{
				"Developer", "Video converter", "Website", "Input"
		}, _EMPTY, _EMPTY),
		_EMPTY)
		; 
		
		// 21.
		postTreatFM(
		executeWikipediaToFML("Comparison_of_Subversion_clients", new String[] {"Current version", "Last release date", 
				"Name"}, _EMPTY, new String[] {"Standalone Subversion clients comparison table"})
		,
		_EMPTY)
		; 
			
		
		// 22. (not very satisfied with the quality)
		postTreatFM(
				executeWikipediaToFML("Comparison_of_audio_formats", new String[] {"Codec", "Audio compression format", "Creator",
				"First public release date", "Latest stable version", "Sample Rate", "Bit Rate", "Bit rate", "Latency", 
				"Bits per sample", "Algorithm"		
				}, _EMPTY, new String[] {"Technical details"}),
				_EMPTY,
				_EMPTY)
				// new String[] {"General information"})
				;
				
				
		// 23
		postTreatFM( executeWikipediaToFML("Comparison_of_documentation_generators", new String[]
				{"Name", "", "Creator", "First public release date", "Latest stable version", "Other features"}
				, _EMPTY, _EMPTY),
				new String[]{"with Plugin2"}, 
				new String[]{"Software license"})
				;
	
				
				
		// 24. 
		postTreatFM( 
		executeWikipediaToFML("Comparison_of_desktop_publishing_software", new String[] {
				"Desktop publishing software", "Developer(s)", "Latest stable version", "Initial release", "Other"
		}, _EMPTY, new String[] {
				"Output format"
		}), 
		new String[] {"supported versions<11", "supported versions<7", "supported versions<8"}
				);	
		
		
		
	
		
		
		
		// 17.
		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_reference_management_software", new String[] {"Software",
				"Developer", "First public release", "Latest stable version", "Cost (USD)", "Notes", "Other",
				"RTF scan<ref ...>...</ref>", 
		}, _EMPTY, new String[] {"Import file formats"}),
		_EMPTY
				); 
		
	
				
		// 26
		postTreatFM(
			executeWikipediaToFML("Comparison_of_enterprise_bookmarking_platforms", new String[]{"Notes",
			"Latest stable release", "Developed by", "Software"		
			}, _EMPTY, _EMPTY),
			_EMPTY); 
		

        // 27
		postTreatFM(
				executeWikipediaToFML("Comparison_of_file_managers", new String[] {"First public version (date)",
						"Latest stable version (date, number)", "Content dependent <ref ...>...</ref>", "File manager", "File Manager", "Creator"	
				
				}, _EMPTY, _EMPTY), new String[]{"Plugin", "With helper apps", "Needs [[POSIX]]-compliant platform POSIX", 
				"Needs [[KDE]] KDE",
				"Needs [[X Window System|X]]X"});

		// 28
		postTreatFM(
					executeWikipediaToFML("Comparison_of_disk_encryption_software", new String[] {"Name",
								"Encryption", "Developer", "First released", 
						
				}, _EMPTY, _EMPTY), new String[]{"Last update to web site 2009-07-02"}); 
				
		// 16.
				postTreatFM(
				executeWikipediaToFML("Comparison_of_mail_servers", new String[] {"Other" }, _EMPTY, _EMPTY),
				new String[] {"zzzzzUsers", "zzzzzFeatures", "zzzzzStorage", "zzzzzServer OS support", "V 5.0", "with patch"}
						);
						
						
		
		// 25
		
		postTreatFM( 
		executeWikipediaToFML("Comparison_of_genealogy_software", new String[] {"", "Software", "Name", "Latest version", "Latest release"}, _EMPTY, _EMPTY),
		new String[] {"Winebbb", "Javaaaa", "(v4.x/5.x)", "(v4.x)", "(v5.x)", " public<br />test"})
		;
				
				
				
	
		
		// 29. 		
		postTreatFM(
		executeWikipediaToFML("Comparison_of_Internet_forum_software", new String[] {
			"Creator", "Latest release date", "Current stable version", ""	 
		},
				_EMPTY, _EMPTY), new String[] {"Planned (Version 8.0)", "Planned", "Full", "Session", "Plugin"});
				
		
		
		// 30.
		postTreatFM(
		executeWikipediaToFML("Comparison_of_SSH_servers", new String[] {"Name", "Last release date", "iOS: iPhone,{{Noteiphone}} iPod Touch"
		, "Official web page", "Developer", 		"Last release", "First release date"
		}, 
				_EMPTY, _EMPTY), 
		_EMPTY); 
				
				
				// have to FIX it 
				//executeWikipediaToFML("Comparison_of_Linux_distributions", _EMPTY, _EMPTY, _EMPTY);
				
				
				// have to fix it
				/*
				executeWikipediaToFML("Comparison_of_operating_systems", new String[] {
						"Latest stable version", "Latest release date", "First public release"
				}, 
						
						_EMPTY,
						
						_EMPTY);*/
		
		
		
		
		/****
		 * 
		 * END (done)
		 * 
		 */
		
		
		
		/**
		 * TODO
		 */
		

		/* should be easy
		postTreatFM(
				executeWikipediaToFML("Comparison_of_disc_authoring_software", _EMPTY, _EMPTY, _EMPTY), 
				_EMPTY); */
		
		/*	problem with sections	
		postTreatFM( executeWikipediaToFML("Comparison_of_file_archivers", new String[] {
				"Creator(s)", "First public release date", "Latest stable version", "", 
				"Unicode file / directory names{{unicode-names5}}"
		}, _EMPTY, new String[] {"Writing"}), 
				new String[]{"unk", "some formats", "Separate"}); */
				
		// TODO interesting have to hack here
				/*
				postTreatFM(
				executeWikipediaToFML("Comparison_of_instant_messaging_clients", new String[] {"Author, creator", "Latest stable version", "First public release"}, new String[] {
						"XMPP-related features", "Features",  "Features", "General information", "Protocol support"
				}, _EMPTY),
				_EMPTY)
				;*/
		// TODO FIXME (scoping) 
		/*
				postTreatFM( 
				executeWikipediaToFML("Comparison_of_download_managers", new String[] {"Latest stable release",
						"Adware, Malware & Spyware<ref ...>...</ref>"
						
						
				}, _EMPTY, _EMPTY),
				_EMPTY)
				;*/
		
		/* may be fixed
		postTreatFM( 
		executeWikipediaToFML("Comparison_of_email_clients", new String[] {"Client", "Creator",
		"TLS?{{NoteIMAPPOP}}", "TLS?{{NoteIMAPPOP}}", "TLS?{{NoteIMAPPOP}}", "forced recode {{Noterecode}}", 
		"MD5 APOP?{{NoteAPOP}}", "OCSP?{{NoteOCSP}}", "" 
		
		}, _EMPTY, new String[] {
					"Release history"	
				}), _EMPTY);*/
		/*
		postTreatFM( 
				executeWikipediaToFML("Comparison_of_document_markup_languages", new String[] {"Language", "Creator", "First public release date", "Editor"}, 
						
						_EMPTY, _EMPTY), 
				_EMPTY
				);*/
		
		/* 3 for free 
		postTreatFM(
				executeWikipediaToFML("Comparison_of_desktop_application_launchers", new String[]{"Creator",
				"Latest stable version", "Latest release date", ""		
				}, _EMPTY, new String[] {"Linux"}),
				_EMPTY);*/
		
		/**
		 * 
		 * end (TODO)
		 * 
		 */
		
		
		
		/**
		 * 
		 * EXOTIC
		 * 
		 */
		
		// too poor
		/*
				postTreatFM( 
				executeWikipediaToFML("Comparison_of_geographic_information_systems_software", new String[] {"GIS software"}, _EMPTY, 
						new String[]{"Mobile clients", "Pure web client", "Pure server"}
						), _EMPTY);*/
		
		// hack due to parsers :( 
		/*postTreatFM(
		 executeWikipediaToFML("Comparison_of_behavioral_experiment_software", new String[] {"Name"}, _EMPTY, _EMPTY), 
		 _EMPTY);*/
		

		// exostic
		/*
		postTreatFM(
		executeWikipediaToFML("Comparison_of_birth_control_methods", _EMPTY, _EMPTY, _EMPTY),
		_EMPTY);*/
		
		// exotic and poorly structured
				/*
				postTreatFM(		
				executeWikipediaToFML("Comparison of accounting software", _EMPTY, _EMPTY, new String[] {
						"Proprietary software", "Latest stable version", "Latest release date", "Stable release date"
				}),
				new String[] {""}
				);*/
		
		/* difficult to hack the sections
		postTreatFM(
		executeWikipediaToFML("Comparison_of_open-source_software_hosting_facilities", new String[] {"Users", "Established",
				"Projects", "Prominent projects", "Name"
		}, _EMPTY, new String[] {"Popularity"}),
		_EMPTY)
		;
		*/
		
	
		
		/* rather poor
		postTreatFM(			
		executeWikipediaToFML("Comparison_of_webmail_providers", 
				new String[]{
				//"Product", "Service name", "Owner", "Release", "Attachment limit",
		//"Language support", "URL"
		}, 
				new String[]{
				//"Alternative Fuse"
				}, 
				
				new String[] {"General information", "Language support", "Unique features"}), _EMPTY);
		
		*/
		
		/* BENCHMARK
		postTreatFM(
		executeWikipediaToFML("Comparison_of_Android_devices", new String[] {
				"Android version", "Name", "Maker", "GPU", "chipset", "Capacities", "Camera(s)", "Special?features"
		}, _EMPTY, new String[] {
				//"Unofficial and community ports", 
				//"Officially released",
				//"Future", 
				
		}), _EMPTY);*/
		
		
		
		/* poor and structure hard to parse
		postTreatFM(
		executeWikipediaToFML("Comparison_of_BSD_operating_systems", new String[] {
				"First public release", 
				"Version", 
				"First release date"
		}, _EMPTY, _EMPTY),
		_EMPTY);*/
		
		
		
		
	
		/**
		 *  END (exostic)
		 * 
		 */
		
	
		

	
		
		
		/*
		 * OK
		 * Poorly structured (Linux, Windows, ..., editors...) 
		 * -- note that there are ordered (implicit hierarchy in the order IMO) 
		executeWikipediaToFML("Comparison_of_XML_editors", 
				new String[]{"Name", "Version", "Price for commercial version (exc. VAT)"}, 
				_EMPTY, _EMPTY);
				*/
				
		
			
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		// have to fix it
		// executeWikipediaToFML("Comparison of audio player software", _EMPTY, _EMPTY, _EMPTY);
		

		
		// executeWikipediaToFML("Comparison_of_boot_loaders", _EMPTY, _EMPTY, _EMPTY);
		
		// executeWikipediaToFML("Comparison_of_brainwave_entrainment_software", _EMPTY, _EMPTY, _EMPTY);
		
		// FIXIT
		//executeWikipediaToFML("Comparison of business integration software ", _EMPTY, _EMPTY, _EMPTY);
		
		// scope and some directives (OR / XOR)
		// executeWikipediaToFML("Comparison_of_BPEL_engines", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison of chess video games", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison_of_code_generation_tools", _EMPTY, _EMPTY, _EMPTY);
		
		// executeWikipediaToFML("Comparison_of_command_shells", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison_of_continuous_integration_software", _EMPTY, _EMPTY, _EMPTY);
		
		// executeWikipediaToFML("Comparison_of_data_modeling_tools", _EMPTY, _EMPTY, _EMPTY);
		
		// have to fix executeWikipediaToFML("Comparison of database tools", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison of debuggers", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison_of_defragmentation_software", _EMPTY, _EMPTY, _EMPTY);
		
		// executeWikipediaToFML("Comparison_of_dental_practice_management_software", _EMPTY, _EMPTY, _EMPTY);
		
	
		
		//executeWikipediaToFML("Comparison_of_development_estimation_software", _EMPTY, _EMPTY, _EMPTY);
		
		//executeWikipediaToFML("Comparison_of_digital_audio_editors", _EMPTY, _EMPTY, _EMPTY);

		
		
		//executeWikipediaToFML("Comparison_of_file_verification_software", new String[] {"Developer", "First public release", "Latest stable date (version)"}, _EMPTY, _EMPTY);
		
		// FIXME executeWikipediaToFML("Comparison of free and open-source software licenses ", _EMPTY, _EMPTY, _EMPTY);
		
		
		
		// exotic actually: I would give up
		/*
		executeWikipediaToFML("Comparison_of_container_formats", _EMPTY, 
				_EMPTY, 
				new String[] {
				"Caption (Subtitle) formats supported"
		});*/
		
		
		/*FIXME
		 * executeWikipediaToFML("Comparison of hex editors ", new String[] {
				"Cost", "Latest version", "Latest release date"
		}, _EMPTY, _EMPTY);*/
		
		
		
		
		
		// does not scale
		/*
		executeWikipediaToFML("Comparison_of_issue-tracking_systems", 
				new String[] {"Launch Date", "Refs", "Creator"}, // "System", 
				_EMPTY, _EMPTY);*/
		
	
		
		
	
		
		
		// TODO http://en.wikipedia.org/wiki/Comparison_of_revision_control_software
		
		
		// Comparison of regular expression engines : exostic
		
		// http://en.wikipedia.org/wiki/Comparison_of_mobile_operating_systems exotic
		// Comparison of mobile phone standards technical, poor, exotic
		// Comparison of movie cameras  bench style
		// Comparison of online backup services limited and bench style
		// Comparison of online music stores flattened 
		// Comparison of massively multiplayer online role-playing games  benchmark like
		// Comparison of memory cards bench like
		// Comparison of metadata editors (exotic) 
		// Comparison of management accounting and financial accounting plain texte
		// Comparison of lightweight web servers erroneous
		// Comparison of macro recorder software very poor
		// Comparison of karate styles  plain text
		// Comparison of layout engines (Cascading Style Sheets) (bench style)
		// Comparison of layout engines (Document Object Model) same as above
		// http://en.wikipedia.org/wiki/Comparison_of_integrated_development_environments exotic
		// Comparison of instant messaging protocols : poor content/structure
		// Comparison of iSCSI targets (too poor)
		// Comparison of high definition optical disc formats : poor
		// Comparison of hub gears bench style
		// Comparison of hardware random number generators  pure text and poor
		// Comparison of graphics file formats poor and poorly structured
		// Comparison of free web hosting services very bof
		// Comparison of file sharing applications  very pooor
		// Comparison of file synchronization software very poor
		
		// Comparison of free credit report websites : very poor
		// Comparison of free software eCommerce web application frameworks  : very very poor
		// Comparison of firewalls very pooor
		// very poor Comparison of file hosting services 
		
		// Comparison of feed aggregators (seems that the data are really "in progress" lots of blanked cells)
		
		// Comparison of executable file formats (very poor)
				// Comparison of facial image datasets (too poor)
		
		// Comparison of early HTML editors very poor
		// Comparison of eDonkey software (exotic structure)
		
		// Comparison of e-book readers (benchmark)
		// Comparison of e-book formats (plain text)
		// Comparison of dosimeters benchmark style 
		// Comparison of domestic robots exotic and very poor
		// Comparison of data serialization formats : too poor
		// Comparison of database access : too poor
		
		
		// Comparison of crowd funding services very pooor
		// Comparison of cryptographic hash functions too technical with numerics values
		// Comparison of dance video games too poor
		
		// Comparison of cognitive architectures : very incomplete
		
		// can be fixed: Comparison of cluster software but rather poor
		
		// Comparison of X Window System desktop environments : exotic
		// Comparison of antivirus software : exotic but can be adapted 
		// Comparison of archive formats : poor
		// Comparison of browser synchronizers : exotic, poor
		
		// ridiculous: http://en.wikipedia.org/wiki/Comparison_of_free_software_eCommerce_web_application_frameworks
		
		// Comparison of TeX editors exotic structure + poor content
		
		// Comparison of VMware Fusion and Parallels Desktop  : interesting but poorly structured
		
		// Comparison of JavaScript frameworks : poorly structured and exotic structure
		// Comparison of MIDI standards : nothing
		// Comparison of Macintosh models : close to very technical description (numbers)
		// Comparison of Nikon DSLR cameras : same as above 
		// http://en.wikipedia.org/wiki/Comparison_of_MySQL_database_engines : too poor
		// bof poorly structured 
		// executeWikipediaToFML("Comparison_of_distributed_file_systems", _EMPTY, _EMPTY, _EMPTY);
		// very poor: http://en.wikipedia.org/wiki/Comparison_of_Skype_recorders
		// bof http://en.wikipedia.org/wiki/Comparison_of_PSA_systems
		// poorly structured http://en.wikipedia.org/wiki/Comparison_of_defragmentation_software
		// poorly structured http://en.wikipedia.org/wiki/Comparison_of_DEX_software
		
		// poor and numerics all around: 
		//http://en.wikipedia.org/wiki/Comparison_of_Toyota_hybrids
		
		/* poorly structured
		executeWikipediaToFML("Comparison_of_antivirus_software", 
				_EMPTY, 
				_EMPTY, _EMPTY);
				*/
		
		// no interest: http://en.wikipedia.org/wiki/Comparison_of_AMD_CPU_microarchitectures
		// very poorly structured: http://en.wikipedia.org/wiki/Comparison_of_application_virtual_machines
		
		//executeWikipediaToFML("Comparison_of_file_archivers", _EMPTY, _EMPTY, _EMPTY);
		
	}
	


	private void postTreatFM(FeatureModelVariable fmMerged, String[] negatedFts, String[] positiveFts) throws Exception {
		/*
		 * Post-process
		 */
		
		// 1. negated features (irrelevant values of the cell)
		for (String negatedFt : negatedFts) {
			fmMerged.getFormula().andWith(new Formula<String>(_builder.nget(negatedFt), Arrays.asList(negatedFt), _builder));
			fmMerged.removeFeature(negatedFt);
			fmMerged.addConstraint(new Expression<String>(negatedFt).not());
		}
		
		// 1. positive features (force the mandatory)
		for (String positiveFt : positiveFts) {
			fmMerged.getFormula().andWith(new Formula<String>(_builder.get(positiveFt), Arrays.asList(positiveFt), _builder));
			fmMerged.setMandatory(fmMerged.getFeature(positiveFt));
			fmMerged.addConstraint(new Expression<String>(positiveFt));
		}
		
				
		System.err.println("cliques: " + fmMerged.cliques().names());
		
		
		int nFts = fmMerged.features().size() ; 
		System.err.println("#fts " + nFts);
		
		
		ImplicationGraph<String> big = fmMerged.computeImplicationGraph() ; 
		System.err.println("#IG (edges) " + big.edges().size());
		Collection<String> vtxs = big.vertices() ;
		int t = 0 ; 
		for (String ft : vtxs) {
			Collection<SimpleEdge> iedges = big.outgoingEdges(ft);
			int n = iedges.size() ; 
			//System.err.println("ft=" + ft + " " + n);
			t += n ; 
		}
		
		System.err.println("(average) " + t / nFts);
		System.err.println("(rfm) " + fmMerged);
		
		//System.err.println("fmMerged = " + fmMerged);

		String bddContent = fmMerged.convert(FMFormat.FMLBDD) ; 
		
		
		String wikiPageName = fmMerged.getIdentifier() ;
		File f = new File(OUTPUT_DIRECTORY + wikiPageName + ".fmlbdd") ; 
		FileUtils.writeStringToFile(f, bddContent);
		
		File f2 = new File (OUTPUT_DIRECTORY + wikiPageName + ".fml") ; 
		FileUtils.writeStringToFile(f2, fmMerged + "");

		
		_shell.reset() ; 
		FeatureModelVariable fmv1 = FMBuilder.parseFMLBDD(OUTPUT_DIRECTORY + wikiPageName + ".fmlbdd", _builder);
//		System.err.println("#" + fmv1.counting());
		assertNotNull(fmv1);
		
						
		/*
		FeatureModelVariableBDDFormula flaMerged = new FeatureModelVariableBDDFormula("", new FMLMergerBDDSPLOT(fmvsToMerge, _builder).calculateFormula(Mode.Union), _builder);
		
		System.err.println("#" + flaMerged.counting());*/
		
		
		
		//System.err.println("doc=" + sections);
		//System.err.println("doc=" + doc.getElementsByTag("title"));
		//System.err.println("doc=" + doc.title());
		
		_shell.reset() ; 
		
	}
	
	@Test
	public void testGeneralizedNotation() throws Exception {
		
		FeatureModelVariable fmv1 = new FeatureModelVariable("", FMBuilder.getInternalFM("FM (" +
				 "WikiMatrix: General ; " +
				 "General: (LicenseCostFee|Unicode)+ [Storage] [Language] License RSS ;" + 
				 "LicenseCostFee: (DifferentLicences|US10|Community)? ;" +  
				 "Language: (Java|Python|PHP|Perl) ; " + 
				 "License: (Commercial|GPL|GPL2|Nolimit) ;" + 
				 "Storage: (Files|Database|FileRCS) ;" +  
				 "(Java -> Database);" + 
				 "(Nolimit -> !Unicode);" +
				 "(Nolimit -> LicenseCostFee); " +
				 "(GPL2 -> Storage);" + 
				 "(DifferentLicences -> GPL2);" + 
				 "(GPL2 -> PHP);" + 
				 "(DifferentLicences -> Database);" + 
				 "(GPL -> Unicode);" + 
				 "(Community -> GPL);" + 
				 "(Storage <-> Unicode);" + 
				 "(Python -> GPL);" + 
				 "(Files -> !LicenseCostFee);" +
				 "(Community <-> FileRCS);" +
				 "(Commercial <-> US10);" + 
				 "(Python -> Files);" + 
				 "(FileRCS <-> Perl); " + 
				 "(Unicode <-> Language);" +
				 "(US10 <-> Java);"  + ")")); 
		
		FeatureModelVariable fmv1bis = fmv1.toGeneralizedNotationWithoutOR();
		System.err.println("fmv1bis=" + fmv1bis);
	}
	
	@Test
	public void testStatisticsBIG() throws Exception {
		
		final String OUTPUT_DIR = "/Users/macher1/Documents/RESEARCH/INPROGRESS/ICSE2014-KSynthesis/PCMs/";
		
		File dir = new File(OUTPUT_DIR);
		File[] fileFMs = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().contains("fmlbdd");
			}
		});
		_shell.setVerbose(false);
		int i = 1 ; 
		int totalAverage = 0 ; 
		int totalNft = 0 ; 
		int totalEdges = 0 ;
		for (File fileFM : fileFMs) {
			_shell.reset() ; 
			FeatureModelVariable fmv1 = 
 					FMBuilder.parseFMLBDD(fileFM.getAbsolutePath(), _builder);
			assertNotNull(fmv1);
			
			/* new FeatureModelVariable("", FMBuilder.getInternalFM("FM (" +
					 "WikiMatrix: General ; " +
					 "General: (LicenseCostFee|Unicode)+ [Storage] [Language] License RSS ;" + 
					 "LicenseCostFee: (DifferentLicences|US10|Community)? ;" +  
					 "Language: (Java|Python|PHP|Perl) ; " + 
					 "License: (Commercial|GPL|GPL2|Nolimit) ;" + 
					 "Storage: (Files|Database|FileRCS) ;" +  
					 "(Java -> Database);" + 
					 "(Nolimit -> !Unicode);" +
					 "(Nolimit -> LicenseCostFee); " +
					 "(GPL2 -> Storage);" + 
					 "(DifferentLicences -> GPL2);" + 
					 "(GPL2 -> PHP);" + 
					 "(DifferentLicences -> Database);" + 
					 "(GPL -> Unicode);" + 
					 "(Community -> GPL);" + 
					 "(Storage <-> Unicode);" + 
					 "(Python -> GPL);" + 
					 "(Files -> !LicenseCostFee);" +
					 "(Community <-> FileRCS);" +
					 "(Commercial <-> US10);" + 
					 "(Python -> Files);" + 
					 "(FileRCS <-> Perl); " + 
					 "(Unicode <-> Language);" +
					 "(US10 <-> Java);"  + ")"));  */
			
			System.err.println("====== " + i++ + " ===========");
			
			int nFts = fmv1.features().size() ; 
			System.err.println("#fts " + nFts);
			
			
			ImplicationGraph<String> big = fmv1.computeImplicationGraph() ;
			//TransitiveReduction.INSTANCE.reduce(big);
			
			System.err.println("#IG (edges) " + big.edges().size());
			Collection<String> vtxs = big.vertices() ;
			int t = 0 ; 
			for (String ft : vtxs) {
				Collection<SimpleEdge> iedges = big.outgoingEdges(ft);
				int n = iedges.size() ; 
				//System.err.println("ft=" + ft + " " + n);
				t += n ; 
			}
			
			int nAverage = t / nFts ; 
			System.err.println("(average) " + nAverage);
			//System.err.println("(rfm) " + fmv1);
			
			totalAverage += nAverage ; 
			
			_shell.reset() ; 
			
			totalNft += nFts ; 
			totalEdges += t ; 
			
			
			
			
		}
		
		//System.err.println("" + (double) ((double)totalAverage / (double)i));
		System.err.println("" + (double) ((double)totalEdges / (double)totalNft));
		
	}

	private FeatureModelVariable executeWikipediaToFML(String wikiPageName,	String[] excludeColumnNames, 
			String[] excludeProductNames, String[] excludeSectionNames,
			Map<String, String> renamings) throws Exception {
		
		
	WikiPageContentExtractor wikipediaExtractor = new WikiPageContentExtractor() ;
		
		
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
		
			
		for (Catalog catalog : catalogs) {
			for (String columnName : excludeColumnNames) {
				if (!catalog.hasHeader(columnName)) 
					continue ; 
				if (!catalog.removeColumn(columnName)) {
					System.err.println("Unable to remove the column " + columnName);
				}
			}
				
		}
		
		Set<String> excludeProductIDs = new HashSet<String>(Arrays.asList(excludeProductNames)) ;
		Set<String> excludeSections = new HashSet<String>(Arrays.asList(excludeSectionNames)) ;
		
		
		List<FeatureModelVariable> fmvs = new ArrayList<FeatureModelVariable>() ; 
		for (Catalog catalog : catalogs) {
			String catalogName = catalog.getName() ;  
			if (excludeSections.contains(catalogName))
				continue ; 
			System.err.println("***" +  catalogName + "****");
			/*
			if (!catalog.getName().equals("General information"))
				continue ; */
			for (Product product : catalog) {
				FeatureModelVariable fmv = product.toFeatureDiagram() ;
				/*
				 * POST
				 */
				
				// renaming
				
				Set<String> oFts = renamings.keySet() ; // features to rename
				for (String oFt : oFts) {
					fmv.renameFeature(oFt, renamings.get(oFt));
				}
				
				String id = fmv.getIdentifier() ;
				if (!excludeProductIDs.contains(id))
					fmvs.add(fmv);
				
			}
			//System.err.println("\n\nfmvs=" + fmvs);
		}
		
		
		List<FeatureModelVariable> fmvsToMerge = new ArrayList<FeatureModelVariable>() ;
		
		
		
		
		if (catalogs.size() == 1) {
			fmvsToMerge = fmvs ; 
		}
		// aggregate feature models with same identifiers when there are numerous catalogs (dimensions)
		else {
			Set<String> idsDone = new HashSet<String>() ; 
			for (FeatureModelVariable fmv : fmvs) {
				String id1 = fmv.getIdentifier() ; 
				if (idsDone.contains(id1))
					continue ; 
				//System.err.println("Aggregating..." + id1) ; // + " = " + fmv);
				
				List<FeatureModelVariable> toAggreagte = new ArrayList<FeatureModelVariable>() ; 
				
				for (FeatureModelVariable fmv2 : fmvs) {
					String id2 = fmv2.getIdentifier() ; 
					if (id1.equals(id2)) {
						toAggreagte.add (fmv2);
					}
				}
				if (!toAggreagte.isEmpty()) {
					fmvsToMerge.add(new AggregatorFM().build(toAggreagte, new HashSet<Expression<String>>(), _interop(wikiPageName)));
				}
				else {
					System.err.println("Didn't find another for " + id1);
					continue ; 
				}
				
				idsDone.add(id1);
			}
		}
		
		// serialize product by product (for debug)
		StringBuffer sb = new StringBuffer();
		int i = 0 ; 
		for (FeatureModelVariable fmv : fmvsToMerge) {
			sb.append("fmProduct" + i++ + " = FM (" + fmv + "\n)\n\n");
		}
		File f = new File(OUTPUT_DIRECTORY + wikiPageName + "_FMLMergingScript" + ".fml") ; 
		FileUtils.writeStringToFile(f, sb.toString());

		
		FMLMergerBDD fmlMerger = new FMLMergerBDD(fmvsToMerge, _builder) ; // 
		
	
		FeatureModelVariable fmMerged = null ;
		
		
		_shell.setVerbose(true);
		boolean _SAT_EVALUATION = false ; 
		if (_SAT_EVALUATION) {
			fmMerged = new FMLMergerDisjunctiveSAT(fmvsToMerge).union();
			fmMerged.setIdentifier(wikiPageName);
			return fmMerged ; 
		}
		
		boolean _SAT_EVALUATION_2 = false ;
		if (_SAT_EVALUATION_2) {
			Collection<Expression<String>> exprs = new TseitinTransformationDisjunctive(fmvsToMerge.toArray(new FeatureModelVariable[]{})).compute(); //new TseitinTransformation(_z3, b12).compute();
			//System.err.println("exprs:" + exprs);
			// SMT bridges
			System.err.println("" + new FeatureModelVariableSATFormula("", new SATFMLFormula(ExpressionUtility.mkConjunction(exprs))).computeImplicationGraph());
			return null ; 
		}
		
		
		
		//Formula<String> flaMerged = fmlMerger.calculateFormula(Mode.StrictUnion);
		//System.err.println("#fla=" + flaMerged.getDomain().size());
		
		fmMerged =  fmlMerger.union(new KSynthesisConfiguration() {

					@Override
					public boolean isAddingCrossTreeConstraints() {
						return false ; //false;
					}

					@Override
					public boolean hasOrGroupSupport() {
						return false;
					}
					  
				  }) ; 
		
		

		
				
		// post-process: mandatory status for 		
		for (Catalog catalog : catalogs) {
			String catalogName = catalog.getName() ;  
			if (excludeSections.contains(catalogName))
				continue ; 
			if (fmMerged.features().names().contains(catalogName)) {
				fmMerged.setMandatory(fmMerged.getFeature(catalogName));
			//  fmMerged.addConstraint(new Expression<String>(catalogName));
				fmMerged.getFormula().andWith(new Formula<String>(_builder.mkExpression(new Expression<String>(catalogName)), Arrays.asList(catalogName), _builder));
			}
		}
		
		fmMerged.setIdentifier(wikiPageName);
		return fmMerged ; 
	}

	private void postTreatFM(FeatureModelVariable fmMerged, String[] negatedFts) throws Exception {
		postTreatFM(fmMerged, negatedFts, new String[] {});
	}

	private FeatureModelVariable executeWikipediaToFML(String wikiPageName,	String[] excludeColumnNames, String[] excludeProductNames, String[] excludeSectionNames) throws Exception {
	
		return executeWikipediaToFML(wikiPageName, excludeColumnNames, excludeProductNames, excludeSectionNames, new HashMap<String, String>());
		
	}

	private String _interop(String hS) {

			return hS.replaceAll("-", "")
					;
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
					||  !table.select("[class=wikitable sortable]").isEmpty() ;  
				//	|| !table.select("[class=sortable wikitable jquery-tablesorter]").isEmpty() ; 
					
			// FIXME: other cases
			Elements heads = table.select("thead") ;
			
			if (sortable && 
					(!heads.isEmpty())) {
				rHeaders =  collectHeaders(heads.first());
			}
			
			System.err.println("SORTABLE:" + sortable + " rHeaders=" + rHeaders);
			
			
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
			
			if (isEmpty(row))  // sometimes the first row, especially in sortable table, is empty (the second row is relevant for headers) 
				continue ; 
			
			
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
		List<Header> nHeaders = new ArrayList<Header>() ;
		if (nestedHeaders.size() > 0)
			nHeaders = nestedHeaders.get(0); // FIXME 0 at the moment but normally it can be refined

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

	private boolean isEmpty(Element row) {
		for (Element header : row.select("th")) {
			String headerV = header.text() ;
			if (!headerV.isEmpty())
				return false ; 
		}
		// all empty
		return true ;
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
