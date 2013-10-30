package CSVtoFML.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import fr.familiar.fm.FMLBDDReader;
import fr.familiar.interpreter.BDDStrategy;
import fr.familiar.operations.CountingStrategy;
import fr.familiar.operations.FMLMergerBDD;
import fr.familiar.operations.ImplicationGraphUtil;
import fr.familiar.operations.KSynthesis;
import fr.familiar.operations.KSynthesisBDD;
import fr.familiar.operations.KnowledgeSynthesis;
import fr.familiar.operations.Mode;
import fr.familiar.parser.FMBuilder;
import fr.familiar.parser.FMLCommandInterpreter;
import fr.familiar.parser.HierarchyMergerFactory;
import fr.familiar.parser.HierarchyMergerStrategy;
import fr.familiar.test.regression.FileUtils;
import fr.familiar.utils.FileSerializer;
import fr.familiar.variable.FeatureModelVariable;
import fr.familiar.variable.SetVariable;
import fr.familiar.variable.Variable;
import gsd.graph.DirectedCliqueFinder;
import gsd.graph.ImplicationGraph;
import gsd.synthesis.BDDBuilder;
import gsd.synthesis.Excludes;
import gsd.synthesis.Expression;
import gsd.synthesis.ExpressionType;
import gsd.synthesis.FeatureEdge;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureModel;
import gsd.synthesis.FeatureNode;
import gsd.synthesis.Formula;
import gsd.synthesis.IGBuilder;
import gsd.synthesis.Requires;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.xtext.example.mydsl.fML.FMFormat;

import CSVtoFML.CSVParser;
import CSVtoFML.ConversionModel;
import CSVtoFML.FMLConvert;
import CSVtoFML.StoFMLReader;
import Exceptions.NotValidCSVFileException;

import com.google.common.collect.Sets;

public class StoFMLReaderWikiMatrixTest extends CSVtoFMLTests {

	// TODO: to be managed in FMLConvert
	private String _WikiMatrixPath = "Ressources/usesCases/wikiMatrixDSL/filters/";
	
	
	private boolean _orGroupSupport = true ;

	@Test
	public void testGenerationFMLTemplate1() throws Exception {

		String stofmFileName = _WikiMatrixPath + "template1.stofm";
		try {
			FMLConvert converter = new StoFMLReader().execute(new File(
					stofmFileName));
			assertNotNull(converter);
			converter.convert();
			String finalFML = converter.getFinalFAMILIARScript();
			assertNotNull(finalFML);
			converter.writeFinalFAMILIARScriptToFile("output/template1.fml");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);
	}
	
	@Test
	public void testVaMoSLaptop() throws Exception {
		
		
		String path = "Ressources/usesCases/SPLOT-LAPTOP-CATALOG/" ; 
		String exampleName = "DELL-LAPTOP";
		String fullFileName = path + exampleName ; 
		// TODO: another test: fullFileName = _WikiMatrixPath + "paperExample"; 
		//serializeBDDs(fullFileName, true);
		//runExampleBDDs(fullFileName);
		runExampleProperTunedMerging(fullFileName);
		
	}
	
	@Test
	public void testVaMoSBikes() throws Exception {

		String path = "Ressources/usesCases/SPLOT-BIKES-CATALOG/" ; 
		String exampleName = "TREK_BIKES";
		String fullFileName = path + exampleName ; 
	
		_orGroupSupport  = false ;
		runExampleProperTunedMerging(fullFileName);
		
		
		
	}
	
	@Test
	public void testVaMoSBikes1() throws Exception {

		String path = "Ressources/usesCases/SPLOT-BIKES-CATALOG/" ; 
		String exampleName = "TREK_BIKES1";
		String fullFileName = path + exampleName ; 
		_orGroupSupport  = false ;
		runExampleProperTunedMerging(fullFileName);
	}
	
	@Test
	public void testVaMoSBikes2() throws Exception {

		String path = "Ressources/usesCases/SPLOT-BIKES-CATALOG/" ; 
		String exampleName = "TREK_BIKES2";
		String fullFileName = path + exampleName ; 
		_orGroupSupport  = false ;
		runExampleProperTunedMerging(fullFileName);
	}
	
	@Test
	public void testVaMoSPaaS() throws Exception {

		String path = "Ressources/usesCases/PaaS/" ; 
		String exampleName = "PaaS_Comparison";
		String fullFileName = path + exampleName ; 
		runExampleProperTunedMerging(fullFileName);
		
	}
	
