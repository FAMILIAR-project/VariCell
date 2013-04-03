package CSVtoFML.tests;

import static org.junit.Assert.*;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.StringVariable;
import CSVtoFML.CSVParser;
import CSVtoFML.ConversionModel;
import CSVtoFML.FMLConvert;
import CSVtoFML.SkeletonIdentifierGroup;
import CSVtoFML.Skeleton;
import CSVtoFML.SkeletonView;

/**
 * 
 * @author Charles Vanbeneden
 * 
 */
public class SkeletonTests extends CSVtoFMLTests {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	// Basic test
	@Test
	public void SqueletonTest1() throws Exception {
		String input = "ID,test1,test2,test3\nid1,Yes\nid2,truc1, truc2\nid3,truc12, truc23";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		SkeletonIdentifierGroup id = sq.getIdentifior("ID");
		SkeletonView view = sq.getView("Test");
		assertTrue(sq.getRootFeatureName().compareTo("TESTRF") == 0);
		assertTrue(sq.getIdentifiors().size() == 1);
		assertTrue(id.getIdentifiers().size() == 3);
		assertTrue(id.getIdentifiers().contains("Id1"));
		assertTrue(id.getIdentifiers().contains("Id2"));
		assertTrue(id.getIdentifiers().contains("Id3"));
		assertTrue(sq.getViews().size() == 1);
		assertTrue(view.getCharacteristics().size() == 3);
		assertTrue(view.getCharacteristic("Test1").getSpecialCharacteristics().size() == 2);
		assertTrue(!view.getCharacteristic("Test1").isOptional());
		assertTrue(view.getCharacteristic("Test1").getSpecialCharacteristics().contains("Truc1"));
		assertTrue(view.getCharacteristic("Test1").getSpecialCharacteristics().contains("Truc12"));
		assertTrue(view.getCharacteristic("Test2").getSpecialCharacteristics().size() == 2);
		assertTrue(view.getCharacteristic("Test2").isOptional());
		assertTrue(view.getCharacteristic("Test2").getSpecialCharacteristics().contains("Truc2"));
		assertTrue(view.getCharacteristic("Test2").getSpecialCharacteristics().contains("Truc23"));
		assertTrue(view.getCharacteristic("Test3").getSpecialCharacteristics().size() == 0);
		assertTrue(view.getCharacteristic("Test3").isOptional());
	}

