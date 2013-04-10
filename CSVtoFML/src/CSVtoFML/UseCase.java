package CSVtoFML;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import useCases.wikiMatrix.WikiMatrixToFMLConverter;
import Excel.ToExcel;
import Exceptions.ErrorInFMLConversion;
import Metric.DoubleMetric;
import Metric.IntegerMetric;
import Metric.Metric;
import Metric.TextualMetric;
import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.parser.FMLCommandInterpreter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.IntegerVariable;

/**
 * 
 * @author Charles Vanbeneden
 * editted by Oleksandr Taran
 * 
 */
public abstract class UseCase {

	protected Boolean _debug;
	protected ToFMLConverter _converter;
	protected Boolean _hasConverted;
	protected Boolean _viewIDs;
	private Integer _ent;
	private Integer _dim;

	private ToExcel _toExcel;
	
	protected FMLShell _shell;

	public UseCase(Boolean debug, Boolean viewIDs, FMLShell shell) {
		_debug = debug;
		_hasConverted = false;
		_viewIDs = viewIDs;
		_ent = 0;
		_dim = 0;
		_shell = shell;
		_toExcel = new ToExcel();
	}
	
	public UseCase(Boolean debug, Boolean viewIDs) {
		this(debug, viewIDs, FMLShell.instantiateStandalone(System.in));
	}

	public void conversion() throws Exception {
		_hasConverted = true;
	}

	private void filterCSVParsers(Set<CSVParser> parsers) {
	}

	private void filterFMLConverter(FMLConvert converter) {
	}

	/*
	 * edited by Taran
	 */
	public void showBaseMetrics() throws Exception {
		if (!_hasConverted)
			conversion();
		_ent = _converter.getConversionModel().getTotalEntity();
		_dim = _converter.getConversionModel().getTotalDimension();
		System.out.println("-Base");
		System.out.println("#Files : " + _converter.getConversionModel().getTotalView());
		System.out.println("#Dimension : " + _converter.getConversionModel().getTotalDimension());
		System.out.println("#Rows : " + _converter.getConversionModel().getTotalRows());
		System.out.println("#Entity : " + _ent);
		System.out.println("#Values : " + _converter.getConversionModel().getTotalDimension() * _ent);
	}