	@Test
	public void testVaMoSWMExample() throws Exception {

		
		String fullFileName = _WikiMatrixPath + "paperExample"; 
		runExampleProperTunedMerging(fullFileName);
		
		/*
		
		FeatureModel<String> fmv = FMBuilderAnalyzer.getInternalFM("FM (" + "WikiMatrix: General ; " +
				"General: (LicenseCostFee|Unicode)+ Language? License Storage? RSS ; " +
				"LicenseCostFee: (DifferentLicences|US10|Community)? ; " +
				"Language: (Java|Python|PHP|Perl) ; " +
				"License: (GPL|Commercial|GPL2|Nolimit) ; " +
				"Storage: (Files|Database|FileRCS) ;" + ")");
		
		
		
		System.err.println("#" + new FeatureModelVariable("", fmv).countingBDD()); 
		
		FeatureModel<String> fmvOver = FMBuilderAnalyzer.getInternalFM("FM (" + "WikiMatrix ; " +
		 "WikiMatrix: General ; " +
		 "General: (LicenseCostFee|Unicode)+ (LicenseCostFee|Storage)+ (Language|LicenseCostFee)+ License RSS ;" + 
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
		 "(US10 <-> Java);"  + ")"); 
		
		System.err.println("#" + new FeatureModelVariable("", fmvOver).countingBDD()); 
		*/
		
	}
	
	
	@Test
	public void testLopez2011WCRE() throws Exception {
		String exampleName = "Ressources/usesCases/lopez2011/" + "lopez2011";
		runExampleProperTunedMerging(exampleName);
		
		//runExampleTunedMerging(exampleName);
	}
	
	
	@Test
	public void testVaMoSHartmann() throws Exception {

		String path = "Ressources/usesCases/hartmann/" ; 
		String exampleName = "hartmann2009";
		String fullFileName = path + exampleName ; 
	
		runExampleProperTunedMerging(fullFileName);
		
	}

	@Test
	public void testGenerationFMLPaperExample1() throws Exception {

		String exampleName = _WikiMatrixPath + "small1";
		runExampleProperTunedMerging(exampleName);
		//runExample(exampleName);
	}
	
	@Test
	public void testProperGenerationFMLPaperExample1() throws Exception {

		String exampleName = _WikiMatrixPath + "paperExample";
		runExampleProperTunedMerging(exampleName);
	}

	@Test
	public void testGenerationFMLPaperExample2() throws Exception {

		String exampleName = _WikiMatrixPath + "small2";
		runExampleProperTunedMerging(exampleName);
		
		//runExample(exampleName);

	}

	@Test
	public void testGenerationFMLSmall3() throws Exception {
		String exampleName = _WikiMatrixPath + "small3";
		runExampleProperTunedMerging(exampleName);
		
		//runExampleTunedMerging(exampleName);
	}

	@Test
	public void testGenerationFMLSmall4() throws Exception {
		String exampleName = _WikiMatrixPath + "small4";
		_shell.setVerbose(true);
		runExampleProperTunedMerging(exampleName);
		//runExampleTunedMerging(exampleName);
	}

	@Test
	public void testGenerationFMLSmall5() throws Exception {
		String exampleName = _WikiMatrixPath + "small5";
		runExampleProperTunedMerging(exampleName);
		//runExampleTunedMerging(exampleName);
	}

	/*
	 * testGenerationFML* nProducts = number of products / entities to be
	 * considered nViews = number of views (e.g., CSV files) to be considered
	 * nFeatures = total number of characteristics to be considered
	 * 
	 * 
	 * 13 december: At the moment, we consider only nProducts and nViews (it
	 * gives an overapproximation) but we should only consider nProducts and
	 * nFeatures (the meaningful metrics)
	 * 
	 * Convention naming: test_NP=x_NV=y
	 * 
	 * with x the number of products and y the number of views
	 */

	@Test
	public void testGenerationFML1() throws Exception {
		String exampleName = _WikiMatrixPath + "test_NP=15_NV=3";
		runExampleProperTunedMerging(exampleName);
		//runExampleTunedMerging(exampleName);
	}

	
	@Test
	public void testGenerationBig1() throws Exception {
		String exampleName = _WikiMatrixPath + "testAll";
		runExampleProperTunedMerging(exampleName);
		//runExampleTunedMerging(exampleName);
	}

	private void runExampleBDDs(String exampleName) throws IOException {

		String outputBDD = "output/" + exampleName + "/";

		File dir = new File(outputBDD);
		assert (dir.exists() && dir.isDirectory());

		String[] files = dir.list();
		List<Formula<String>> flas = new ArrayList<Formula<String>>();
		BDDBuilder<String> lbuilder = FMLCommandInterpreter.getBuilder();
		for (int i = 0; i < files.length; i++) { // +1 for hierarchy
			String file = files[i];
			if (!file.endsWith(".fmlbdd")) 
				continue;
			
			FMLBDDReader reader = new FMLBDDReader(outputBDD + file, lbuilder);
			flas.add(reader.getFormula());
			
		}
		
		File fileHierarchy = new File(outputBDD + "fm.hierarchy");
		FeatureModel<String> fmProj = FMBuilder.getInternalFM("FM (" 
				+ FileUtils.read(fileHierarchy) + ")");
		System.err.println("...hierarchy computation done...");
		System.err.println("fmProj=" + fmProj);
		System.err.println("#features=" + fmProj.features().size());

		Formula<String> flaMerged = FMLMergerBDD.calculateFormulas(flas,
				Mode.StrictUnion, _builder);
		System.err.println("...formula computation done...");
		//System.err.println("#flaMerged=" + countingFormula(flaMerged));
		//System.err.println("[[flaMerged]]=" + new AllConfigsBDD(_builder).process(flaMerged, 5));
		System.err.println("#features (fla)=" + flaMerged.getDomain().size());
		
		synthesizeFD (flaMerged, fmProj);
		
		

	}

