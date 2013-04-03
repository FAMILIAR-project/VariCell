package CSVtoFML;

import java.util.Iterator;
import Exceptions.NotValidCSVFileException;

/**
 * Abstract class that factorise all common construction of every CSV related
 * objects (CSVParser, CSVWriter,... ?).
 * 
 * @author Charles Vanbeneden
 * 
 */
public abstract class CSVAbstract extends ConversionModelArray {

	/**
	 * _identifior correspond to a special value of the head of the CSV input.
	 * This identifior indicates the column that contains every identifiers of
	 * the data's lines.
	 */
	protected String _identifior;
	/**
	 * _separator consists of the textual separator between values in the CSV
	 * format.
	 */
	protected String _separator;

	/**
	 * @param identifior
	 *            Column name that identifies the identifiers / entities.
	 * @param separator
	 *            Textual separator between values.
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
	public CSVAbstract(String identifior, String separator, String defaultCharacter, String viewName) throws NotValidCSVFileException {
		// constructor of ConversionModelArray
		super(viewName, defaultCharacter);
		init(identifior, separator, viewName);
	}

	/**
	 * This function makes just somes checks and initialise the given
	 * parameters.
	 * 
	 * @param identifior
	 *            Column name that identifies the identifiers / entities.
	 * @param separator
	 *            Textual separator between values.
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
	private void init(String identifior, String separator, String viewName) throws NotValidCSVFileException {
		separator = separator.replace(" ", "");
		if (separator == null || separator.compareTo("") == 0)
			throw new NotValidCSVFileException("The given spaceCharacter isn't valid.");
		_separator = separator.replace(" ", "");
		if (identifior == null || identifior.compareTo("") == 0)
			throw new NotValidCSVFileException("The given defaultCharacter isn't valid.");
		_identifior = identifior.replace(" ", "");
		// Some small checks before launching the parsing.
		if (viewName == null || viewName.compareTo("") == 0)
			throw new NotValidCSVFileException("The given metaName isn't valid.");
		_viewName = viewName.replace(" ", "");
	}

	/**
	 * @return Textual separator between values.
	 */
	public String getSeparator() {
		return this._separator;
	}

	/**
	 * @return Column name that identifies the identifiers / entities.
	 */
	public String getIdentifior() {
		return this._identifior;
	}

}
