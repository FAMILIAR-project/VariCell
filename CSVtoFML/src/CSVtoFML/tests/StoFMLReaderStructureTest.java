package CSVtoFML.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import CSVtoFML.FMLConvert;
import CSVtoFML.StoFMLReader;

public class StoFMLReaderStructureTest extends CSVtoFMLTests {
		
		private String _path = "Ressources/usesCases/wikiMatrix/CSV/";
		
		private String _template = 	"//WikiMatrixSimple1.stofm" + System.getProperty("line.separator") + "import: \"" + _path
		+ "General.csv\" as General" + System.getProperty("line.separator") + "\"" + _path
		+ "Functionalities.csv\" as Functionalities" + System.getProperty("line.separator") + "\"" + _path
		+ "Requirements.csv\" as Requirements" + System.getProperty("line.separator") + "name: \"SPLWikiMatrix\""
		; 
		
		@Test
		public void TestMoveIn() throws Exception {
			
			String input = _template
			+ System.getProperty("line.separator") + "structure: " + " Requirements moveIn General" 
			+ System.getProperty("line.separator") + "default: " + "parsing: key: " + "\"Identifior\"" ;
			try { 
				FMLConvert converter = new StoFMLReader().execute(input);
				assertNotNull(converter);
				converter.convert();
				String finalFML = converter.getFinalFAMILIARScript() ;
				assertNotNull(finalFML);
				System.out.println(finalFML);
			}
			catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Exception " + e + " occurs");
			}
			
			assertTrue(true);
		}
		
		
		@Test
		public void TestCopyIn() throws Exception {
			
			String input = _template
			+ System.getProperty("line.separator") + "structure: " + " Requirements copyIn General" 
			+ System.getProperty("line.separator") + "default: " + "parsing: key: " + "\"Identifior\"" ;
			try { 
				FMLConvert converter = new StoFMLReader().execute(input);
				assertNotNull(converter);
				converter.convert();
				String finalFML = converter.getFinalFAMILIARScript() ;
				assertNotNull(finalFML);
				System.out.println(finalFML);
			}
			catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Exception " + e + " occurs");
			}
			
			assertTrue(true);
		}
		
		
		@Test
		public void TestBelow() throws Exception {
			
			String input = _template
			+ System.getProperty("line.separator") + "structure: " + " Requirements below General" 
			+ System.getProperty("line.separator") + "default: " + "parsing: key: " + "\"Identifior\"" ;
			try { 
				FMLConvert converter = new StoFMLReader().execute(input);
				assertNotNull(converter);
				converter.convert();
				String finalFML = converter.getFinalFAMILIARScript() ;
				assertNotNull(finalFML);
				System.out.println(finalFML);
			}
			catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Exception " + e + " occurs");
			}
			
			assertTrue(true);
		}
		
		
		@Test
		public void TestAbove() throws Exception {
			
			String input = _template
			+ System.getProperty("line.separator") + "structure: " + " Requirements above General" 
			+ System.getProperty("line.separator") + "default: " + "parsing: key: " + "\"Identifior\"" ;
			try { 
				FMLConvert converter = new StoFMLReader().execute(input);
				assertNotNull(converter);
				converter.convert();
				String finalFML = converter.getFinalFAMILIARScript() ;
				assertNotNull(finalFML);
				System.out.println(finalFML);
			}
			catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Exception " + e + " occurs");
			}
			
			assertTrue(true);
		}

}