	private FeatureModelVariable synthesizeFD(Formula<String> flaMerged, FeatureModel<String> fmProj) {
		
		double nFM = countingFormula(flaMerged);
		System.err.println("#fla=" + nFM);
		System.err.println("#features=" + flaMerged.getDomain().size());
		
		KSynthesis synthetizer = new KSynthesisBDD(flaMerged, new KnowledgeSynthesis(fmProj.getDiagram()), _builder)  ;
		
		synthetizer.setOrGroupSupport(_orGroupSupport);
		
		
		_shell.setVerbose(true);
		FeatureModelVariable fmvMerged = synthetizer.build() ; 
		System.err.println("DONE!");
		
		
		int nFeatures = fmvMerged.features().size() ; 
		int nLeaves = fmvMerged.leaves().size() ;
		int nMAND = countGroups(fmvMerged, FeatureEdge.MANDATORY);
		int nXOR = countGroups(fmvMerged, FeatureEdge.XOR) ; 
		int nOR = countGroups(fmvMerged, FeatureEdge.OR) ; 
		int nMUTEX = countGroups(fmvMerged, FeatureEdge.MUTEX) ; 
		int nBI = countBiImplies(fmvMerged) ; 
		int nI = countImplies(fmvMerged) ; 
		int nE = countExcludes(fmvMerged) ; 
		
		
		
		System.err.println("#features=" + nFeatures);
		System.err.println("#leaves=" + nLeaves);	
		System.err.println("#MAND=" + nMAND);
		System.err.println("#XOR=" + nXOR);
		System.err.println("#OR=" + nOR);
		System.err.println("#MUTEX=" + nMUTEX);
		System.err.println("#BIIMPLIES=" + nBI);
		System.err.println("#IMPLIES=" + nI);
		System.err.println("#EXCLUDES=" + nE);
		System.err.println("#FM=" + nFM);
		double nFD = fmvMerged.counting (CountingStrategy.BDD_FML) ; 
		System.err.println("#FD=" + nFD);
		
		System.err.println("fm=" + fmvMerged.getClass() + ":\n" + fmvMerged);
		
		
		
		
		
		String expResultsTable = nFeatures + " & " + nLeaves + " & " + nMAND + " & " + nMUTEX + 
		" & " + nXOR + " & " + nOR + " & " + nBI + " & " + nI + " & " + nE + " & " + nFD + " & " + nFM;
		
				
		System.err.println("RESULTS ====\n" + expResultsTable);
		
		return fmvMerged ;
		
		/*
		Formula<String> flaDiff = fmvMerged.diffFormula(flaMerged, _builder);
		System.err.println("#flaDiff" + countingFormula(flaDiff));
		
		
		Set<Set<String>> configs = new AllConfigsBDD(_builder).process(flaDiff, 2) ;
		for (Set<String> config : configs) {
			System.err.println("#counterExample: " + config ) ; // Sets.difference(config, fmvMerged.cores()));
		}
		*/
		
		
		
	}

	

