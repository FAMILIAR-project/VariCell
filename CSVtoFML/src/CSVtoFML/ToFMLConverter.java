package CSVtoFML;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 * @author Charles Vanbeneden
 * edited by Oleksandr Taran
 * 
 */
public abstract class ToFMLConverter {

	protected Boolean _verbose;
	protected String _defaultCharacter;
	protected String _separator;
	protected String _rootFeatureName;
	protected FMLConvert _converter;
	protected Boolean _showID;
	protected ConversionModel _conversionModel;
	protected Boolean _generationFML;
	protected Boolean _general;			//added by Taran

	/*
	 * edited by Oleksandr Taran
	 */
	public ToFMLConverter(String defaultCharacter, String separator, String rootFeatureName, Boolean showID) throws Exception {
		_showID = showID;
		_verbose = false;
		_defaultCharacter = defaultCharacter;
		_separator = separator;
		_rootFeatureName = rootFeatureName;
		String[] compIDarr = {};
		_conversionModel = new ConversionModel(rootFeatureName, compIDarr);
		_converter = null;
		_generationFML = false;
		_general = false;			//added by Taran
	}

	/*
	 * added by Taran
	 * constructor for general case
	 */
	public ToFMLConverter(Boolean showID) throws Exception {
		_showID = showID;
		_verbose = false;
		_converter = null;
		_generationFML = false;
		_general = true;
	}	

	public void setVerbose(Boolean verbose) {
		_verbose = verbose;
	}

	protected void generateConversionModel() throws Exception {

	}

	/*
	 * edited by Taran
	 */
	public void generateFMLFromConversionModel() throws Exception {
		if(_general) generateFMLFromConversionModelWithoutFMLConverterConstruction();
		else {
			if (_verbose) {
				System.out.println("**************");
				System.out.println("FML Generation");
				System.out.println("**************");
			}
			if (_verbose)
				System.out.println("OK, " + _conversionModel.getTotalView() + " ConversionModelArray found !");
			_converter = new FMLConvert(_conversionModel, _showID, true);
			_converter.convert();
			System.out.println(_converter.getFinalFAMILIARScriptOrdered(true));
			_generationFML = true;
		}
	}	

	/*
	 * added by Taran
	 */
	public void generateFMLFromConversionModelWithoutFMLConverterConstruction() throws Exception {
		if (_verbose) {
			System.out.println("**************");
			System.out.println("FML Generation");
			System.out.println("**************");
		}
		if (_verbose)
			System.out.println("OK, " + _conversionModel.getTotalView() + " ConversionModelArray found !");
		_converter.convert();
		System.out.println(_converter.getFinalFAMILIARScriptOrdered(true));
		_generationFML = true;
	}

	public ConversionModel getConversionModel() throws Exception {
		return _conversionModel;
	}

	public String getFinalFAMILIARScript() throws Exception {
		if (!_generationFML)
			generateFMLFromConversionModel();
		if (_verbose) {
			System.out.println("**************");
			System.out.println("FAMILIAR SCRIPT");
			System.out.println("**************");
			System.out.println(_converter.getFinalFAMILIARScript());
		}
		return _converter.getFinalFAMILIARScript();
	}

	public String getFinalFeatureModel() throws Exception {
		if (!_generationFML)
			generateFMLFromConversionModel();
		if (_verbose) {
			System.out.println("**************");
			System.out.println("FINAL FM");
			System.out.println("**************");
			System.out.println(_converter.getFinalFeatureModel(_verbose));
		}
		return _converter.getFinalFeatureModel(_verbose);
	}

	public Boolean writeSqueletonToFile(String path, String squeletonFeatureModelName) throws Exception {
		if (!_generationFML) 
			generateFMLFromConversionModel();
		boolean out = _converter.writerSkeletonToFile(path, squeletonFeatureModelName);
		if (_verbose) {
			System.out.println("****************************");
			System.out.println("WRITING SQUELETON TO FML FILE");
			System.out.println("****************************");
			if (out)
				System.out.println("Writed to " + path);
			else
				System.out.println("Problem writing to " + path);
		}
		return out;
	}

	public Boolean writeFAMILIARScriptToFile(String path) throws Exception {
		if (!_generationFML) 
			generateFMLFromConversionModel();
		boolean out = _converter.writeFinalFAMILIARScriptToFile(path);
		if (_verbose) {
			System.out.println("****************************");
			System.out.println("WRITING SCRIPT TO FML FILE");
			System.out.println("****************************");
			if (out)
				System.out.println("Writed to " + path);
			else
				System.out.println("Problem writing to " + path);
		}
		return out;
	}

	public Boolean writeFinalFeatureModelToFile(String path, String variableName) throws Exception {
		if (!_generationFML)
			generateFMLFromConversionModel();
		boolean out = _converter.writeFinalFeatureModelToFile(path, variableName, _verbose);
		if (_verbose) {
			System.out.println("****************************");
			System.out.println("WRITING FINAL FM TO FILE");
			System.out.println("****************************");
			if (out)
				System.out.println("Writed to " + path);
			else
				System.out.println("Problem writing to " + path);
		}
		return out;
	}

	public FMLConvert getFMLConverter() throws Exception {
		if (!_generationFML)
			generateFMLFromConversionModel();
		return _converter;
	}

	/*
	 * public Boolean writeBaseCSVFilestoFolder(String path) throws Exception {
	 * if (!_hasGeneratedCSV)
	 * this.convertCSV();
	 * if (_verbose) {
	 * System.out.println("**************");
	 * System.out.println("WRITING TO FILES");
	 * System.out.println("**************");
	 * }
	 * CSVWriter csv;
	 * Set<String> csvFileNames = _csvFiles.keySet();
	 * Iterator<String> csvFileNameIterator = csvFileNames.iterator();
	 * String csvFileName;
	 * Boolean out = true;
	 * Integer i = 0;
	 * while (csvFileNameIterator.hasNext()) {
	 * csvFileName = csvFileNameIterator.next();
	 * csv = _csvFiles.get(csvFileName);
	 * out = out && csv.writeCSVToFile(path +
	 * FMLConvert.makeNameValid(csvFileName) + ".csv");
	 * if (_verbose)
	 * System.out.println(path);
	 * i++;
	 * }
	 * if (i == 0)
	 * return false;
	 * return out;
	 * }
	 */
	/*
	 * public Boolean writeFinalCSVFilestoFolder(String path) throws Exception {
	 * if (!_generationFML)
	 * generateFMLFromConversionModel();
	 * if (_verbose) {
	 * System.out.println("**************");
	 * System.out.println("WRITING TO FILES");
	 * System.out.println("**************");
	 * }
	 * Boolean out = true;
	 * Iterator<CSVParser> it = _csvParsers.iterator();
	 * CSVParser csv;
	 * CSVWriter csvW;
	 * Boolean hasWritten = false;
	 * while (it.hasNext()) {
	 * csv = it.next();
	 * csvW = csv.toCSVWriterDeepCopy();
	 * out = out && csvW.writeCSVToFile(path +
	 * FMLConvert.makeNameValid(csv.getViewName()) + ".csv");
	 * if (_verbose)
	 * System.out.println(path);
	 * hasWritten = true;
	 * }
	 * if (hasWritten)
	 * return out;
	 * return false;
	 * }
	 */

	public ArrayList<String> getFilesNameFromDirectory(String path, String expression) {
		ArrayList<String> fileNames = new ArrayList<String>();
		File dir = new File(path);
		String[] children = dir.list();
		if (children == null) {
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				if (filename.contains(expression))
					fileNames.add(filename);
			}
		}
		return fileNames;
	}

}
