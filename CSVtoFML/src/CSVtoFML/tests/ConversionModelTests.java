package CSVtoFML.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import CSVtoFML.CSVParser;
import CSVtoFML.ConversionModel;
import CSVtoFML.FMLConvert;
import CSVtoFML.MultiValuedMode;

public class ConversionModelTests extends CSVtoFMLTests {

	@Test
	public void Test1() throws Exception {
		// Init tests
		String input = "ID,Char1\n\r" + "id1, truc\n\r" + "id2, Yes\n\r" + "id3, No\n\r" + "id4, \n\r";
		CSVParser view1 = new CSVParser(input, ",", "View1", "N_A", "ID");
		assertTrue(view1.isValid());
		ConversionModel convModel = new ConversionModel("Test");
		assertTrue(convModel.getRootFeatureName().compareTo("Test") == 0);
		convModel.setRootFeatureName("TEST");
		assertTrue(convModel.getRootFeatureName().compareTo("TEST") == 0);
		assertTrue(convModel.getComposedIDArray().length == 0);
		convModel.addView(view1);
		assertTrue(convModel.getView("View1") != null);
		assertTrue(convModel.getTotalView() == 1);
		assertTrue(convModel.getTotalDimension() == 1);
		assertTrue(convModel.getTotalEntity() == 4);
		assertTrue(convModel.getTotalRows() == 4);
		String input2 = "ID,Char2\n\r" + "id1, N_A\n\r" + "id2, Partial\n\r" + "id3, Haha\n\r" + "id4, Opt\n\r";
		CSVParser view2 = new CSVParser(input2, ",", "View2", "N_A", "ID");
		assertTrue(view2.isValid());
		convModel.addView(view2);
		assertTrue(convModel.getView("View2") != null);
		assertTrue(convModel.getTotalView() == 2);
		assertTrue(convModel.getTotalDimension() == 2);
		assertTrue(convModel.getTotalEntity() == 4);
		assertTrue(convModel.getTotalRows() == 8);

		// Test of renameLabel + replaceColumnValueBy
		view1.renameLabel("Char1", "Characteristic1");
		assertTrue(view1.isLabel("Characteristic1"));
		view1.filterReplaceColumnValuesBy("truc", "truc2", "Characteristic1");
		assertTrue(view1.getRowValueID("id1", 0).compareTo("truc2") == 0);
		assertTrue(view1.getNbReplacedValues() == 1);
		assertTrue(convModel.getTotalReplacedValues() == 1);

		// Test aggregateWith
		assertTrue(view2.aggregateWith(view1));
		assertTrue(view2.isValid());
		assertTrue(view2.getNbActualColumns() == 2);
		assertTrue(view2.getNbActualRows() == 4);
		assertTrue(view2.getNbSubViews() == 0);
		assertTrue(convModel.getTotalView() == 2);
		assertTrue(convModel.getTotalDimension() == 3);
		assertTrue(convModel.getTotalEntity() == 4);
		assertTrue(convModel.getTotalRows() == 8);
		assertTrue(convModel.getTotalReplacedValues() == 2);

		// Test filterRows and filterRow
		ArrayList<String> rowsNames = new ArrayList<String>();
		assertTrue(view1.filterRows(rowsNames));
		assertTrue(view1.isValid());
		assertTrue(convModel.getTotalRows() == 8);
		assertTrue(convModel.getTotalReplacedValues() == 2);
		assertTrue(convModel.getTotalFilteredRows() == 0);
		assertTrue(convModel.getTotalEntity() == 4);
		rowsNames.add("id1");
		rowsNames.add("id2");
		assertTrue(view1.filterRows(rowsNames));
		assertTrue(view1.isValid());
		assertTrue(convModel.getTotalRows() == 6);
		assertTrue(convModel.getTotalReplacedValues() == 2);
		assertTrue(convModel.getTotalFilteredRows() == 2);
		assertTrue(convModel.getTotalEntity() == 4);

		// Test filterView
		assertFalse(convModel.filterView("TrucKiExistePasHAHA"));
		assertTrue(convModel.filterView("View1"));
		assertTrue(convModel.getTotalView() == 1);
		assertTrue(convModel.getTotalDimension() == 2);
		assertTrue(convModel.getTotalEntity() == 4);
		assertTrue(convModel.getTotalRows() == 4);
		assertTrue(convModel.getTotalReplacedValues() == 1);
		assertTrue(convModel.getTotalFilteredView() == 1);
		assertTrue(convModel.getTotalFilteredRows() == 0);
		assertTrue(convModel.getTotalFilteredDimension() == 0);

		// Test filterCharacteristic
		assertFalse(convModel.filterCharacteristic("TrucKiExistePas"));
		assertTrue(convModel.filterCharacteristic("Characteristic1"));
		assertTrue(view1.isValid());
		assertTrue(view2.isValid());
		assertTrue(convModel.getTotalView() == 1);
		assertTrue(convModel.getTotalDimension() == 1);
		assertTrue(convModel.getTotalEntity() == 4);
		assertTrue(convModel.getTotalRows() == 4);
		/*
		 * replaced value == 1 - come from the aggregation of view 2 with view
		 * 1. View 1 as 1 replaced value that came into view 2.
		 */
		assertTrue(convModel.getTotalReplacedValues() == 1);
		assertTrue(convModel.getTotalFilteredView() == 1);
		assertTrue(convModel.getTotalFilteredRows() == 0);// view 1 filtered
		assertTrue(convModel.getTotalFilteredDimension() == 1);

		// view3 copy of view 1
		CSVParser view3 = view1.toCSVWriterDeepCopy().toCSVParserDeepCopy();
		// view 3 empty
		assertFalse(view3.filterColumn("TrucKiExistePas"));
		assertTrue(view3.filterColumn("Characteristic1"));
		assertTrue(view3.getNbActualColumns() == 0);
		assertTrue(view3.getNbActualRows() == view1.getNbActualRows());
		assertTrue(view3.getNbActualRows() == 2);
		assertTrue(view3.isValid());
		assertTrue(view2.getNbActualColumns() == 1);
		assertTrue(view2.getNbActualRows() == 4);
		// empty aggregation test
		view2.aggregateWith(view3);
		assertTrue(view2.isValid());
		assertTrue(view2.getNbActualColumns() == 1);
		assertTrue(view2.getNbActualRows() == 4);

		// Test of subviews
		view2.addSubView(view1);
		view2.aggregateWith(view1);
		assertTrue(view1.isValid());
		assertTrue(view2.isValid());
		assertTrue(view2.getNbSubViews() == 1);
		assertTrue(view2.getNbActualColumns() == 2);
		assertTrue(view2.isLabel("Characteristic1"));
		assertTrue(view2.isAmbiguousCharacteristic("Characteristic1") == 2);

		// filter entity with subview
		assertFalse(convModel.filterEntity("TrucKiExistePas"));
		assertTrue(convModel.filterEntity("id3"));
		assertTrue(view1.isValid());
		assertTrue(view2.isValid());
		assertTrue(convModel.getTotalEntity() == 3);
		assertTrue(view2.getNbActualRows() == 3);
		assertTrue(view1.getNbActualRows() == 1);

		// FMLConvert conv = new FMLConvert(convModel);
		// conv.convert();
		// normal : thrown exception

	}

	@Test
	public void Test2() throws Exception {
		String input = "ID,Composed,Char1\n\r" + "id1,HAHA, truc;truc2;truc3;Yes;No\n\r" + "id2,HIHI, Yes\n\r" + "id3,HOHO, No\n\r"
				+ "id4,HUHU, \n\r";
		CSVParser view1 = new CSVParser(input, ",", "View1", "N_A", "ID");
		assertTrue(view1.isValid());
		String[] str = { "Composed" };
		ConversionModel convModel = new ConversionModel("Test", str);
		String input2 = "ID,Composed,Char2\n\r" + "id1,HAHA, N_A\n\r" + "id2,HIHI, Partial\n\r" + "id3,HOHO, Haha\n\r"
				+ "id4,HUHU, Opt;voila;boum\n\r";
		CSVParser view2 = new CSVParser(input2, ",", "View2", "N_A", "ID");
		assertTrue(view2.isValid());
		view2.addSubView(view1);
		view2.setMultiValuedSpecialModeForLabel("Char2", MultiValuedMode.OR);
		convModel.addView(view2);

		FMLConvert conv = new FMLConvert(convModel);
		conv.convert();
		assertTrue(conv.getNbMultiValued() == 2);
	}
}