	private int countMand(FeatureModelVariable fmvMerged) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void serializeBDDs(String exampleName, boolean splot) {

		String stofmFileName = exampleName + ".stofm";

		try {
			FMLConvert converter = new StoFMLReader().execute(new File(
					stofmFileName));
			assertNotNull(converter);

			/****
			 * we want to lead the merging process (e.g., to realize another
			 * merge strategy)
			 ****/
			converter.deactivateShowID();
			converter.convertWithoutMerging(); // TODO: no effect on the final
												// script (i.e., the simple
												// "convert" is equivalent)

			String finalFML = converter
					.getFinalFAMILIARScriptWithoutFinalMerging();
			assertNotNull(finalFML);
			converter.writeFinalFAMILIARScriptToFile("output/" + converter.getRootFeatureName()
					+ ".fml");

			converter.showStats();
			// _shell.setVerbose(true);
			_shell.parse(finalFML);

			// get the feature models to be merged
			SetVariable sv = getSetVariable("fm_*");
			assertEquals(new Integer(sv.size()), converter.getConversionModel()
					.getTotalEntity());
			String outputBDD = "output/" + exampleName + "/";
			List<FeatureModelVariable> lfmvs = setVariabletoFMVs(sv);

			Set<String> allFeatures = new HashSet<String>();
			for (FeatureModelVariable fmv : lfmvs) {
				Set<String> features = fmv.features().names();
				allFeatures.addAll(features);
			}
			
			/*
			 * serializing hierarchy
			 * now otherwise negated variables :(
			 */
			FeatureModel<String> fmProj =
					HierarchyMergerFactory.mkMerger(HierarchyMergerStrategy.BASIC, null, null).build(lfmvs) ;
			
			FileSerializer.write(outputBDD + "fm.hierarchy",
					fmProj.toString());
					

			
			/*
			int i = 0;
			for (FeatureModelVariable fmv : lfmvs) {
				FileSerializer.write(outputBDD + "" + i++ + ".fml",
						fmv.getFm() + "");
			}
			*/
			
			for (FeatureModelVariable fmv : lfmvs) {
				Set<String> features = fmv.features().names();
				Set<String> diff = Sets.difference(allFeatures, features);
				for (String featNotIncluded : diff) {
					Expression<String> nf = new Expression<String>(
							ExpressionType.NOT, new Expression<String>(
									featNotIncluded), null);
					fmv.getFm().addConstraint(nf);

					if (splot)
						addFreeVariableSPLOT(fmv.getFm(), featNotIncluded);
					else
						addFreeVariable(fmv.getFm(), featNotIncluded);
				}

			}
			
			
			
			int i = 0;
			for (FeatureModelVariable fmv : lfmvs) {
				FileSerializer.mkDir(outputBDD);

				System.err.println("serializing fmv=" + i);
				if (splot)
					_shell.setBDDStrategy(BDDStrategy.SPLOT);
				
			
				FileSerializer.write(outputBDD + "" + i++ + ".fmlbdd",
						fmv.convert(FMFormat.FMLBDD));
				
				
			}
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);

	}

	private void addFreeVariable(FeatureModel<String> fm, String featNotIncluded) {
		fm.getDiagram().addFreeVariable(featNotIncluded); // speed up: 1000%!!!!
	}

