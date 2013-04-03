package CSVtoFML.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import CSVtoFML.CSVParser;
import CSVtoFML.CSVWriter;
import Exceptions.NotValidCSVFileException;

public class CSVParserTests extends CSVtoFMLTests {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void InputTest1() throws Exception {
		String input = "";
		try {
			new CSVParser(input, ",", "Test", "Default", "ID");
			assertTrue(false);
		} catch (Exception e) {
			if (e instanceof NotValidCSVFileException)
				if (e.getMessage().compareTo("Empty input!") == 0)
					assertTrue(true);
				else
					assertTrue(false);
			else
				assertTrue(false);
		}
	}

	@Test
	public void InputTest2() throws Exception {
		String input = "ID,";
		try {
			new CSVParser(input, ",", "Test", "Default", "ID");
		} catch (Exception e) {
			if (e instanceof NotValidCSVFileException)
				if (e.getMessage().compareTo("No lines in the file. Use \n\r for windows or \n for unix-like OS.") == 0)
					assertTrue(true);
				else
					assertTrue(false);
			else
				assertTrue(false);
		}
	}

	@Test
	public void InputTest3() throws Exception {
		String input = "ID,\nThing";
		try {
			new CSVParser(input, ",", "Test", "Default", "ID");
		} catch (Exception e) {
			if (e instanceof NotValidCSVFileException)
				if (e.getMessage().compareTo("The heading is too short!") == 0)
					assertTrue(true);
				else
					assertTrue(false);
			else
				assertTrue(false);

		}
	}