	// 2 views test
	@Test
	public void SqueletonTest2() throws Exception {
		String input = "ID,test1,test2,test3\nid1,Yes\nid2,truc1, truc2\nid3,truc12, truc23";
		String input2 = "ID,car4,car5\nid4,No\nid2,truc1, truc2\nid3,truc12, truc23";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "ID"));
		conv.addView(new CSVParser(input2, ",", "View2", "N_A", "ID"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		SkeletonIdentifierGroup id = sq.getIdentifior("ID");
		assertTrue(sq.getIdentifiors().size() == 1);
		assertTrue(id.getIdentifiers().size() == 4);
		assertTrue(id.getIdentifiers().contains("Id1"));
		assertTrue(id.getIdentifiers().contains("Id2"));
		assertTrue(id.getIdentifiers().contains("Id3"));
		assertTrue(id.getIdentifiers().contains("Id4"));
		assertTrue(sq.getViews().size() == 2);
		SkeletonView view = sq.getView("View1");
		assertTrue(view.getCharacteristics().size() == 3);
		view = sq.getView("View2");
		assertTrue(view.getCharacteristics().size() == 2);
		assertTrue(view.isOptional());
		assertTrue(view.getCharacteristic("Car4").getSpecialCharacteristics().size() == 2);
		assertTrue(view.getCharacteristic("Car4").isOptional());
		assertTrue(view.getCharacteristic("Car5").getSpecialCharacteristics().size() == 2);
		assertTrue(view.getCharacteristic("Car5").isOptional());
	}

	// Mutex groups test
	@Test
	public void SqueletonTest3() throws Exception {
		String input = "ID,test1,test2,test3\nid1,No, No,No\nid2,truc1, No\nid3,truc12, truc";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "ID"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		assertTrue(sq.getViews().size() == 1);
		SkeletonView view = sq.getView("View1");
		assertTrue(view.getCharacteristics().size() == 3);
		assertTrue(view.isOptional());
		assertTrue(view.getCharacteristic("Test1").getSpecialCharacteristics().size() == 2);
		assertTrue(view.getCharacteristic("Test1").isOptional());
		assertTrue(view.getCharacteristic("Test1").getFAMILIARSubProductions().contains("?"));
		assertTrue(view.getCharacteristic("Test2").getSpecialCharacteristics().size() == 1);
		assertTrue(view.getCharacteristic("Test2").isOptional());
		assertTrue(view.getCharacteristic("Test2").getFAMILIARSubProductions().contains("["));
		assertTrue(view.getCharacteristic("Test3").getSpecialCharacteristics().size() == 0);
		assertTrue(view.getCharacteristic("Test3").isOptional());
	}

	/**
	 * Composed id squeleton test
	 * 
	 * @throws Exception
	 */
	@Test
	public void SqueletonTest4() throws Exception {
		String input = "ID,test1,test2,test3\nid1,Nvidia, No,No\nid2,ATI, No\nid3,Nvidia, truc";
		String input2 = "ID,test1,test4,test5\nid1,Nvidia, hoho,hehe\nid2,ATI, No\nid3,Nvidia, truc\nid4,VIA,";
		String[] compIDarr = { "test1" };
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "ID"));
		conv.addView(new CSVParser(input2, ",", "View2", "N_A", "ID"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		System.out.println(sq.toFMLFeatureModel());
		assertTrue(sq.getViews().size() == 2);
		assertTrue(sq.getIdentifiors().size() == 2);

		Iterator<SkeletonIdentifierGroup> it = sq.getIdentifiors().iterator();

		SkeletonIdentifierGroup idG = it.next();
		// Set ˆ la con pour tester
		if (idG.getFeatureName().compareTo("Test1") == 0) {
			assertTrue(idG.getFeatureName(), idG.getFeatureName().compareTo("Test1") == 0);
			assertTrue(idG.getIdentifiers().size() == 3);
			assertTrue(idG.getIdentifiers().contains("Nvidia"));
			assertTrue(idG.getIdentifiers().contains("ATI"));
			assertTrue(idG.getIdentifiers().contains("VIA"));

			idG = it.next();
			assertTrue(idG.getFeatureName(), idG.getFeatureName().compareTo("ID") == 0);
			assertTrue(idG.getIdentifiers().size() == 4);
			assertTrue(idG.getIdentifiers().contains("Id1"));
			assertTrue(idG.getIdentifiers().contains("Id2"));
			assertTrue(idG.getIdentifiers().contains("Id3"));
			assertTrue(idG.getIdentifiers().contains("Id4"));
		} else if (idG.getFeatureName().compareTo("ID") == 0) {
			assertTrue(idG.getIdentifiers().size() == 4);
			assertTrue(idG.getIdentifiers().contains("Id1"));
			assertTrue(idG.getIdentifiers().contains("Id2"));
			assertTrue(idG.getIdentifiers().contains("Id3"));
			assertTrue(idG.getIdentifiers().contains("Id4"));

			idG = it.next();
			assertTrue(idG.getFeatureName(), idG.getFeatureName().compareTo("Test1") == 0);
			assertTrue(idG.getIdentifiers().size() == 3);
			assertTrue(idG.getIdentifiers().contains("Nvidia"));
			assertTrue(idG.getIdentifiers().contains("ATI"));
			assertTrue(idG.getIdentifiers().contains("VIA"));
		} else
			assertTrue(false);
	}

	@Test
	public void SqueletonTest5() throws Exception {
		String input = "";

	}

	@Test
	public void SqueletonExpressessivityComparaison1() throws Exception {
		String input = "ID,test1,test2,test3\nid1,No, No,No\nid2,truc1, No\nid3,truc12, truc";
		String input2 = "ID,car4,car5\nid4,No\nid2,truc1, truc2\nid3,truc12, truc23";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "ID"));
		conv.addView(new CSVParser(input2, ",", "View2", "N_A", "ID"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		System.out.println(fmlConverter.getFinalFAMILIARScript());
		Skeleton sq = fmlConverter.getSkeleton();
		String squeletonStr = "squeleton = " + sq.toFMLFeatureModel();
		String finalFM = "finalFM = " + fmlConverter.getFinalFeatureModel(false, _shell);
		System.out.println(finalFM);

		_shell.parse(finalFM);
		_shell.parse(squeletonStr);

		FeatureModelVariable finalFM1 = getFMVariable("finalFM");
		System.out.println("#" + finalFM1.counting() + " " + finalFM1.toString());

		_shell.parse("compareResult = compare finalFM squeleton");
		StringVariable result = getStringVariable("compareResult");
		assertTrue(result.getSpecificValue(), result.getSpecificValue().compareTo("SPECIALIZATION") == 0);

	}

	// filter filterCSVParsersPaperExampleSmall
	@Test
	public void SqueletonExpressessivityComparaison2() throws Exception {
		String input = "Identifior,License,ProgrammingLanguage,DataStorage,LicenseCost_Fee,RSSFeeds,UnicodeSupport"
				+ System.getProperty("line.separator") + "PBwiki,Nolimit,No,No,Yes,Yes,No" + System.getProperty("line.separator")
				+ "MoinMoin,GPL,Python,Files,No,Yes,Yes" + System.getProperty("line.separator") + "DokuWiki,GPL2,PHP,Files,No,Yes,Yes"
				+ System.getProperty("line.separator") + "PmWiki,GPL2,PHP,Files,No,Yes,Yes" + System.getProperty("line.separator")
				+ "DrupalWiki,GPL2,PHP,Database,Differentlicences,Yes,Yes" + System.getProperty("line.separator")
				+ "TWiki,GPL,Perl,FilesRCS,Community,Yes,Yes" + System.getProperty("line.separator")
				+ "MediaWiki,GPL,PHP,Database,No,Yes,Yes" + System.getProperty("line.separator")
				+ "Confluence,Commercial,Java,Database,US10,Yes,Yes";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "Identifior"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		
		String squeletonStr = "squeleton = " + sq.toFMLFeatureModel();
		String finalFM = "finalFM = " + fmlConverter.getFinalFeatureModel(false, _shell);
		_shell.setVerbose(false);
		_shell.parse(finalFM);
		_shell.parse(squeletonStr);
		_shell.parse("compareResult = compare finalFM squeleton");
		StringVariable result = getStringVariable("compareResult");
		assertTrue(result.getSpecificValue(), result.getSpecificValue().compareTo("SPECIALIZATION") == 0);
	}

	// some partial and na
	@Test
	public void SqueletonExpressessivityComparaison3() throws Exception {
		String input = "Identifior,License,ProgrammingLanguage,DataStorage,LicenseCost_Fee,RSSFeeds,UnicodeSupport"
				+ System.getProperty("line.separator") + "PBwiki,Nolimit,N_A,Partial,Partial,Partial,No"
				+ System.getProperty("line.separator") + "MoinMoin,GPL,Python,Files,No,Yes,Yes" + System.getProperty("line.separator")
				+ "DokuWiki,GPL2,PHP,Files,No,Yes,Yes" + System.getProperty("line.separator") + "PmWiki,GPL2,PHP,Files,No,Yes,Yes"
				+ System.getProperty("line.separator") + "DrupalWiki,GPL2,PHP,Database,Differentlicences,Partial,Yes"
				+ System.getProperty("line.separator") + "TWiki,GPL,Perl,FilesRCS,Community,Yes,Yes" + System.getProperty("line.separator")
				+ "MediaWiki,GPL,PHP,Database,No,N_A,Yes" + System.getProperty("line.separator")
				+ "Confluence,Commercial,Java,Database,US10,Yes,Yes";
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input, ",", "View1", "N_A", "Identifior"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
	
		String squeletonStr = "squeleton = " + sq.toFMLFeatureModel();
		String finalFM = "finalFM = " + fmlConverter.getFinalFeatureModel(false, _shell);
		_shell.setVerbose(false);
		_shell.parse(finalFM);
		_shell.parse(squeletonStr);
		_shell.parse("compareResult = compare finalFM squeleton");
		StringVariable result = getStringVariable("compareResult");
		assertTrue(result.getSpecificValue(), result.getSpecificValue().compareTo("SPECIALIZATION") == 0);
	}

	// filter filterCSVParsersPaperExampleBig
	// TODO
	@Test
	public void SqueletonExpressessivityComparaison4() throws Exception {

		String input1 = "Identifior,License,ProgrammingLanguage,DataStorage,LicenseCost_Fee" + System.getProperty("line.separator")
				+ "PBwiki,Nolimit,No,No,Yes" + System.getProperty("line.separator") + "MoinMoin,GPL,Python,Files,No"
				+ System.getProperty("line.separator") + "DokuWiki,GPL2,PHP,Files,No" + System.getProperty("line.separator")
				+ "PmWiki,GPL2,PHP,Files,No" + System.getProperty("line.separator") + "DrupalWiki,GPL2,PHP,Database,Differentlicences"
				+ System.getProperty("line.separator") + "TWiki,GPL,Perl,FilesRCS,Community" + System.getProperty("line.separator")
				+ "MediaWiki,GPL,PHP,Database,No" + System.getProperty("line.separator") + "Confluence,Commercial,Java,Database,US10";
		String input2 = "Identifior,OperatingSystem,RootAccess,OtherRequirements" + System.getProperty("line.separator")
				+ "PBwiki,No,Yes,N_A" + System.getProperty("line.separator") + "MoinMoin,No,No,No" + System.getProperty("line.separator")
				+ "DokuWiki,No,No,No" + System.getProperty("line.separator") + "PmWiki,No,No,No" + System.getProperty("line.separator")
				+ "DrupalWiki,Yes,Yes,No" + System.getProperty("line.separator") + "TWiki,No,No,Yes" + System.getProperty("line.separator")
				+ "MediaWiki,N_A,Yes,No" + System.getProperty("line.separator") + "Confluence,No,No,Java5";
		String input3 = "Identifior,RSSFeeds,UnicodeSupport,EmbeddedFlash,ImageEditing" + System.getProperty("line.separator")
				+ "PBwiki,Yes,No,Indentedblock,Yes" + System.getProperty("line.separator") + "MoinMoin,Yes,Yes,Yes,No"
				+ System.getProperty("line.separator") + "DokuWiki,Yes,Yes,Yes,Yes" + System.getProperty("line.separator")
				+ "PmWiki,Yes,Yes,Yes,Yes" + System.getProperty("line.separator") + "DrupalWiki,Yes,Yes,Yes,Yes"
				+ System.getProperty("line.separator") + "TWiki,Yes,Yes,Yes,Yes" + System.getProperty("line.separator")
				+ "MediaWiki,Yes,Yes,Yes,No" + System.getProperty("line.separator") + "Confluence,Yes,Yes,Yes,Yes";
		CSVParser[] csvParser = { new CSVParser(input1, ",", "General", "N_A", "Identifior"),
				new CSVParser(input2, ",", "Requirements", "N_A", "Identifior"),
				new CSVParser(input3, ",", "Functionalities", "N_A", "Identifior") };
		String[] compIDarr = {};
		ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
		conv.addView(new CSVParser(input1, ",", "General", "N_A", "Identifior"));
		conv.addView(new CSVParser(input2, ",", "Requirements", "N_A", "Identifior"));
		conv.addView(new CSVParser(input3, ",", "Functionalities", "N_A", "Identifior"));
		FMLConvert fmlConverter = new FMLConvert(conv, true);
		fmlConverter.convert();
		Skeleton sq = fmlConverter.getSkeleton();
		String squeletonStr = "squeleton = " + sq.toFMLFeatureModel();
		String finalFM = "finalFM = " + fmlConverter.getFinalFeatureModel(true, _shell);
		System.out.println("" + finalFM);
		System.out.println("" + squeletonStr);
		_shell.setVerbose(false);
		_shell.parse(finalFM);
		_shell.parse(squeletonStr);
		FeatureModelVariable finalFM1 = getFMVariable("finalFM");
		System.out.println("#" + finalFM1.counting() + " " + finalFM1.toString());
		// _shell.parse("compareResult = compare finalFM squeleton");
		// StringVariable result = getStringVariable("compareResult");
		// assertTrue(result.getSpecificValue(),
		// result.getSpecificValue().compareTo("SPECIALIZATION") == 0);
	}

}