	private void addFreeVariableSPLOT(FeatureModel<String> fm,
			String featNotIncluded) {
		FeatureNode<String> ftSource = new FeatureNode<String>(featNotIncluded);
		fm.getDiagram().addVertex(ftSource);
		String rootName = new FeatureModelVariable("", fm).root().name();
		FeatureNode<String> ftTarget = fm.getDiagram().findVertex(rootName);
		fm.getDiagram().addEdge(ftSource, ftTarget, FeatureEdge.HIERARCHY);

	}
	
	
	/**
	 * We generate the feature model without a final, standard merge but with
	 * the following strategy:
	 *  (1) build the expected hierarchy without MST
	 *  (2) compute the formula
	 *  (3) query the formula to synthesize variability information
	 *  (4) compute implies / excludes
	 * 
	 * @param exampleName
	 */
	private void runExampleProperTunedMerging(String exampleName) {

		
		String stofmFileName = exampleName + "." + StoFMLReader.FILE_EXTENSION ; 

		try {
			FMLConvert converter = new StoFMLReader().execute(new File(
					stofmFileName));
			assertNotNull(converter);

			/****
			 * we redefine the "basic" merging process (e.g., to realize another
			 * merge strategy)
			 ****/
			converter.deactivateShowID();
			converter.convertWithoutMerging(); // TODO: no effect on the final
												// script (i.e., the simple
												// "convert" is equivalent)

			String finalFML = converter
					.getFinalFAMILIARScriptWithoutFinalMerging();
			assertNotNull(finalFML);
			
			String fileName = converter.getRootFeatureName()  ;
			
			converter.writeFinalFAMILIARScriptToFile("output/" + "VaMoS12/" + fileName
					+ ".fml");
			converter.showStats();

			_shell.parse(finalFML);
			SetVariable sv = getSetVariable("fm_*"); 		// get the feature models to be merged
			assertEquals(new Integer(sv.size()), converter.getConversionModel()
					.getTotalEntity());
			List<FeatureModelVariable> lfms = setVariabletoFMVs(sv);

			
			//_shell.setVerbose(true);
				
			/*
			 * (1) hierarchy
			 */
			FeatureModel<String> fmProj =
					HierarchyMergerFactory.mkMerger(HierarchyMergerStrategy.BASIC, null, null).build(lfms) ;
			
			
			/*
			 * (2) formula 
			 */
			Formula<String> flaMerged = 
					new FMLMergerBDD(lfms, _builder).calculateFormula(Mode.StrictUnion); 
			//	MergeAnalyzer.calculateSPLOTFormula(lfms, Mode.StrictUnion);// 
			
		
			
			// (3) query the formula to synthesize variability information
			
			FeatureModelVariable fmvMerged = synthesizeFD(flaMerged, fmProj);
			
			
			FileSerializer.write("output/" + "VaMoS12/" + fileName	+ ".fmlbdd", 				
					fmvMerged.convert(FMFormat.FMLBDD));
			

			//FeatureModelVariable fmvMergedFull = MergeAnalyzer.complementLazy(flaMerged, fmvMerged);
			//System.err.println("configs=" + setConfigToSetStr(fmvMergedFull.configs()));
			//System.err.println("#mergedFla=" + fmvMergedFull.getFormula().id().getDomain().size());
			//fmvMerged = MergeAnalyzer.complement(flaMerged, fmvMerged);
			//System.err.println("********** fmvMerged=" + fmvMergedFull.getFm());
			//System.err.println("#fmvMerged=" + fmvMergedFull.countingBDD());
			
			/*
			Set<String> cores = new FormulaAnalyzer<String>(flaMerged, _builder).computeCoreFeatures();
			System.err.println("cores=" + cores);
			
			Set<Set<String>> allConfigsFlaMerged = new AllConfigsBDD(_builder).process(flaMerged) ; 
			System.err.println("[[flaMerged]]=");
			for (Set<String> configFla : allConfigsFlaMerged) {
				System.err.println("\t" + Sets.difference(configFla, cores));
			}
			
			Set<Set<String>> allConfigs = setConfigToSetStr(fmvMerged.configs());
			System.err.println("[[fmvMerged]]=");
			for (Set<String> allConfig : allConfigs) {
				System.err.println("\t" + Sets.difference(allConfig, cores));
			}
			
			Set<Set<String>> missingConfigs = Sets.difference(allConfigs, allConfigsFlaMerged) ; 
			System.err.println("MISSING:");
			for (Set<String> missingConfig : missingConfigs) {
				System.err.println("\t" + Sets.difference(missingConfig, cores));
				System.err.println("\t\t" + Sets.difference(cores, missingConfig));
			}
			
			Formula<String> flaDiff = fmvMerged.diffFormula(flaMerged, _builder);
			System.err.println("#flaDiff" + countingFormula(flaDiff));
			
			
			Set<Set<String>> configs = new AllConfigsBDD(_builder).process(flaDiff, 2) ;
			for (Set<String> config : configs) {
				System.err.println("#counterExample: " + Sets.difference(config, cores));
			}
			*/
			
//			
//			
//			// construct groups
//			FMLShell.getInstance().printDebugMessage("After enforcing fgRender=" + fgRender + " with hierarchy=" + fmProj ) ;
//			
//			disambig.mkGroups(fgRender);
//			FMLShell.getInstance().printDebugMessage("After enforcing fgRender (2) =" + fgRender + " with hierarchy=" + fmProj ) ;
//							
//			FMLShell.getInstance().printDebugMessage("After simplifying constraints fgRender=" + fgRender + " with hierarchy=" + fmProj ) ;
//
//			String assigner = "mergedFM";
//
//			FeatureModelVariable fmv = new FeatureModelVariable(assigner, fgRender, flaMerged); 
//
//			/*
//			flaMerged = new FormulaAnalyzer<String>(flaMerged, FMLCommandInterpreter.getBuilder()).removeDeadFeatures();
//			if (lazy)
//				fmv = MergeAnalyzer.complementLazy(flaMerged, fmv);
//			else
//				fmv = MergeAnalyzer.complement(flaMerged, fmv);
//			*/	
//			fmv = new FeatureModelVariable(assigner, FeatureModelParser.parseString(fmv.getFm().toString()));
//			fmv.cleanup() ;
//			
//			System.err.println("fmv=" + fmv);
			

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);

	}

	/*
	 *  UTILITY FUNCTION
	 * 
	 */
	
	private int countBiImplies(FeatureModelVariable fmvMerged) {
		Set<Expression<String>> birequires = fmvMerged.getFm().getConstraints() ; 
		int i = 0 ; 
		for (Expression<String> bi : birequires) {
			ExpressionType type = bi.getType() ;
			if (type == ExpressionType.IFF) {
				i++ ; 
			}
		}
		return i;
	}

	/***
	 * 
	 * @param fmvMerged
	 * @return
	 */
	private int countImplies(FeatureModelVariable fmvMerged) {
		Set<Requires<String>> requires = fmvMerged.getFm().getRequires() ; 
		return requires.size();
	}
	
	private int countExcludes(FeatureModelVariable fmvMerged) {
		Set<Excludes<String>> excludes = fmvMerged.getFm().getExcludes() ; 
		return excludes.size();
	}

	/**
	 * utility function
	 * @param fmvMerged
	 * @param xor
	 * @return
	 */
	private int countGroups(FeatureModelVariable fmvMerged, int edgeType) {
		FeatureGraph<String> fg = fmvMerged.getFm().getDiagram() ;
		Set<FeatureEdge> edges = fg.selectEdges(edgeType);
		return edges.size();
	}

