package useCases.wikipediaComparedSoftware;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import CSVtoFML.CSVParser;
import CSVtoFML.CSVWriter;
import CSVtoFML.ToFMLConverter;

/**
 * 
 * @author Charles Vanbeneden
 * 
 */
public class WikipediaComparedSoftwareToFMLConverter extends ToFMLConverter {

	protected Map<String, CSVWriter> _csvFiles;
	String _directoryContainingCSV;

	public WikipediaComparedSoftwareToFMLConverter(String directoryCSV, String defaultCharacter, String separator, String rootFeatureName,
			Boolean showID) throws Exception {
		super(defaultCharacter, separator, rootFeatureName, showID);
		_directoryContainingCSV = directoryCSV;
		_csvFiles = new HashMap<String, CSVWriter>();
		generateCSV();
	}

	protected void generateCSV() throws Exception {
		ArrayList<String> list = getFilesNameFromDirectory(_directoryContainingCSV, ".csv");
		Iterator<String> iterator = list.iterator();
		String fileName;

		while (iterator.hasNext()) {
			fileName = iterator.next();
			CSVParser csvP = new CSVParser(new FileReader(_directoryContainingCSV + fileName), _separator, fileName, _defaultCharacter,
					"Software");
			_csvFiles.put(fileName, csvP.toCSVWriterDeepCopy());
		}
		convertCSVWritersToConversionModel();
	}

	private void convertCSVWritersToConversionModel() throws Exception {
		Set<String> viewNames = _csvFiles.keySet();
		for (String viewName : viewNames) {
			_conversionModel.addView(_csvFiles.get(viewName).toCSVParserDeepCopy());
		}
	}
}
