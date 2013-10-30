package CSVtoFML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import Exceptions.NotValidCSVFileException;

/**
 * Class super type is ConversionModelArray > CSVAbstract. This class gives
 * facilities to parse an input CSV file or String. It parse the input and
 * structure it to the concepts of ConversionModelArray.
 * 
 * @author Charles Vanbeneden
 */
public class CSVParser extends CSVAbstract {

	public static final String DEFAULT_EMPTY_VALUE = "N_A";

	public static final String DEFAULT_SEPARATOR = ",";
		
	private Integer _identifiorID;
	private Set<String> _identifiers;

	/**
	 * @param fileReader
	 *            File object of the CSV input file.
	 * @param separator
	 *            Textual separator between values.
	 * @param viewName
	 *            CSV related view name. Indeed, because of it's 2 dimension, a
	 *            CSV file represent an unique view.
	 * @param defaultCharacter
	 *            String to place to the ConversionModelArray when there is no
	 *            value for a cell in the input CSV file.
	 * @param identifior
	 *            Column name that identifies the identifiers / entities.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was something wrong during the parsing. Use
	 *             e.getMessage() for more information.
	 */
	public CSVParser(FileReader fileReader, String separator, String viewName, String defaultCharacter, String identifior)
			throws NotValidCSVFileException {
		// CSVAbstract constructor. This class factorise some CSV concepts.
		super(identifior, separator, defaultCharacter, viewName);
		// Some small checks before launching the parsing.
		if (fileReader == null)
			throw new NotValidCSVFileException("The given fileReader isn't valid!");
		init();
		String input = "";
		String tmp;
		// transform the file into a String containing all the CSV data.
		try {
			BufferedReader br = new BufferedReader(fileReader);
			tmp = br.readLine();
			while (tmp != null) {
				input = input + tmp + System.getProperty("line.separator");
				tmp = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			throw new NotValidCSVFileException(e);
		}
		// parse the CSV string
		parse(input);
	}

	/**
	 * @param input
	 *            CSV formatted string. The lines must be separated by
	 *            System.getProperty("line.separator");.
	 * @param separator
	 *            Textual separator between values
	 * @param viewName
	 *            CSV related view name. Indeed, because of it's 2 dimension, a
	 *            CSV file represent an unique view.
	 * @param defaultCharacter
	 *            String to place to the ConversionModelArray when there is no
	 *            value for a cell in the input CSV file.
	 * @param identifior
	 *            Column name that identifies the identifiers / entities.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was something wrong during the parsing. Use
	 *             e.getMessage() for more information.
	 */
	public CSVParser(String input, String separator, String viewName, String defaultCharacter, String identifior)
			throws NotValidCSVFileException {
		// CSVAbstract constructor. This class factorise some CSV concepts.
		super(identifior, separator, defaultCharacter, viewName);
		// Some small checks before launching the parsing.
		init();
		parse(input);
	}

	/**
	 * Initialise just some things...<br />
	 * Side-effects : <br />
	 * _identifier is initialised.<br />
	 * _identifiorID is fixed at -1.
	 */
	private void init() {
		_identifiers = new HashSet<String>();
		_identifiorID = -1;
	}

	/**
	 * Used to initialise the parser. This function split the input string by
	 * line separator of different systems.
	 * 
	 * @param input
	 *            CSV formatted input string.
	 * @return An ArrayList containing every separated lines of the input.
	 * @throws NotValidCSVFileException
	 *             Thrown if the input string was empty or if there were no
	 *             lines in the input.
	 */
	private ArrayList<String> initParser(String input) throws NotValidCSVFileException {
		ArrayList<String> lines = null;
		if (input.compareTo("") == 0)
			throw new NotValidCSVFileException("Empty input!");

		// windows separator
		if (input.contains("\n\r")) {
			lines = new ArrayList<String>(Arrays.asList(input.split("\n\r")));
			// linux separator
		} else if (input.contains("\n")) {
			lines = new ArrayList<String>(Arrays.asList(input.split("\n")));
		} else {
			throw new NotValidCSVFileException("No lines in the file. Use \n\r for windows or \n for unix-like OS.");
		}
		return lines;
	}

	/**
	 * Function that parse the header line.<br />
	 * Side-effect : _head is filled with the different labels contained in the
	 * input line.
	 * 
	 * @param line
	 *            Header CSV formatted line.
	 * @throws NotValidCSVFileException
	 *             Throw if the string is empty or contain just 1 value.
	 */
	private void headerParsing(String line) throws NotValidCSVFileException {
		// split the line to have the cells
		String[] splitted = line.split(_separator);
		if (splitted.length < 1)
			throw new NotValidCSVFileException("The heading is too short!");
		stringArrayHeaderToList(splitted);
		if (getNbActualColumns() <= 0)
			throw new NotValidCSVFileException("Dimension <= 0 : No data in the CSV input ! ");
	}

	/**
	 * Function that parse a data line. <br />
	 * Side-effect : _data is filled with one entity corresponding to one entry
	 * defined by the input line.
	 * 
	 * @param line
	 *            One of the data CSV formatted lines.
	 * @throws NotValidCSVFileException
	 *             Thrown if the line doesn't have the right dimension size or
	 *             if there are 2 identifiers with the same name.
	 */
	private void dataParsing(String line) throws NotValidCSVFileException {
		String identifier = stringArrayToArrayList(line.split(_separator));
		int rowSize = getRowSize(identifier);
		if (rowSize != getNbActualColumns())
			throw new NotValidCSVFileException("The line doesn't have the dimension size! " + rowSize + " - " + getNbActualColumns());
		if (!_identifiers.add(identifier))
			throw new NotValidCSVFileException("There is 2 entry with the same identifier! " + identifier);
	}

	/**
	 * Function that take a CSV formatted string and parse it to the internal
	 * representation of ConversionModelArray (a View).
	 * 
	 * @param input
	 *            CSV formatted string.
	 * @throws NotValidCSVFileException
	 *             Throw if there was a problem parsing the input string.
	 */
	protected void parse(String input) throws NotValidCSVFileException {
		ArrayList<String> lines = initParser(input);
		// Declarations
		String line = null;
		Boolean headingEncountered = false;
		Iterator<String> it = lines.iterator();
		// for each line
		while (it.hasNext()) {
			line = it.next();
			// delete all space in the line
			line.replace(" ", "");
			if (line.compareTo("") != 0) {
				// first line, heading line
				if (!headingEncountered) {
					headerParsing(line);
					headingEncountered = true;
				} else
					dataParsing(line);
			}
		}
		if (getNbActualRows() == 0)
			if (line == null)
				// no heading
				throw new NotValidCSVFileException("Nothing in the file");
			else
				// if there was no entry, it wasn't necessary to parse it!
				throw new NotValidCSVFileException("The CSV input doesn't contain any data! 0 entry!");
	}

	/**
	 * Function that parse the head line. It makes checks and add the labels to
	 * _head (side-effect). This function also detemine the _identifiorID
	 * (side-effect) corresponding to the column id of the identifiers in the
	 * CSV file.
	 * 
	 * @param input
	 *            String array containing each values of the head. These values
	 *            are named labels.
	 * @throws NotValidCSVFileException
	 *             Thrown if there are 2 label with the same name or if there
	 *             was no label corresponding to the _identifior.
	 */
	private void stringArrayHeaderToList(String[] input) throws NotValidCSVFileException {
		int i = 0;
		while (i < input.length) {
			input[i] = input[i].replace(" ", ""); // input[i] = input[i].trim() ; 
			if (input[i].compareTo(_identifior) == 0)
				_identifiorID = i;
			else {
				// the name isn't unique
				if (isLabel(input[i]))
					throw new NotValidCSVFileException("The caracteristic name " + input[i] + " already exists!");
				else if (input[i].compareTo("") != 0)
					addLabel(input[i]);
			}
			i++;
		}
		// the identifier wasn't found.
		if (_identifiorID == -1)
			throw new NotValidCSVFileException("The specified identifier doesn't exist." + input[0]);
	}

	/**
	 * 
	 * Function that parse one of the data line. It makes checks and add the
	 * different value to _data (side-effect) with the corresponding identifier
	 * name. If there is an empty value in the input array, it's replaced with
	 * _defaultCharacter. The new _data entry has the same dimension than the
	 * head.
	 * 
	 * @param input
	 *            String array containing each values of one data line.
	 * @return The identifier.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was no identifier on the given input or if
	 *             there are 2 identifier with the same name.
	 */
	private String stringArrayToArrayList(String[] input) throws NotValidCSVFileException {
		int i = 0;
		String identifier = "";
		if (input.length > _identifiorID)
			identifier = input[_identifiorID].trim() ; // input[_identifiorID].replace(" ", "");
		else
			throw new NotValidCSVFileException("No identifier on this line.");
		if (!addRow(identifier.trim()))
			throw new NotValidCSVFileException("You are trying to add 2 rows with the same identifier : " + identifier);
		while (i < getNbActualColumns() + 1) {
			if (i != _identifiorID)
				/*
				 * if the input array is smaler than the dimension or if the
				 * input
				 * contains no valuefgf
				 */
				if (i >= input.length || input[i] == null || input[i].replace(" ", "").compareTo("") == 0)
					addValueToRow(identifier, _defaultCharacter);
				else {
					addValueToRow(identifier, input[i].trim()) ; //input[i].replace(" ", ""));
				}
			i++;
		}
		return identifier;
	}

	/**
	 * Useful to translate this object into a CSVWriter object. The CSVWriter
	 * object gives facilities to manipulate programmatically a java CSV
	 * representation.
	 * 
	 * @return A CSVWriter object corresponding to a deep copy of this object.
	 * @throws NotValidCSVFileException
	 *             Thrown if there was a problem creating the CSVWriter object.
	 *             Use e.getMessage() for more information.
	 */
	public CSVWriter toCSVWriterDeepCopy() throws NotValidCSVFileException {
		CSVWriter writer = new CSVWriter(_identifior, _separator, _defaultCharacter, _viewName);

		Iterator<String> labelIT = getHeadLabelsIterator();
		String tmp;
		while (labelIT.hasNext()) {
			tmp = labelIT.next();
			writer.addLabel(tmp);
		}

		Iterator<String> identifierIT = getRowIdentifierIterator();
		Iterator<String> valuesIT;
		String tmp2;
		while (identifierIT.hasNext()) {
			tmp = identifierIT.next();
			valuesIT = getRowValuesIterator(tmp);
			writer.addRow(tmp);
			while (valuesIT.hasNext()) {
				tmp2 = valuesIT.next();
				writer.addValueToRow(tmp, tmp2);
			}
		}
		return writer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CSVtoFML.CSVAbstract#aggregateWith(CSVtoFML.CSVAbstract)
	 */
	public Boolean aggregateWith(CSVAbstract other) {
		Boolean out = super.aggregateWith(other);
		if (out) {
			increaseNbFilteredColumn(other.getNbFilteredColumns());
			increaseNbFilteredRows(other.getNbFilteredRows());
			increaseNbFilteredValue(other.getNbFilteredValues());
			increaseReplacedValues(other.getNbReplacedValues());
		}
		return out;
	}

}