	private Set<Expression<String>> computeBiImpliesEdge(
			Formula<String> fla, BDDBuilder<String> builder) {
		ImplicationGraph<String> graphImplies = IGBuilder.build(fla, builder);
		List<Set<String>> cliques = DirectedCliqueFinder.INSTANCE.findAll(graphImplies);
		System.err.println("cliques=" + cliques);
		Set<Expression<String>> r = ImplicationGraphUtil.toExpressionsWithBiImply(graphImplies);
		return r ; 
	}

	

	/**
	 * We generate the feature model without a final, standard merge but with
	 * different strategies (see below)
	 * 
	 * @param exampleName
	 */
	private void runExampleTunedMerging(String exampleName) {

		String stofmFileName = _WikiMatrixPath + exampleName + ".stofm";

		try {
			FMLConvert converter = new StoFMLReader().execute(new File(
					stofmFileName));
			assertNotNull(converter);

			/****
			 * we want to lead the merging process (e.g., to realize another
			 * merge strategy)
			 ****/
			converter.convertWithoutMerging(); // TODO: no effect on the final
												// script (i.e., the simple
												// "convert" is equivalent)

			String finalFML = converter
					.getFinalFAMILIARScriptWithoutFinalMerging();
			assertNotNull(finalFML);
			converter.writeFinalFAMILIARScriptToFile("output/" + exampleName
					+ ".fml");

			converter.showStats();

			// converter.showStats();

			/****** merging ********/
			// we could do that either:
			// (0) calculate the formula
			// (1) Czarnecki's algorithm (internal API)
			// (2) merge sunion fm_* (default solution)
			// (3) SPLAR optimization
			// (4) Skeleton optimization
			// _shell.setVerbose(true);
			_shell.parse(finalFML);

			// get the feature models to be merged
			SetVariable sv = getSetVariable("fm_*");
			assertEquals(new Integer(sv.size()), converter.getConversionModel()
					.getTotalEntity());
			List<FeatureModelVariable> lfms = setVariabletoFMVs(sv);

			/*
			 * System.out.println("begin ref based"); FeatureModel<String>
			 * fmRefBased =
			 * MergeAnalyzer.mergeFMVsWithConstraints(setVariabletoFMVs(sv),
			 * Mode.StrictUnion); FeatureModelVariable fmvRefBased = new
			 * FeatureModelVariable("", fmRefBased) ;
			 * fmvRefBased.getSPLOTSATReasoner().isConsistent();
			 * System.out.println("end ref based");
			 */

			// .getSPLOTSATReasoner();

			// (0) calculate the formula
			_shell.setVerbose(true);
			Formula<String> fmla = new FMLMergerBDD(lfms, _builder).calculateFormula(Mode.StrictUnion); // MergeAnalyzer.calculatecalculateSPLOTFormula(lfms,
										// Mode.StrictUnion);
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
			 * System.out.println("(configs) #" + finalFMName + "=" +
			 * mergedFinalFM.counting()); System.out.println("(features) #" +
			 * finalFMName + "=" + mergedFinalFM.features().size());
			 * FileSerializer.write("output/dot/" + exampleName + ".dot",
			 * mergedFinalFM.toDOT());
			 */

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);

	}

	private List<FeatureModelVariable> setVariabletoFMVs(SetVariable sv) {
		List<FeatureModelVariable> lfms = new ArrayList<FeatureModelVariable>();
		if (sv.size() == 0)
			return lfms;

		Set<Variable> svars = sv.getVars();
		for (Variable svar : svars) {
			if (svar instanceof FeatureModelVariable)
				lfms.add(((FeatureModelVariable) svar));
			else {
				Assert.fail("Not a feature model: svar=" + svar);
			}

		}

		return lfms;
	}

	/**
	 * @param sv
	 *            a set variable to be converted into a list of feature models
	 * @return a list of feature models (internal representation) from a
	 *         SetVariable
	 */
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

	/**
	 * A generic function / facility to test examples (call the converter, check
	 * non null objects, etc.)
	 * 
	 * @param exampleName
	 */
	private void runExample(String exampleName) {
		String stofmFileName = _WikiMatrixPath + exampleName + ".stofm";
		try {
			FMLConvert converter = new StoFMLReader().execute(new File(
					stofmFileName));
			assertNotNull(converter);
			converter.convert();

			String finalFML = converter.getFinalFAMILIARScript();
			assertNotNull(finalFML);
			converter.writeFinalFAMILIARScriptToFile("output/" + exampleName
					+ ".fml");

			String finalFM = converter.getFinalFeatureModel(true);
			assertNotNull(finalFM);
			System.out.println("\tfinalFM=" + finalFM);
			String finalFMName = "mergedFinalFM";
			_shell.parse(finalFMName + " = " + finalFM);
			FeatureModelVariable mergedFinalFM = getFMVariable(finalFMName);
			System.out.println("(configs) #" + finalFMName + "="
					+ mergedFinalFM.counting());
			System.out.println("(features) #" + finalFMName + "="
					+ mergedFinalFM.features().size());
			FileSerializer.write("output/dot/" + exampleName + ".dot",
					mergedFinalFM.toDOT());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception " + e + " occurs");
		}

		assertTrue(true);

	}

