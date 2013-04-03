package CSVtoFML;

import java.util.Iterator;
import java.util.List;
import Exceptions.NotValidCSVFileException;

/**
 * Class super type is ConversionModelArray > CSVAbstract. This class gives
 * facilities to create a ConversionModelArray programmatically with CSV format
 * in mind. You add rows, columns, values etc, to create a useful
 * representation. You can also "backup" your creation into a on disk CSV file.
 * 
 * @author Charles Vanbeneden
 * 
 */
public class CSVWriter extends CSVAbstract {

	/**
	 * @param identifior
	 *            Column name that identifies the identifiers / entities.
	 * @param separator
	 *            Textual separator between values
	 * @param defaultCharacter
	 *            String to place to the ConversionModelArray when there is no
	 *            value for a cell in the input CSV file.
	 * @param viewName
	 *            CSV related view name. Indeed, because of it's 2 dimension, a
	 *            CSV file represent an unique view.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was something wrong during the parsing. Use
	 *             e.getMessage() for more information.
	 */
	public CSVWriter(String identifior, String separator, String defaultCharacter, String viewName) throws NotValidCSVFileException {
		super(identifior, separator, defaultCharacter, viewName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.ConversionModelArray#addLabel(java.lang.String)
	 */
	public Boolean addLabel(String labelName) {
		return super.addLabel(labelName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.ConversionModelArray#addRow(java.lang.String)
	 */
	public Boolean addRow(String identifier) {
		return super.addRow(identifier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.ConversionModelArray#addValueToRowLabel(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public Boolean addValueToRowLabel(String rowIdentifier, String label, String value) {
		return super.addValueToRowLabel(rowIdentifier, label, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.ConversionModelArray#addValueToRow(java.lang.String,
	 * java.lang.String)
	 */
	public Boolean addValueToRow(String identifier, String value) {
		return super.addValueToRow(identifier, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.ConversionModelArray#addValuesToRow(java.lang.String,
	 * java.util.List)
	 */
	public Boolean addValuesToRow(String identifier, List<String> values) {
		return super.addValuesToRow(identifier, values);
	}

	/**
	 * @return A CSV formatted String containing this object current CSV
	 *         representation.
	 */
	public String getCSVString() {
		String csvOut = _identifior;
		Iterator<String> iterator = getHeadLabelsIterator();
		String tmp;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			csvOut = csvOut + _separator + tmp;
		}
		csvOut = csvOut + System.getProperty("line.separator");
		Iterator<String> iterator2;
		iterator = getRowIdentifierIterator();
		String tmp2;
		Boolean haswritedLine = false;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			iterator2 = getRowValuesIterator(tmp);
			csvOut = csvOut + tmp;
			while (iterator2.hasNext()) {
				tmp2 = iterator2.next();
				if (tmp2 != null) {
					csvOut = csvOut + _separator + tmp2;
					haswritedLine = true;
				}
			}
			if (haswritedLine)
				csvOut = csvOut + System.getProperty("line.separator");
			haswritedLine = false;
		}
		return csvOut;
	}

	/**
	 * @return A CSVParser object corresponding to the deep copy of this object.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was a problem creating the CSVParser object.
	 *             Use e.getMessage() for more information.
	 */
	public CSVParser toCSVParserDeepCopy() throws NotValidCSVFileException {
		return new CSVParser(this.getCSVString(), _separator, _viewName, _defaultCharacter, _identifior);
	}

	/**
	 * @param path
	 *            Path to the file that will contain the CSV content
	 *            corresponding to the internal representation of this object.
	 * @return True if the operation was a success. False otherwise.
	 */
	public Boolean writeCSVToFile(String path) {
		return writeToFile(path, getCSVString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.CSVAbstract#aggregateWith(CSVtoFML.CSVAbstract)
	 */
	public Boolean aggregateWith(CSVAbstract other) {
		return super.aggregateWith(other);
	}
}