	/*
	 * edited by Taran
	 */
	public void showMetrics(Boolean extended) throws Exception {
		Vector<Metric> metrics = new Vector<Metric>();
		Integer views = -1;
		Integer dimensions = -1;
		Integer values = -1;
		
		if (!_hasConverted)
			conversion();
		System.out.println();
		int entity = _converter.getConversionModel().getTotalEntity();
		System.out.println("-filtered");
		System.out.println("#Files : " + _converter.getConversionModel().getTotalFilteredView());
		System.out.println("#Label : " + _converter.getConversionModel().getTotalFilteredDimension());
		System.out.println("#Values : " + ((_ent * _dim) - (_converter.getConversionModel().getTotalDimension() * entity)));
		System.out.println("#Remplaced Values : " + _converter.getConversionModel().getTotalReplacedValues());
		System.out.println("-kept");
		System.out.println("#View : " + _converter.getConversionModel().getTotalView());
		System.out.println("#Dimension : " + _converter.getConversionModel().getTotalDimension());
		System.out.println("#Rows : " + _converter.getConversionModel().getTotalRows());
		System.out.println("#Values : " + (_converter.getConversionModel().getTotalDimension() * entity));
		System.out.println();
		
		views = _converter.getConversionModel().getTotalView();
		dimensions = _converter.getConversionModel().getTotalDimension();
		values = (_converter.getConversionModel().getTotalDimension() * entity);
		
		metrics.add(new IntegerMetric("views", views));
		metrics.add(new IntegerMetric("dimensions", dimensions));
		metrics.add(new IntegerMetric("entities", _ent));
		metrics.add(new IntegerMetric("values", values));
		
		System.out.println("-kept");
		System.out.println("#View : " + views);
		System.out.println("#Dimension : " + dimensions);
		System.out.println("#Entity : " + _ent);
		System.out.println("#Values : " + values);
		System.out.println();
		
		_toExcel.writeMetricsStep1(metrics);
		if(extended) {
			System.out.println("**************");
			System.out.println("Metrics for step 1 were written to the file " + _toExcel.getFileName() + "_step1" + "." + _toExcel.getExtensionName());
			System.out.println("**************\n");
		}
		
		System.out.println("--FML--");
		System.out.println("Showing Ids : " + _viewIDs);
		System.out.println("#Different Features ~ features before merging and FM per product construction : " + _converter.getFMLConverter().getNameSpaceSize());
		System.out.println("#Step 1 Entries FMs ~ #FM per product per view : " + _converter.getFMLConverter().getNumberEntriesFeatureModel());
		System.out.println("#Step 2 Entity FMs ~ #FM per product : " + _converter.getFMLConverter().getNbIdentifierScript());
		if (extended)
			System.out.println("#Step 3 Features : "
					+ numberFeaturesStep3(_converter.getFMLConverter().step1ToString(), _converter.getFMLConverter().step2ToString(),
							_converter.getFMLConverter().constructFMbyEntity().keySet()));
		System.out.println("#Step 3 lines : " + _converter.getFMLConverter().getNbLineScriptFinalStep());
		showMetricsFMPerProduct(_converter.getFMLConverter().constructFMbyEntity().keySet(), extended);
		System.out.println("-Values");
		System.out.println("#Yes : " + _converter.getFMLConverter().getNbMandatoryValue());
		System.out.println("#No : " + _converter.getFMLConverter().getNbDeadValue());
		System.out.println("#N/A : " + _converter.getFMLConverter().getNbOptionalValue());
		System.out.println("#Special Values : " + _converter.getFMLConverter().getNbTextualValue());
		System.out.println("Total : "
				+ (_converter.getFMLConverter().getNbMandatoryValue() + _converter.getFMLConverter().getNbDeadValue()
						+ _converter.getFMLConverter().getNbOptionalValue() + _converter.getFMLConverter().getNbTextualValue()));
		System.out.println();

	}
	