	@Test
	public void testGenStoFM() throws Exception {

		//testGenStoFM(10, 2, 5);
		//testGenStoFM(15, 2, 5);
		
		_orGroupSupport = true ; 
		//testGenStoFM(20, 2, 7);
		testGenStoFM(20, 3, 4);
		//testGenStoFM(30, 2, 7);
		//testGenStoFM(20, 2, 8);
		//testGenStoFM(10, 5, 5);
		// testGenStoFM(30, 5, 5); // scale
		/*
		 * #flaMerged=29548.0 #Yes : 223 #No : 178 #N/A : 104 #Special Values :
		 * 245 (14 seconds - 750 values - 662 features)
		 */
		 //testGenStoFM(20, 11, 5); // scale
		//testGenStoFM(25, 11, 5); 
		/*
		 * #flaMerged=5.54623412984E11 #Yes : 277 #No : 257 #N/A : 248 #Special
		 * Values : 318 (14 seconds - 1100 values - 351 features)
		 */
		// testGenStoFM(20, 12, 5); // scale #flaMerged=1.7734492535736E13
		/*
		 * #Yes : 286 #No : 280 #N/A : 281 #Special Values : 353 (15 seconds -
		 * 1200 values - 391 features)
		 */
		// testGenStoFM(20, 10, 12); // scale
		/*
		 * #flaMerged=7.393109258471381E19 #Yes : 439 #No : 474 #N/A : 364
		 * #Special Values : 523 (21 seconds - 1800 values - 526 features)
		 */
		 //testGenStoFM(20, 11, 12); // scale
		/*
		 * #flaMerged=2.361471507014143E21 #Yes : 473 #No : 515 #N/A : 384
		 * #Special Values : 548 (21 seconds - 1920 values - 550 features)
		 */
		// testGenStoFM(20, 11, 15); // scale
		/*
		 * #flaMerged=9.449344792532257E21 #Yes : 494 #No : 543 #N/A : 395
		 * #Special Values : 568 (22 seconds - 2000 values - 570 features)
		 */
		//testGenStoFM(40, 11, 12); // scale
		/*
		 * #flaMerged=2.3614715070142103E21 #Yes : 1141 #No : 1007 #N/A : 527
		 * #Special Values : 1165 (61 seconds - 3840 values - 899 features)
		 */

		// testGenStoFM(40, 11, 15); // scale
		/*
		 * #flaMerged=9.449344792532324E21 #Yes : 1192 #No : 1064 #N/A : 540
		 * #Special Values : 1204 (63 seconds - 4000 values - 928 features)
		 */
		// testGenStoFM(80, 11, 12); // scale
		/*
		 * #flaMerged ~= unknown #Yes : 2093 #No : 2103 #N/A : 1097 #Special
		 * Values : 2387 Total : 7680 (317 seconds - 4000 values - 1542
		 * features)
		 */
		// testGenStoFM(120, 10, 8); // scale
		/*
		 * #Yes : 2441 #No : 2415 #N/A : 1296 #Special Values : 2848 (671
		 * seconds - 9000 values)
		 */
		// testGenStoFM(120, 11, 15); // scale
		/*
		 * #Yes : 3314 #No : 3353 #N/A : 1701 #Special Values : 3632 (1000
		 * seconds - 12000 values - 2126 features)
		 */
		// testGenStoFM(120, 11, 20); // scale
		/*
		 * #Yes : 3414 #No : 3448 #N/A : 1727 #Special Values : 3651 Total :
		 * 12240 (1011 seconds - 12240 values - 2137 features)
		 */
		// testGenStoFM(120, 13, 30);
		/*
		 * #Yes : 3560 #No : 3911 #N/A : 2056 #Special Values : 4153 (1433
		 * seconds - 13680 valeurs - 2532 features)
		 */
		/*
		  * 
		  */
	}

	/**
	 * @param nProducts
	 * @param nViews
	 * @param nFeatures
	 * @throws IOException
	 * @throws NotValidCSVFileException
	 *             generate an stofm file (from the example of WikiMatrix) with
	 *             nViews, nFeatures max per View and nProducts
	 */
	private void testGenStoFM(int nProducts, int nViews, int nFeatures)
			throws IOException, NotValidCSVFileException {
		generateRandomlyWikiMatrixStoFM(nProducts, nViews, nFeatures);
		String exampleName = getStoFMName(nProducts, nViews, nFeatures);
		//serializeBDDs(_WikiMatrixPath + exampleName, true);
		
		//runExampleBDDs(_WikiMatrixPath + exampleName);
		
		runExampleProperTunedMerging(_WikiMatrixPath + exampleName);
		
		// runExampleTunedMerging(exampleName);

	}

	private String getStoFMName(int nProducts, int nViews, int nFeatures) {
		return getStoFMName(nProducts, nViews) + "_" + "NFT=" + nFeatures;
	}

