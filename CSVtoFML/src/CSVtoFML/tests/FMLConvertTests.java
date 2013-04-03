package CSVtoFML.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import CSVtoFML.CSVParser;
import CSVtoFML.ConversionModel;
import CSVtoFML.ConversionModelArray;
import CSVtoFML.ConversionModelGenerator;
import CSVtoFML.FMLConvert;
import CSVtoFML.MultiValuedMode;
import Exceptions.ErrorInFMLConversion;
import Exceptions.NotValidCSVFileException;
import fr.unice.polytech.modalis.familiar.operations.FMLMergerBDD;
import fr.unice.polytech.modalis.familiar.operations.Mode;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.FeatureModel;
import gsd.synthesis.Formula;

@Ignore
public class FMLConvertTests extends CSVtoFMLTests {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() {
		super.tearDown();
	}

	private void showSet(Set<String> set) {
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void conversionTest1() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc12, truc23";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(fmlConverter.getViewsNameSet().size() == 1);
			assertTrue(fmlConverter.getViewsNameSet().contains("Test"));
			assertTrue(fmlConverter.getRootFeatureName().compareTo("TESTRF") == 0);
			assertTrue(fmlConverter.getNameSpaceSize() == 13);
			assertTrue(fmlConverter.getNbIdentifierScript() == 3);
			assertTrue(fmlConverter.getNumberEntriesFeatureModel() == 3);
			assertTrue(fmlConverter.getViewsNameSet().size() == 1);
			assertTrue(fmlConverter.collectVariableViews().get("Id1_Test").compareTo("") != 0);
			assertTrue(fmlConverter.collectVariableViews().get("Id2_Test").compareTo("") != 0);
			assertTrue(fmlConverter.collectVariableViews().get("Id2_Test").contains("Truc2"));
			assertTrue(fmlConverter.collectVariableViews().get("Id3_Test").compareTo("") != 0);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

	@Test
	public void conversionTest2() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("Test ", compIDarr);
			conv.addView(new CSVParser(input, ",", " test", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(false);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			assertTrue(e.getMessage(), e.getMessage().compareTo("One of you view is use an already used name ! test") == 0);
		}

	}

	@Test
	public void conversionTest3() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTRF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			conv.addView(new CSVParser(input, ",", "Test25", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(true);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		}
	}

	@Test
	public void conversionTest4() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			showSet(fmlConverter.getNameSpace());
			assertTrue(fmlConverter.getNameSpaceSize() == 11);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		}
	}

	@Test
	public void conversionTest5() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc1";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			showSet(fmlConverter.getNameSpace());
			assertTrue(fmlConverter.getNameSpaceSize() == 12);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		}
	}

	@Test
	public void conversionTest6() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1;gigi;hoho;Yes;No;N_A;Partial, truc2\nid3,truc1, truc1";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			ConversionModelArray convArr = new CSVParser(input, ",", "Test", "N_A", "ID");
			convArr.setMultiValuedSpecialModeForLabel("test1", MultiValuedMode.XOR);
			conv.addView(convArr);
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			// TODO verify but look ok :D
			// System.out.println(fmlConverter.getFinalFAMILIARScript());
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		}
	}

	@Test
	public void conversionTest7() {
		String input = "ID,car1,car2,car3\nid1,v1,v2,v3\nid2,v4,v5,v6\nid3,v7,v8,v9";
		String input2 = "ID,car4,car5,car6\nid1,v10,v11,v12\nid2,v13,v14,v15\nid3,v16,v17,v18";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			ConversionModelArray convArr = new CSVParser(input, ",", "Test", "N_A", "ID");
			ConversionModelArray subConvArr = new CSVParser(input2, ",", "SubView", "N_A", "ID");
			convArr.addSubView(subConvArr);
			conv.addView(convArr);
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			// TODO verify but look ok :D
			System.out.println(fmlConverter.getSkeleton().toFMLFeatureModel());
			System.out.println(fmlConverter.getFinalFAMILIARScript());
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		}
	}

	@Test
	public void specialFunctionTest1() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(fmlConverter.deleteEntity("Id1"));
			assertTrue(fmlConverter.getNbIdentifierScript() == 2);
			assertTrue(fmlConverter.getNumberEntriesFeatureModel() == 2);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void specialFunctionTest2() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		String input2 = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			conv.addView(new CSVParser(input2, ",", "Test5", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(fmlConverter.deleteEntity("Id1"));
			assertTrue(fmlConverter.getNbIdentifierScript() == 2);
			assertTrue(fmlConverter.getNumberEntriesFeatureModel() == 4);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void specialFunctionTest3() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		String input2 = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			conv.addView(new CSVParser(input2, ",", "Test5", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(fmlConverter.deleteViewEntity("Id1", "Test5"));
			assertTrue(fmlConverter.getNbIdentifierScript() == 3);
			assertTrue(fmlConverter.getNumberEntriesFeatureModel() == 5);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	public void specialFunctionTest4() {
		String input = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		String input2 = "ID,test1,test2,test3\nid1,\nid2,truc1, truc2\nid3,truc1, truc2";
		try {
			String[] compIDarr = {};
			ConversionModel conv = new ConversionModel("TESTF", compIDarr);
			conv.addView(new CSVParser(input, ",", "Test", "N_A", "ID"));
			conv.addView(new CSVParser(input2, ",", "Test5", "N_A", "ID"));
			FMLConvert fmlConverter = new FMLConvert(conv, true);
			fmlConverter.convert();
			assertTrue(fmlConverter.deleteViewEntity("Id1", "Test5"));
			assertTrue(fmlConverter.deleteViewEntity("Id1", "Test"));
			assertTrue(fmlConverter.getNbIdentifierScript() == 2);
			assertTrue(fmlConverter.getNumberEntriesFeatureModel() == 4);
		} catch (NotValidCSVFileException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	// 100 yes values
	@Test(timeout = 10000)
	public void scalabilityTest1C() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(10, 10);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}

	// 225 yes values
	@Test(timeout = 10000)
	public void scalabilityTest2C() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(15, 15);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}

	// 400 yes values
	@Test(timeout = 10000)
	public void scalabilityTest4C() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(20, 20);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}

	// 900 yes values
	@Test(timeout = 100000)
	public void scalabilityTest1K() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 890 yes - 10 textual values = 75 diff
	@Test(timeout = 300000)
	public void scalabilityTest1K10Textual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(10);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getFinalFAMILIARScript());
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 880 yes - 20 textual values = 85 diff
	@Test(timeout = 300000)
	public void scalabilityTest1K20Textual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(20);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		System.out.println(fmlConverter.getFinalFAMILIARScript());
		//runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 850 yes - 50 textual values
	@Test(timeout = 300000)
	public void scalabilityTest1K50Textual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(50);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 800 yes - 100 textual values
	@Test(timeout = 300000)
	public void scalabilityTest1K1CTextual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(100);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 550 yes - 250 textual values
	@Test(timeout = 300000)
	public void scalabilityTest1K2CTextual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(250);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 400 yes - 500 textual values
	@Test(timeout = 300000)
	public void scalabilityTest1K5CTextual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(30, 30);
		convModGen.setNbrTextual(500);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}

	// 2500 yes values
	@Test(timeout = 100000)
	public void scalabilityTest3K() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(50, 50);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		System.out.println(fmlConverter.getNameSpaceSize() + "   SIZE");
		assertTrue(true);
	}
	
	// 10000 yes values
	@Test(timeout = 100000)
	public void scalabilityTest10K() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(100, 100);
		ConversionModel convMod = convModGen.generate();
		assertTrue(convMod.getView("VIEW").isValid());
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 40000 yes values
	@Test(timeout = 200000)
	public void scalabilityTest40K() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(200, 200);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 39500 yes - 500 Textual values
	@Test(timeout = 400000)
	public void scalabilityTest40K5CTextual() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(200, 200);
		convModGen.setNbrTextual(500);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 39950 yes - 50 opt values
	@Test(timeout = 200000)
	public void scalabilityTest40KandOpt() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(200, 200);
		convModGen.setNbrOptional(50);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 39500 yes - 500 opt values
	@Test(timeout = 200000)
	public void scalabilityTest40Kand5Copt() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(200, 200);
		convModGen.setNbrOptional(500);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 3900 yes - 1000 opt values
	@Test(timeout = 400000)
	public void scalabilityTest40Kand1Kopt() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(200, 200);
		convModGen.setNbrOptional(1000);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}
	
	// 40000 yes values
	@Test(timeout = 1000000)
	public void scalabilityTest100K() throws Exception {
		ConversionModelGenerator convModGen = new ConversionModelGenerator(316, 317);
		ConversionModel convMod = convModGen.generate();
		FMLConvert fmlConverter = new FMLConvert(convMod, true);
		runExampleTunedMerging(fmlConverter);
		assertTrue(true);
	}


	private void runExampleTunedMerging(FMLConvert fmlConverter) {

		try {
			assertNotNull(fmlConverter);
			/****
			 * we want to lead the merging process (e.g., to realize another
			 * merge strategy)
			 ****/
			fmlConverter.convertWithoutMerging(); // TODO: no effect on the
													// final script
			// (i.e., the simple "convert" is
			// equivalent)
			String finalFML = fmlConverter.getFinalFAMILIARScriptWithoutFinalMerging();
			assertNotNull(finalFML);

			/****** merging ********/
			// we could do that either:
			// (0) calculate the formula
			// (1) Czarnecki's algorithm (internal API)
			// (2) merge sunion fm_* (default solution)
			// (3) SPLAR optimization
			// (4) Skeleton optimization
			_shell.setVerbose(true);
			_shell.parse(finalFML);

			// get the feature models to be merged
			SetVariable sv = getSetVariable("fm_*");
			assertEquals(new Integer(sv.size()), fmlConverter.getConversionModel().getTotalEntity());
			List<FeatureModelVariable> lfms = setVariabletoFMVs(sv);

			// (0) calculate the formula
			Formula<String> fmla = new FMLMergerBDD(lfms, _builder).calculateFormula(Mode.StrictUnion);
			double c = countingFormula(fmla);
			System.out.println("#" + c);
			System.out.println("(features)#" + fmla.getDomain().size());

			// (1) Czarnecki's algorithm (internal API)
			// FeatureModel<String> fmMerged =
			// MergeAnalyzer.calculateHypergraphWithSynthesis(lfms,
			// Mode.StrictUnion);
			// String finalFMName = "mergedFinalFM";
			// FeatureModelVariable mergedFinalFM = new
			// FeatureModelVariable(finalFMName, fmMerged);
			// (2) merge sunion fm_*

			// _shell.parse(finalFMName + " = " + "merge sunion fm_*");
			// FeatureModelVariable mergedFinalFM = getFMVariable(finalFMName);
			/*
			 * System.out.println("(configs) #" + finalFMName + "="
			 * + mergedFinalFM.counting());
			 * System.out.println("(features) #" + finalFMName + "="
			 * + mergedFinalFM.features().size());
			 * FileSerializer.write("output/dot/" + exampleName + ".dot",
			 * mergedFinalFM.toDOT());
			 */

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);

	}

	private List<FeatureModel<String>> setVariabletoFMs(SetVariable sv) {

		List<FeatureModel<String>> lfms = new ArrayList<FeatureModel<String>>();
		if (sv.size() == 0)
			return lfms;

		Set<Variable> svars = sv.getVars();
		for (Variable svar : svars) {
			if (svar instanceof FeatureModelVariable)
				lfms.add(((FeatureModelVariable) svar).getFm());
			else {
				Assert.fail("Not a feature model: svar=" + svar);
			}

		}

		return lfms;
	}
	
	private List<FeatureModelVariable> setVariabletoFMVs(SetVariable sv) {

		List<FeatureModelVariable> lfms = new ArrayList<FeatureModelVariable>();
		if (sv.size() == 0)
			return lfms;

		Set<Variable> svars = sv.getVars();
		for (Variable svar : svars) {
			if (svar instanceof FeatureModelVariable)
				lfms.add((FeatureModelVariable) svar);
			else {
				Assert.fail("Not a feature model: svar=" + svar);
			}

		}

		return lfms;
	}

}