	private void showMetricsFMPerProduct(Set<String> set, Boolean extended) throws Exception {
		FMLCommandInterpreter _environment = null;
		Iterator<String> it = set.iterator();
		Vector<Metric> metrics = new Vector<Metric>();
		Integer metricsNumberPerFM = 25;
		
		String name = "";
		Integer nbFeatures;
		Integer mandatoryFeatures;
		Integer optionalFeatures;
		Integer deadFeatures;
		Integer	leaves;
		Integer depthOfTree;
		Integer edges;
		Integer mandatoryEdges;
		Integer optionalEdges;
		Integer groups;
		Integer mutexGroups;
		Integer xorGroups;
		Integer orGroups;
		Integer constraints;
		Integer implies;
		Integer biImplies;
		Integer excludes;
		Integer FMConfigurations;
		Double crossTreeConstraints;
		//Double ratioOfVariability;
		Double ratioOfVariabilityForFirstLayerFeatures;
		Double ratioOfVariabilityForSecondLayerFeatures;
		Integer childrenThirdLayer;
		Double flexibilityOfConfiguration;
		Double variabilityRate;

		System.out.println("\n***Metrics for FMs per product (aggregated from all views)***\n");
		
		while (it.hasNext()) {
			name = it.next();
			
			//retrieve FM
			_environment = _shell.getCurrentEnv();
			FeatureModelVariable fm = (FeatureModelVariable) _environment.getVariable(name);
			
			nbFeatures = fm.nbFeatures();
			mandatoryFeatures = new FMStatUtility(fm).ManFeaturesNumber();
			optionalFeatures = new FMStatUtility(fm).OptFeaturesNumber();
			deadFeatures = fm.deads().size();
			leaves = fm.leaves().size();
			depthOfTree = fm.depth();
			edges = (fm.nbFeatures()-1);
			mandatoryEdges = new FMStatUtility(fm).ManFeaturesNumber();
			optionalEdges = new FMStatUtility(fm).OptFeaturesNumber();
			groups = fm.getGroups().size();
			mutexGroups = fm.getMutexGroups().size();
			xorGroups = fm.getXorGroups().size();
			orGroups = fm.getOrGroups().size();
			constraints = fm.getAllConstraints().size();
			implies = fm.getImplicationConstraints().size();
			biImplies = fm.getBiImplicationConstraints().size();
			excludes = fm.getExcludeConstraints().size();
			FMConfigurations = fm.configs().size();
			crossTreeConstraints = new FMStatUtility(fm).getCrossTreeConstraints();
			//ratioOfVariability = fm.getRatioOfVariability();
			ratioOfVariabilityForFirstLayerFeatures = new FMStatUtility(fm).getRatioOfVariabilityForFirstLayerFeatures();
			ratioOfVariabilityForSecondLayerFeatures = new FMStatUtility(fm).getRatioOfVariabilityForSecondLayerFeatures();
			childrenThirdLayer = new FMStatUtility(fm).getNbNodesThirdLayer();
			flexibilityOfConfiguration = new FMStatUtility(fm).getFlexibilityOfConfiguration();
			variabilityRate = new FMStatUtility(fm).getVariabilityRateForIntegratedFM();
						
			System.out.println("FM name : " + name);
			//System.out.println("FM representation:\n" + fm.toString());
			System.out.println("#features : " + nbFeatures);
			System.out.println("#mandatory features : " + mandatoryFeatures);
			System.out.println("#optional features : " + optionalFeatures);
			System.out.println("#dead features : " + deadFeatures);
			System.out.println("#leaves : " + leaves);
			System.out.println("depth of tree : " + depthOfTree);
			System.out.println("#edges : " + edges);			//root feature does not have parent
			System.out.println("#mandatory edges : " + mandatoryEdges);
			System.out.println("#optional edges : " + optionalEdges);
			System.out.println("#groups : " + groups);
			System.out.println("#mutex-groups : " + mutexGroups);
			System.out.println("#xor-groups : " + xorGroups);
			System.out.println("#or-groups : " + orGroups);
			System.out.println("#constraints : " + constraints);
			System.out.println("#implies : " + implies);
			System.out.println("#bi-implies : " + biImplies);
			System.out.println("#excludes : " + excludes);
			System.out.println("#FM configurations : " + FMConfigurations);
			System.out.println("cross-tree constraints : " + crossTreeConstraints);
			//System.out.println("ratio of variability : " + ratioOfVariability);
			System.out.println("ratio of variability for 1st layer features : " + ratioOfVariabilityForFirstLayerFeatures);
			System.out.println("ratio of variability for 2nd layer features : " + ratioOfVariabilityForSecondLayerFeatures);
			System.out.println("children of 3rd layer : " + childrenThirdLayer);
			System.out.println("flexibility of configuration : " + flexibilityOfConfiguration);
			System.out.println("variability rate : " + variabilityRate);
			System.out.println();

			metrics.add(new TextualMetric("FM name", name));
			metrics.add(new IntegerMetric("features", nbFeatures));
			metrics.add(new IntegerMetric("mandatory features", mandatoryFeatures));
			metrics.add(new IntegerMetric("optional features", optionalFeatures));
			metrics.add(new IntegerMetric("dead features", deadFeatures));
			metrics.add(new IntegerMetric("leaves", leaves));
			metrics.add(new IntegerMetric("depth of tree", depthOfTree));
			metrics.add(new IntegerMetric("edges", edges));
			metrics.add(new IntegerMetric("mandatory edges", + mandatoryEdges));
			metrics.add(new IntegerMetric("optional edges", optionalEdges));
			metrics.add(new IntegerMetric("groups", groups));
			metrics.add(new IntegerMetric("mutex-groups", mutexGroups));
			metrics.add(new IntegerMetric("xor-groups", xorGroups));
			metrics.add(new IntegerMetric("or-groups", orGroups));
			metrics.add(new IntegerMetric("constraints", constraints));
			metrics.add(new IntegerMetric("implies", implies));
			metrics.add(new IntegerMetric("bi-implies", biImplies));
			metrics.add(new IntegerMetric("excludes", excludes));
			metrics.add(new IntegerMetric("FM configurations", FMConfigurations));
			metrics.add(new DoubleMetric("cross-tree constraints", crossTreeConstraints));
			//metrics.add(new DoubleMetric("ratio of variability", ratioOfVariability));
			metrics.add(new DoubleMetric("ratio of variability for 1st layer features", ratioOfVariabilityForFirstLayerFeatures));
			metrics.add(new DoubleMetric("ratio of variability for 2nd layer features", ratioOfVariabilityForSecondLayerFeatures));
			metrics.add(new IntegerMetric("children of 3rd layer", childrenThirdLayer));
			metrics.add(new DoubleMetric("flexibility of configuration", flexibilityOfConfiguration));
			metrics.add(new DoubleMetric("variability rate", variabilityRate));
			
		}
			
		_toExcel.writeMetricsStep2(metrics, metricsNumberPerFM);
		if(extended) {
			System.out.println("**************");
			System.out.println("Metrics for step 2 were written to the file " + _toExcel.getFileName() + "_step2"+ "." + _toExcel.getExtensionName());
			System.out.println("**************");
		}
	}
	