	private String getStoFMName(int nProducts, int nViews) {
		return "test_NP=" + nProducts + "_" + "NV=" + nViews;
	}

	public void generateRandomlyWikiMatrixStoFM(int nProducts, int nViews,
			int nFeatures) throws IOException, NotValidCSVFileException {

		assert (nProducts > 0 && nViews > 0);

		String csvLocationFolder = "Ressources/usesCases/wikiMatrixDSL/CSV/";

		Map<String, String> csvViews = new HashMap<String, String>();
		csvViews.put("CommonFeatures.csv", "common");
		// csvViews.put("Functionalities.csv", "functionalities") ;
		csvViews.put("CommonFeatures.csv", "common");
		csvViews.put("HostingFeatures.csv", "hosting");
		csvViews.put("Output.csv", "output");

		csvViews.put("Statistics.csv", "statistics");
		csvViews.put("SystemRequirements.csv", "sysrequirements");
		csvViews.put("Datastorage.csv", "datastorage");
		// csvViews.put("General.csv", "general") ;
		csvViews.put("Links.csv", "links");

		// csvViews.put("Requirements.csv", "requirements") ;
		csvViews.put("Usability.csv", "usability");
		csvViews.put("Extras.csv", "extra");
		csvViews.put("GeneralFeatures.csv", "generalFts");

		csvViews.put("MediaandFiles.csv", "media");
		csvViews.put("SpecialFeatures.csv", "special");
		csvViews.put("SyntaxFeatures.csv", "syntax");

		Map<String, String> csvRestrictedViews = new HashMap<String, String>();
		int nv = 0;
		for (String csvFile : csvViews.keySet()) {
			if (nv++ == nViews)
				break;
			csvRestrictedViews.put(csvFile, csvViews.get(csvFile));
		}

		assertEquals(csvRestrictedViews.size(), nViews);

		/***** "collect" products ***********/
		ConversionModel convModel = new ConversionModel("test_foo_"
				+ getStoFMName(nProducts, nViews));

		Set<String> commonProductIdentifiers = new HashSet<String>();
		boolean firstView = true;
		for (String csvFile : csvRestrictedViews.keySet()) {
			String csvView = csvRestrictedViews.get(csvFile);
			String exampleCSVName = csvLocationFolder + "" + csvFile;
			CSVParser csvParser = new CSVParser(new FileReader(new File(
					exampleCSVName)), ",", csvView, "N/A", "Identifior");
			convModel.addView(csvParser);
			Iterator<String> ids = convModel.getView(csvView)
					.getRowIdentifierIterator();
			Set<String> productIdentifiers = new HashSet<String>();
			while (ids.hasNext()) {
				String id = ids.next();
				productIdentifiers.add(id);
			}

			if (firstView) {
				commonProductIdentifiers.addAll(productIdentifiers);
				firstView = false;
			} else {
				commonProductIdentifiers = Sets.intersection(
						commonProductIdentifiers, productIdentifiers);
			}

		}

		assertEquals(convModel.getTotalView(), new Integer(nViews));
		assertTrue(nProducts <= commonProductIdentifiers.size());

		System.err.println("#commonProductIdentifiers="
				+ commonProductIdentifiers.size());

		String sToFM = "import: \n\n";
		for (String csvFile : csvRestrictedViews.keySet()) {
			String importInstr = "\"" + csvLocationFolder + "" + csvFile + "\""
					+ " as " + csvViews.get(csvFile) + "\n";
			sToFM += importInstr;
		}
		sToFM += "\n";

		String defaultValues = "name: \"WikiMatrix\"\n" + "\n" + "\n"
				+ "default: \n" + "	parsing:\n" + "	 	key: \"Identifior\"\n"
				+ "	";

		sToFM += defaultValues;

		sToFM += "only_products: ";
		int nc = 0;
		for (String productId : commonProductIdentifiers) {
			if (nc++ == nProducts)
				break;
			String productName = "\"" + productId + "\"";
			sToFM += productName + " ";
		}
		sToFM += "\n\n";

		assertEquals(nc - 1, nProducts);

		for (String csvFile : csvRestrictedViews.keySet()) {
			String csvView = csvViews.get(csvFile);
			String importViewInstr = "view: " + csvView + "\n";

			importViewInstr += "only_features: ";
			Iterator<String> labels = convModel.getView(csvView)
					.getHeadLabelsIterator();
			int nL = 0;
			while (labels.hasNext()) {
				if (nL++ == nFeatures)
					break;
				String label = labels.next();
				importViewInstr += "\"" + label + "\" ";
			}
			importViewInstr += "\n\n";

			sToFM += importViewInstr;

		}
		sToFM += "\n\n";

		FileSerializer.write(_WikiMatrixPath + getStoFMName(nProducts, nViews, nFeatures)
				+ "." + StoFMLReader.FILE_EXTENSION, sToFM);

	}

}