	@Test
	public void InputTest4() throws Exception {
		String input = " ID  ,  Cat1 , Cat2  ,  \n\n\n\n\nThing , value1 ,   \n\n\n";
		try {
			CSVParser csvParser = new CSVParser(input, ",", " Test ", " Default", "ID ");
			assertTrue(csvParser.getIdentifior().compareTo("ID") == 0);
			assertTrue(csvParser.getViewName().compareTo("Test") == 0);
			assertTrue(csvParser.getNbActualColumns() == 2);
			assertTrue(csvParser.isLabel("Cat1"));
			assertTrue(csvParser.getRowValueID("Thing", 0).compareTo("value1") == 0);
			assertTrue(csvParser.getRowValueID("Thing", 1).compareTo("Default") == 0);
			assertTrue(csvParser.isValid());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void InputTest5() throws Exception {
		String input = "ID,2Cat1,\nx2Thing\n\n";
		try {
			// Don't make the names valid for FAMILIAR
			CSVParser csvParser = new CSVParser(input, ",", "Test", "  Default  ", "ID ");
			assertTrue(csvParser.getNbActualColumns() == 1);
			assertTrue(csvParser.getNbActualRows() == 1);
			assertTrue(csvParser.isLabel("2Cat1"));
			assertTrue(csvParser.getRowValueID("x2Thing", 0).compareTo("Default") == 0);
			assertTrue(csvParser.isValid());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void InputTest6() throws Exception {
		String input = "ID,2Cat1,\n\rx2Thing";
		try {
			// Don't make the names valid for FAMILIAR
			CSVParser csvParser = new CSVParser(input, ",", "Test", "Default", "ID");
			assertTrue(csvParser.getNbActualColumns() == 1);
			assertTrue(csvParser.isLabel("2Cat1"));
			assertTrue(csvParser.getRowValueID("x2Thing", 0).compareTo("Default") == 0);
			assertTrue(csvParser.isValid());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest1() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			assertTrue(csvParser.getNbActualColumns() == 4);
			assertTrue(csvParser.getNbActualRows() == 3);
			csvParser.filterRow("id");
			assertTrue(csvParser.getNbActualRows() == 2);
			assertTrue(csvParser.getNbFilteredRows() == 1);
			assertTrue(!csvParser.isIdentifier("id"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertTrue(csvParser.isIdentifier("id3"));
			assertTrue(csvParser.isValid());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest2() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			ArrayList<String> rows = new ArrayList<String>();
			rows.add("id");
			rows.add("id3");
			csvParser.filterRows(rows);
			assertTrue(csvParser.getNbActualRows() == 1);
			assertTrue(csvParser.getNbFilteredRows() == 2);
			assertTrue(!csvParser.isIdentifier("id"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertTrue(!csvParser.isIdentifier("id3"));
			assertTrue(csvParser.isValid());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest3() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			csvParser.filterColumn("Cat1");
			assertTrue(csvParser.getNbActualRows() == 3);
			assertTrue(csvParser.getNbFilteredColumns() == 1);
			assertTrue(!csvParser.isLabel("ID"));
			assertTrue(!csvParser.isLabel("Cat1"));
			assertTrue(csvParser.isLabel("Cat2"));
			assertTrue(csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isLabel("Cat4"));
			csvParser.filterColumn("Cat3");
			assertTrue(csvParser.getNbActualRows() == 3);
			assertTrue(csvParser.getNbFilteredColumns() == 2);
			assertTrue(!csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isIdentifier("id"));
			assertTrue(csvParser.isIdentifier("id3"));
			assertTrue(csvParser.getRowValueID("id3", 0).compareTo("No") == 0);
			assertTrue(csvParser.getRowValueID("id3", 1).compareTo("Yes") == 0);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest4() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			ArrayList<String> cols = new ArrayList<String>();
			cols.add("Cat1");
			cols.add("Cat3");
			csvParser.filterColumns(cols);
			assertTrue(csvParser.getNbActualRows() == 3);
			assertTrue(csvParser.getNbFilteredColumns() == 2);
			assertTrue(!csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isIdentifier("id"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertTrue(csvParser.isIdentifier("id3"));
			assertTrue(csvParser.getRowValueID("id3", 0).compareTo("No") == 0);
			assertTrue(csvParser.getRowValueID("id3", 1).compareTo("Yes") == 0);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest5() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			ArrayList<String> cols = new ArrayList<String>();
			cols.add("Cat2");
			cols.add("Cat4");
			csvParser.filterKeepOnlyColumns(cols);
			assertTrue(csvParser.getNbActualRows() == 3);
			assertTrue(csvParser.getNbActualColumns() == 2);
			assertTrue(csvParser.getNbFilteredColumns() == 2);
			assertTrue(!csvParser.isLabel("Cat3"));
			assertTrue(!csvParser.isLabel("Cat1"));
			assertTrue(csvParser.isLabel("Cat2"));
			assertTrue(csvParser.isLabel("Cat4"));
			assertTrue(csvParser.isIdentifier("id"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertTrue(csvParser.isIdentifier("id3"));
			assertTrue(csvParser.getRowValueID("id3", 0).compareTo("No") == 0);
			assertTrue(csvParser.getRowValueID("id3", 1).compareTo("Yes") == 0);
			assertTrue(csvParser.getRowValueID("id2", 0).compareTo("truc54") == 0);
			assertTrue(csvParser.getRowValueID("id2", 1).compareTo("truc") == 0);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest6() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			ArrayList<String> rows = new ArrayList<String>();
			rows.add("id2");
			assertTrue(csvParser.getNbActualRows() == 3);
			csvParser.filterKeepOnlyRows(rows);
			assertTrue(csvParser.isLabel("Cat1"));
			assertTrue(csvParser.isLabel("Cat2"));
			assertTrue(csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isLabel("Cat4"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertFalse(csvParser.isIdentifier("id"));
			assertTrue(!csvParser.isIdentifier("id3"));
			assertTrue(csvParser.getNbActualColumns() == 4);
			assertTrue(csvParser.getNbActualRows() == 1);
			assertEquals(new Integer(2), new Integer(csvParser.getNbFilteredRows()));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest7() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			assertTrue(csvParser.getNbActualColumns() == 4);
			csvParser.filterKeepOnlyXColumns(1);
			assertTrue(csvParser.getNbActualColumns() == 1);
			assertTrue(csvParser.getNbActualRows() == 3);
			assertTrue(csvParser.isLabel("Cat1"));
			assertTrue(!csvParser.isLabel("Cat2"));
			assertTrue(!csvParser.isLabel("Cat3"));
			assertTrue(!csvParser.isLabel("Cat4"));
			assertTrue(csvParser.getNbFilteredColumns() == 3);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest8() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			assertTrue(csvParser.getNbActualRows() == 3);
			csvParser.filterKeepOnlyXRows(1);
			assertTrue(csvParser.getNbActualColumns() == 4);
			assertTrue(csvParser.isLabel("Cat1"));
			assertTrue(csvParser.isLabel("Cat2"));
			assertTrue(csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isLabel("Cat4"));
			assertTrue(csvParser.getNbFilteredColumns() == 0);
			assertTrue(csvParser.getNbFilteredRows() == 2);
			assertTrue(csvParser.getNbFilteredValues() == 2 * csvParser.getNbActualColumns());
			assertTrue(csvParser.isIdentifier("id"));
			assertTrue(!csvParser.isIdentifier("id2"));
			assertTrue(!csvParser.isIdentifier("id3"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest9() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,No,truc3,Yes";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			CSVWriter csvWriter = csvParser.toCSVWriterDeepCopy();
			assertTrue(csvParser.getNbActualColumns() == csvWriter.getNbActualColumns());
			assertTrue(csvParser.getNbActualRows() == csvWriter.getNbActualRows());
			assertTrue(csvParser.getIdentifior().compareTo(csvWriter.getIdentifior()) == 0);
			assertTrue(csvParser.getSeparator().compareTo(csvWriter.getSeparator()) == 0);
			assertTrue(csvParser.getDefaultCharacter().compareTo(csvWriter.getDefaultCharacter()) == 0);
			Iterator<String> tmpIT = csvParser.getHeadLabelsIterator();
			String tmp;
			while (tmpIT.hasNext()) {
				tmp = tmpIT.next();
				assertTrue(csvWriter.isLabel(tmp));
			}
			int i;
			String tmp2;
			tmpIT = csvParser.getRowIdentifierIterator();
			while (tmpIT.hasNext()) {
				tmp = tmpIT.next();
				i = 0;
				assertTrue(csvWriter.isIdentifier(tmp));
				while (i < csvParser.getNbActualColumns()) {
					assertTrue(csvWriter.getRowValueID(tmp, i).compareTo(csvParser.getRowValueID(tmp, i)) == 0);
					i++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void FunctionTest10() throws Exception {
		String input = "ID,Cat1,Cat2,Cat3,Cat4\n\r" + "id, truc,truc,truc,truc\n\r" + "id2, truc,truc54,truc,truc\n\r"
				+ "id3, truc1,SpecialV2,SpecialV1,SpecialV1";
		String input2 = "ID,Cat5\n\r" + "id, truc\n\r" + "id2, truc\n\r" + "id3, truc1\n\r" + "id4, hi\n\r";
		try {
			CSVParser csvParser = new CSVParser(input, ",", "Test", "N_A", "ID");
			assertTrue(csvParser.getNbActualColumns() == 4);
			assertTrue(csvParser.getNbActualRows() == 3);
			CSVParser csvParser2 = new CSVParser(input2, ",", "Test2", "N_A", "ID");
			assertTrue(csvParser2.getNbActualColumns() == 1);
			assertTrue(csvParser2.getNbActualRows() == 4);
			assertTrue(csvParser.getNbFilteredColumns() == 0);
			assertTrue(csvParser.getNbFilteredRows() == 0);
			assertTrue(csvParser.getNbFilteredValues() == 0);
			assertTrue(csvParser.getNbReplacedValues() == 0);
			csvParser.filterReplaceValuesBy("SpecialV1", "Yes");
			assertTrue(csvParser.getNbReplacedValues() == 2);
			csvParser.filterColumn("Cat4");
			csvParser.filterReplaceValuesBy("SpecialV2", "No");
			assertTrue(csvParser.getNbActualColumns() == 3);
			assertTrue(csvParser.getNbReplacedValues() == 3);
			assertTrue(csvParser.getNbFilteredColumns() == 1);
			assertTrue(csvParser.getNbFilteredRows() == 0);
			assertTrue(csvParser.getNbFilteredValues() == 3);
			assertTrue(csvParser.aggregateWith(csvParser2));
			assertTrue(csvParser.getNbReplacedValues() == 3);
			assertTrue(csvParser.getNbActualColumns() == 4);
			assertTrue(csvParser.getNbActualRows() == 4);
			assertTrue(csvParser.getNbFilteredColumns() == 1);
			assertTrue(csvParser.getNbFilteredRows() == 0);
			assertTrue(csvParser.getNbFilteredValues() == 3);
			assertTrue(csvParser.getViewName().compareTo("Test") == 0);
			assertTrue(csvParser.isLabel("Cat5"));
			assertTrue(!csvParser.isLabel("Cat4"));
			assertTrue(csvParser.isLabel("Cat3"));
			assertTrue(csvParser.isLabel("Cat2"));
			assertTrue(csvParser.isLabel("Cat1"));
			assertTrue(csvParser.isIdentifier("id4"));
			assertTrue(csvParser.isIdentifier("id3"));
			assertTrue(csvParser.isIdentifier("id2"));
			assertTrue(csvParser.isIdentifier("id"));
			assertTrue(csvParser.getRowValueID("id4", 0).compareTo("N_A") == 0);
			assertTrue(csvParser.getRowValueID("id4", 1).compareTo("N_A") == 0);
			assertTrue(csvParser.getRowValueID("id4", 2).compareTo("N_A") == 0);
			assertTrue(csvParser.getRowValueID("id4", 3).compareTo("hi") == 0);
			assertTrue(csvParser.getRowValueID("id3", 0).compareTo("truc1") == 0);
			assertTrue(csvParser.getRowValueID("id3", 1).compareTo("No") == 0);
			assertTrue(csvParser.getRowValueID("id3", 2).compareTo("Yes") == 0);
			assertTrue(csvParser.getRowValueID("id3", 3).compareTo("truc1") == 0);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