	private Integer numberFeaturesStep3(String step2String, String step3String, Set<String> set) throws ErrorInFMLConversion {
		Iterator<String> it = set.iterator();
		String size = "";
		Boolean first = true;
		String name = "";
		String par = "";
		while (it.hasNext()) {
			name = it.next();
			if (first) {
				size = "(size " + name + ".*) ";
				first = false;
			} else {
				par = par + "(";
				size = size + " + size " + name + ".* ) ";
			}
		}
		size = "nbrFeature = " + par + size;
		if (_debug)
			System.out.println("Before parsing");

		_shell.parse(step2String);
		if (_debug)
			System.out.println("Step 2 executed");
		_shell.parse(step3String);
		if (_debug)
			System.out.println("Step 3 executed");
		_shell.parse(size);
		FMLCommandInterpreter _environment = _shell.getCurrentEnv();
		IntegerVariable sizeVar = null;
		try {
			sizeVar = (IntegerVariable) _environment.getVariable("nbrFeature");
		} catch (Exception e) {
			throw new ErrorInFMLConversion(e);
		}

		return new Integer(sizeVar.getV());
	}

	/*
	 * public void baseCSVToDisk(String directory) throws Exception {
	 * if (!_hasConverted)
	 * conversion();
	 * _converter.writeBaseCSVFilestoFolder(directory);
	 * }
	 */
	public void finalCSVToDisk(String directory) throws Exception {
		if (!_hasConverted)
			conversion();
		((WikiMatrixToFMLConverter) _converter).writeFinalCSVFilestoFolder(directory);
	}

	public void fmlScriptToDisk(String path) throws Exception {
		if (!_hasConverted)
			conversion();
		_converter.writeFAMILIARScriptToFile(path);
	}

	public void generateFinalFMToFile(String path) throws Exception {
		if (!_hasConverted)
			conversion();
		_converter.writeFinalFeatureModelToFile(path, FMLConvert.FM_VARIABLE_IDENTIFIER, _shell);
		
		
	}

	public void squeletonToFile(String path, String squeletonFeatureModelName) throws Exception {
		if (!_hasConverted)
			conversion();
		_converter.writeSqueletonToFile(path, squeletonFeatureModelName);
	}
	
