package CSVtoFML.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import CSVtoFML.FMLConvert;
import CSVtoFML.StoFMException;
import CSVtoFML.StoFMLReader;

public class StoFMLReaderTests extends CSVtoFMLTests {
	
	
	// TODO: to be managed in FMLConvert
	private String _path = "Ressources/usesCases/wikiMatrix/CSV/";
	
	private String _template = 	"//WikiMatrixSimple1.stofm" + System.getProperty("line.separator") + "import: \"" + _path
	+ "General.csv\" as General" + System.getProperty("line.separator") + "\"" + _path
	+ "Functionalities.csv\" as Functionalities" + System.getProperty("line.separator") + "\"" + _path
	+ "Requirements.csv\" as Requirements" + System.getProperty("line.separator") + "name: \"SPLWikiMatrix\""
	+ System.getProperty("line.separator") + "all:" + System.getProperty("line.separator") + "parsing:"
	+ System.getProperty("line.separator") + "key: \"Identifior\"" + System.getProperty("line.separator") + "separator: \",\""
	+ System.getProperty("line.separator") + "multivalued_separator: \";\"" ;

	@Test
	public void Test1() throws Exception {
		
		String input = _template;
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}
		
		assertTrue(true);
	}
	
	
	@Test
	public void TestExcludeProduct() throws Exception {
		String input = _template
				+ System.getProperty("line.separator") + "except_products: " + "TWiki" ;
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}
		
		assertTrue(true);
		
	}
	
	@Test
	public void TestExcludeMissingProduct() throws Exception {
		String input = _template
				+ System.getProperty("line.separator") + "except_products: " + "TWikii" ;
		try {
			new StoFMLReader().execute(input);
		}
		catch (Exception e) {
			assertTrue(e instanceof StoFMException);
			return ;
		}
		Assert.fail("TWikii actually does not exist!");
	}
	
	
	@Test
	public void TestOnlyProduct() throws Exception {
		String input = _template
				  + System.getProperty("line.separator") + "only_products: " + "TWiki Confluence DrupalWiki MoinMoin PBwiki" ;
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}
		
		assertTrue(true);
	}
	
	
	@Test
	public void TestOnlyMissingProduct() throws Exception {
		
		
		String input = _template
				+ System.getProperty("line.separator") + "only_products: " + "TWiki Confluence DrupalWiki MoinMoin PBwikiii"
				;
		try {
			new StoFMLReader().execute(input);
		}
		catch (Exception e) {
			assertTrue(e instanceof StoFMException);
			return ;
		}
		
		Assert.fail("PBwikiii actually does not exist!");
	}
	
	
	@Test
	public void TestExcludeFeature() throws Exception {
		String input = _template
			+ System.getProperty("line.separator") + "view: General" + 
			" except_features: " + "LicenseCost_Fee" + System.getProperty("line.separator") 
			+ "view: Requirements" + " except_features: " + " RootAccess" 
			+  System.getProperty("line.separator") + "view: Functionalities" 
			+ " except_features: " + " ImageEditing" ;
		
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}

		assertTrue(true);
	
	}
	
	@Test
	public void TestExcludeMissingFeature() throws Exception {
		String input = _template
		+ System.getProperty("line.separator") + "view: General" + 
		" except_features: " + "LicenseCost_Feeeeee" + System.getProperty("line.separator") 
		+ "view: Requirements" + " except_features: " + " RootAccess" 
		+  System.getProperty("line.separator") + "view: Functionalities" 
		+ " except_features: " + " ImageEditing" ;
				;
		try {
			new StoFMLReader().execute(input);
		}
		catch (Exception e) {
			assertTrue(e instanceof StoFMException);
			return ;
		}
		
		Assert.fail("LicenseCost_Feeeeee actually does not exist!");
	}
	
	
	@Test
	public void TestOnlyFeature() throws Exception {
		String input = _template
		+ System.getProperty("line.separator") + "view: General" + 
		" only_features: " + "LicenseCost_Fee" + System.getProperty("line.separator") + 
		"view: Requirements" + " only_features: " + " RootAccess" +  System.getProperty("line.separator") + 
		"view: Functionalities" + " only_features: " + " ImageEditing" ;
		
	
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}
	
		assertTrue(true);
		
	}
	
	
	@Test
	public void TestOnlyMissingFeature() throws Exception {
		String input = _template
		+ System.getProperty("line.separator") + "view: General" + 
		" only_features: " + "LicenseCost_Feeeeee" + System.getProperty("line.separator") + 
		"view: Requirements" + " only_features: " + " RootAccess" +  System.getProperty("line.separator") + 
		"view: Functionalities" + " only_features: " + " ImageEditing" ;
		
		try {
			new StoFMLReader().execute(input);
		}
		catch (Exception e) {
			assertTrue(e instanceof StoFMException);
			return ;
		}
		
		Assert.fail("LicenseCost_Feeeeee actually does not exist!");
	}
	
	
	@Test
	public void TestRenaming1() throws Exception {
		String input = _template
		+ System.getProperty("line.separator") + "view: General" + 
		" renaming: " + "LicenseCost_Fee => \"LicenseCost\"" ;
		
	
		try { 
			FMLConvert converter = new StoFMLReader().execute(input);
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript() ;
			assertNotNull(finalFML);
			System.out.println(finalFML);
		}
		catch (Exception e) {
			Assert.fail("Exception occurs");
		}
	
		assertTrue(true);
		
	}
	
	@Test
	public void TestRenamingMissing1() throws Exception {
		String input = _template
		+ System.getProperty("line.separator") + "view: General" + 
		" renaming: " + "LicenseCost_Feeeeeee => \"LicenseCost\"" ;
		
	
		try {
			new StoFMLReader().execute(input);
		}
		catch (Exception e) {
			assertTrue(e instanceof StoFMException);
			return ;
		}
		
		Assert.fail("LicenseCost_Feeeeee actually does not exist!");
		
	}
	
}