	public void showMetricsForFinalFM() throws Exception {
		
		Vector<Metric> metrics = new Vector<Metric>();
		
		String name = "";
		Integer nbFeatures;
		Integer mandatoryFeatures;
		Integer optionalFeatures;
		Integer deadFeatures;
		Integer	leaves;
		Integer depthOfTree;
		Integer edges;
		Integer mandatoryEdges;
		Integer optionalEdges;
		Integer groups;
		Integer mutexGroups;
		Integer xorGroups;
		Integer orGroups;
		Integer constraints;
		Integer implies;
		Integer biImplies;
		Integer excludes;
		Integer FMConfigurations;
		Double crossTreeConstraints;
		//Double ratioOfVariability;
		Double ratioOfVariabilityForFirstLayerFeatures;
		Double ratioOfVariabilityForSecondLayerFeatures;
		Integer childrenThirdLayer;
		Double flexibilityOfConfiguration;
		Double variabilityRate;
		
		
		String strFinalFM = _converter.getFinalFeatureModel() ; 
		
		
		//FeatureModelVariable fm = new FeatureModelVariable("", FMBuilderAnalyzer.getInternalFM(strFinalFM)); 
		String finalFMIdentifier = "finalFM" ; 
		FeatureModelVariable fm = (FeatureModelVariable) _shell.parse("\n" + finalFMIdentifier + " = " + strFinalFM + "\n") ; 
		System.out.println("\n***Metrics for Final FM***\n");
		
		name = fm.getIdentifier();
		nbFeatures = fm.nbFeatures();
		mandatoryFeatures = new FMStatUtility(fm).ManFeaturesNumber();
		optionalFeatures = new FMStatUtility(fm).OptFeaturesNumber();

		leaves = fm.leaves().size();
		depthOfTree = fm.depth();
		edges = (fm.nbFeatures()-1);
		mandatoryEdges = new FMStatUtility(fm).ManFeaturesNumber();
		optionalEdges = new FMStatUtility(fm).OptFeaturesNumber();
		groups = fm.getGroups().size();
		mutexGroups = fm.getMutexGroups().size();
		xorGroups = fm.getXorGroups().size();
		orGroups = fm.getOrGroups().size();
		constraints = fm.getAllConstraints().size();
		implies = fm.getImplicationConstraints().size();
		biImplies = fm.getBiImplicationConstraints().size();
		excludes = fm.getExcludeConstraints().size();

		
		System.out.println("FM name : " + name);
		//System.out.println("FM representation:\n" + fm.toString());
		System.out.println("#features : " + nbFeatures);
		System.out.println("#mandatory features : " + mandatoryFeatures);
		System.out.println("#optional features : " + optionalFeatures);
		System.out.println("#leaves : " + leaves);
		System.out.println("depth of tree : " + depthOfTree);
		System.out.println("#edges : " + edges);			//root feature does not have parent
		System.out.println("#mandatory edges : " + mandatoryEdges);
		System.out.println("#optional edges : " + optionalEdges);
		System.out.println("#groups : " + groups);
		System.out.println("#mutex-groups : " + mutexGroups);
		System.out.println("#xor-groups : " + xorGroups);
		System.out.println("#or-groups : " + orGroups);
		System.out.println("#constraints : " + constraints);
		System.out.println("#implies : " + implies);
		System.out.println("#bi-implies : " + biImplies);
		System.out.println("#excludes : " + excludes);
		
		
		crossTreeConstraints = new FMStatUtility(fm).getCrossTreeConstraints();
		//ratioOfVariability = fm.getRatioOfVariability();
		ratioOfVariabilityForFirstLayerFeatures = new FMStatUtility(fm).getRatioOfVariabilityForFirstLayerFeatures();
		ratioOfVariabilityForSecondLayerFeatures = new FMStatUtility(fm).getRatioOfVariabilityForSecondLayerFeatures();
		childrenThirdLayer = new FMStatUtility(fm).getNbNodesThirdLayer();
		flexibilityOfConfiguration = new FMStatUtility(fm).getFlexibilityOfConfiguration();
		variabilityRate = new FMStatUtility(fm).getVariabilityRateForMergedFM();
		
		System.out.println("cross-tree constraints : " + crossTreeConstraints);
		//System.out.println("ratio of variability : " + ratioOfVariability);
		System.out.println("ratio of variability for 1st layer features : " + ratioOfVariabilityForFirstLayerFeatures);
		System.out.println("ratio of variability for 2nd layer features : " + ratioOfVariabilityForSecondLayerFeatures);
		System.out.println("children of 3rd layer : " + childrenThirdLayer);
		System.out.println("flexibility of configuration : " + flexibilityOfConfiguration);
		System.out.println("variability rate : " + variabilityRate);
		
		
		// AM: not useful (or it is a bug if there is a dead feature)
		//deadFeatures = fm.deads().size();
		//System.out.println("#dead features : " + deadFeatures);	
		
		// costly operations
		//FMConfigurations = (int) fm.counting() ; //configs().size();
		//System.out.println("#FM configurations : " + FMConfigurations);		
		
		System.out.println();

		metrics.add(new TextualMetric("FM name", name));
		metrics.add(new IntegerMetric("features", nbFeatures));
		metrics.add(new IntegerMetric("mandatory features", mandatoryFeatures));
		metrics.add(new IntegerMetric("optional features", optionalFeatures));
		//metrics.add(new IntegerMetric("dead features", deadFeatures));
		metrics.add(new IntegerMetric("leaves", leaves));
		metrics.add(new IntegerMetric("depth of tree", depthOfTree));
		metrics.add(new IntegerMetric("edges", edges));
		metrics.add(new IntegerMetric("mandatory edges", + mandatoryEdges));
		metrics.add(new IntegerMetric("optional edges", optionalEdges));
		metrics.add(new IntegerMetric("groups", groups));
		metrics.add(new IntegerMetric("mutex-groups", mutexGroups));
		metrics.add(new IntegerMetric("xor-groups", xorGroups));
		metrics.add(new IntegerMetric("or-groups", orGroups));
		metrics.add(new IntegerMetric("constraints", constraints));
		metrics.add(new IntegerMetric("implies", implies));
		metrics.add(new IntegerMetric("bi-implies", biImplies));
		metrics.add(new IntegerMetric("excludes", excludes));
		//metrics.add(new IntegerMetric("FM configurations", FMConfigurations));
		metrics.add(new DoubleMetric("cross-tree constraints", crossTreeConstraints));
		//metrics.add(new DoubleMetric("ratio of variability", ratioOfVariability));
		metrics.add(new DoubleMetric("ratio of variability for 1st layer features", ratioOfVariabilityForFirstLayerFeatures));
		metrics.add(new DoubleMetric("ratio of variability for 2nd layer features", ratioOfVariabilityForSecondLayerFeatures));
		metrics.add(new IntegerMetric("children of 3rd layer", childrenThirdLayer));
		metrics.add(new DoubleMetric("flexibility of configuration", flexibilityOfConfiguration));
		metrics.add(new DoubleMetric("variability rate", variabilityRate));
		
		_toExcel.writeMetricsStep3(metrics);
		System.out.println("**************");
		System.out.println("Metrics for step 3 were written to the file " + _toExcel.getFileName() + "_step3"+ "." + _toExcel.getExtensionName());
		System.out.println("**************\n");
	}
	
	public void setExcelPath(String path) {
		_toExcel.setPath(path);
	}
	
	public void generateFinalFFormulaToFile(String path) throws Exception {
		if (!_hasConverted)
			conversion();
		_converter.writeFinalFormulaToFile(path, FMLConvert.FLA_VARIABLE_IDENTIFIER, _shell);
		
	}

}
