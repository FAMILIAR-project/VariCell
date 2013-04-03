package CSVtoFML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class represents a View of the final Feature model. It can be
 * represented as an 2 dimensional array. The first line is the head. The rest
 * of the lines compose the data. Each line of the data is identified by an
 * identifier (Map<String, List<String>> _data => Map<identifier, List<Values>).
 * This view can contain subviews and characteristics. One characteristic is
 * named by one label. The association of each of these characteristics and with
 * each of the entities are values. <br />
 * <br />
 * Supports : <br />
 * - Composed ids<br />
 * - Subviews<br />
 * - Yes, No, Partial, N/A and textual values <br/>
 * - Multivalued values<br />
 * - Metrics : filtered values, filtered columns, rows,...<br />
 * 
 * @author Charles Vanbeneden
 * 
 */
public abstract class ConversionModelArray {

	// For the definition of these attributes, see the definition of the class.
	private Integer _totalFilteredValue;
	private Integer _totalFilteredColumns;
	private Integer _totalFilteredRows;
	private Integer _totalReplacedValues;
	/**
	 * _defaultCharacter is the String that replace empty values in the CSV
	 * input.
	 */
	protected String _defaultCharacter;
	protected String _multiValuedSeparator;
	/**
	 * Name of the view -- provided by the user.
	 */
	protected String _viewName;
	private List<String> _head;
	/**
	 * identifier => data values
	 */
	private Map<String, List<String>> _data;
	/**
	 * Container of the subviews.
	 */
	private Set<ConversionModelArray> _subviews;

	/**
	 * For a label (and TODO an entity), specify the interpretation in terms of
	 * variability e.g., if I have Linux;Windows;MacOS does it mean I can have
	 * both of them at the same time? or only one at a time? or zero? or....? <br />
	 * Should be populated by the user.<br />
	 * Map<Label, MultiValuedMode> <br />
	 * MultiValuedMode -> OR, XOR, Optional, Mandatory.
	 */
	private Map<String, MultiValuedMode> _multiValuedModForLabel;

	/**
	 * The multi-value default separator.
	 */
	private static final String DEFAULT_MULTIVALUE_SEPARATOR = ",";

	/**
	 * Constructor. Initialize some attributes.
	 * 
	 * @param viewName
	 *            View name associated to this ConversionModelArray.
	 */
	public ConversionModelArray(String viewName, String defaultCharacter) {
		_viewName = viewName;
		_defaultCharacter = defaultCharacter.replace(" ", "");
		init();
	}

	/**
	 * Just initialize some attributes.
	 */
	private void init() {
		_totalFilteredValue = 0;
		_totalFilteredColumns = 0;
		_totalFilteredRows = 0;
		_totalReplacedValues = 0;
		_multiValuedSeparator = DEFAULT_MULTIVALUE_SEPARATOR;
		_head = new ArrayList<String>();
		_data = new HashMap<String, List<String>>();
		_subviews = new HashSet<ConversionModelArray>();
		_multiValuedModForLabel = new HashMap<String, MultiValuedMode>();
	}

	/**
	 * Default mode is XOR...
	 * 
	 * @param labelName
	 *            Corresponding label / characteristic name.
	 * @param mode
	 *            Mode to apply to the multivalued values associated to the
	 *            given label.
	 * @return True if the mode was successfully associated to the given label.
	 *         False otherwise.
	 */
	public Boolean setMultiValuedSpecialModeForLabel(String labelName, MultiValuedMode mode) {
		if (isLabel(labelName)) {
			_multiValuedModForLabel.put(labelName, mode);
			return true;
		}
		return false;
	}

	/**
	 * Get the multivalued mode for the given labelName. If the mode wasn't
	 * defined, XOR is returned as default mode.
	 * 
	 * @param labelName
	 *            Corresponding labelName.
	 * @return The mode to use for multivalued values for the given labelName.
	 */
	public MultiValuedMode getMultivaluedModeForLabel(String labelName) {
		if (!isLabel(labelName))
			return null;
		MultiValuedMode mode = _multiValuedModForLabel.get(labelName);
		if (mode == null) // default mode
			return MultiValuedMode.XOR;
		return mode;
	}

	/**
	 * If different than default = ";"
	 * 
	 * @param multiValuedSeparator
	 *            Multivalued separator.
	 */
	public void setMultiValuedSeparator(String multiValuedSeparator) {
		_multiValuedSeparator = multiValuedSeparator;
	}

	/**
	 * @return The multivalued separator.
	 */
	public String getMultiValuedSeparator() {
		return _multiValuedSeparator;
	}

	/**
	 * @param subview
	 *            ConversionModelArray to put under this like a subview.
	 * @return True if the given subview was successfully added (doesn't already
	 *         exists as subview). False otherwise.
	 */
	public Boolean addSubView(ConversionModelArray subview) {
		return _subviews.add(subview);
	}

	/**
	 * @return The number of sub level views.
	 */
	public Integer getNbSubViews() {
		return _subviews.size();
	}

	/**
	 * @return An iterator of the subviews.
	 */
	public Iterator<ConversionModelArray> getSubViewsIterator() {
		return _subviews.iterator();
	}

	/**
	 * Remove a subview by it's viewName.
	 * 
	 * @param viewName
	 *            ViewName of the view you want to remove from the subview list.
	 * @return True if the given viewName was successfully removed from the
	 *         subviews of this object.
	 */
	public Boolean removeSubView(String viewName) {
		Iterator<ConversionModelArray> convIT = _subviews.iterator();
		ConversionModelArray conv;
		while (convIT.hasNext()) {
			conv = convIT.next();
			if (conv.getViewName().compareTo(viewName) == 0)
				return _subviews.remove(conv);
		}
		return false;
	}

	/**
	 * @return True if this ConversionModelArray is valid. This means that the
	 *         dimension of each rows == dimension of the head. So, the
	 *         ConversionModelArray was successfully constructed.
	 */
	public Boolean isValid() {
		Iterator<String> rowIDIT = getRowIdentifierIterator();
		String rowID;
		while (rowIDIT.hasNext()) {
			rowID = rowIDIT.next();
			if (getRowSize(rowID) != getNbActualColumns())
				return false;
		}
		return true;
	}

	/**
	 * Get the labelName at the index position.
	 * 
	 * @param index
	 *            Index of the labelName you want to get.
	 * @return The label name at the given index position.
	 */
	public String getLabel(Integer index) {
		return _head.get(index);
	}

	/**
	 * @param index
	 *            Index of the label you want to rename.
	 * @param newName
	 *            The new name of the label.
	 * @return True in case of success of this operation. False otherwise.
	 */
	public Boolean renameLabel(Integer index, String newName) {
		if (index > getNbActualColumns() || index < 0 || _head.contains(newName))
			return false;
		String oldName = _head.set(index, newName);
		if (_multiValuedModForLabel.containsKey(oldName)) {
			MultiValuedMode mode = _multiValuedModForLabel.get(oldName);
			_multiValuedModForLabel.remove(oldName);
			_multiValuedModForLabel.put(newName, mode);
		}
		return true;
	}

	/**
	 * @param oldName
	 *            Name of the current label you want to rename.
	 * @param newName
	 *            New name of the specified oldName label.
	 * @return True in case of success of the rename. False otherwise.
	 */
	public Boolean renameLabel(String oldName, String newName) {
		int index = getLabelID(oldName);
		if (index == -1)
			return false;
		return renameLabel(index, newName);
	}

	/**
	 * @param labels
	 *            List of label names.
	 * @return True if each of these labelNames are contained in _head. False
	 *         otherwise.
	 */
	public Boolean isLabel(List<String> labels) {
		Boolean out = true;
		Iterator<String> labelsIT = labels.iterator();
		String label;
		while (labelsIT.hasNext()) {
			label = labelsIT.next();
			out = out && _head.contains(label);
		}
		return out;
	}

	/**
	 * Add at the end of the _head (side-effect) array the given labelName.
	 * 
	 * @param labelName
	 *            Label name to add to the _head.
	 * @return True if the labelName was successfully added to _head. False
	 *         otherwise.
	 */
	public Boolean addLabel(String labelName) {
		if (_head.contains(labelName))
			return false;
		Boolean out = _head.add(labelName);
		return out;
	}

	/**
	 * @param label
	 *            Label name you want to test.
	 * @return True if the given label exists in _head.
	 */
	public Boolean isLabel(String label) {
		return _head.contains(label);
	}

	/**
	 * @param identifier
	 *            Identifier name you want to test.
	 * @return True if the identifier correspond to an existent entity.
	 */
	public Boolean isIdentifier(String identifier) {
		return _data.keySet().contains(identifier);
	}

	/**
	 * @param labelName
	 *            Label name to remove from _head (side-effect).
	 * @return True if the operation was a success. False otherwise.
	 */
	protected Boolean removeLabel(String labelName) {
		if (!_head.contains(labelName))
			return false;
		return _head.remove(labelName);
	}

	/**
	 * @param rowIdentifier
	 *            Identifier of the row to remove.
	 * @return True if the identifier exists and that the row was correctly
	 *         removed from _data (side-effect). False otherwise.
	 */
	protected Boolean removeRow(String rowIdentifier) {
		if (!_data.containsKey(rowIdentifier))
			return false;
		_data.remove(rowIdentifier);
		return true;
	}

	/**
	 * @return An iterator of the different labels.
	 */
	public Iterator<String> getHeadLabelsIterator() {
		return _head.iterator();
	}

	/**
	 * @return An iterator of the different identifiers.
	 */
	public Iterator<String> getRowIdentifierIterator() {
		return _data.keySet().iterator();
	}

	/**
	 * @param label
	 *            Given label name.
	 * @return -1 if the given label name doesn't exists. The label id in _head
	 *         otherwise.
	 */
	public Integer getLabelID(String label) {
		return _head.indexOf(label);
	}

	/**
	 * 
	 * @param rowIdentifier
	 *            Given identifier.
	 * @param ID
	 *            Label id
	 * @return The value corresponding to the given identifier and label ID.
	 */
	public String getRowValueID(String rowIdentifier, Integer ID) {
		List<String> values = _data.get(rowIdentifier);
		if (values == null)
			return "";
		return values.get(ID);
	}

	/**
	 * @param rowIdentifier
	 *            Given identifier.
	 * @return An iterator of each values of the given identifier.
	 */
	public Iterator<String> getRowValuesIterator(String rowIdentifier) {
		List<String> values = _data.get(rowIdentifier);
		if (values == null)
			return null;
		return values.iterator();
	}

	/**
	 * 
	 * @param identifier
	 *            Given identifier.
	 * @return The number of values of the identifier's row.
	 */
	public Integer getRowSize(String identifier) {
		List<String> row = _data.get(identifier);
		if (row == null)
			return -1;
		return row.size();
	}

	/**
	 * Add to the data an identifier with an empty array of values. In other
	 * words, initialize a row for the given identifier.
	 * 
	 * @param identifier
	 *            Concerned identifier.
	 * @return True if the row was correctly initialized. False otherwise (if
	 *         already contain the given identifier).
	 */
	protected Boolean addRow(String identifier) {
		if (_data.containsKey(identifier))
			return false;
		ArrayList<String> array = new ArrayList<String>();
		array.ensureCapacity(getNbActualColumns());
		_data.put(identifier, array);
		return true;
	}

	/**
	 * @param identifier
	 *            Concerned identifier.
	 * @param value
	 *            Value to append to the identifier's set.
	 * @return True in case of success. False otherwise.
	 */
	protected Boolean addValueToRow(String identifier, String value) {
		if (!_data.containsKey(identifier))
			return false;
		if (_data.get(identifier).size() > this.getNbActualColumns())
			return false;
		return _data.get(identifier).add(value);
	}

	/**
	 * @param identifier
	 *            Concerned identifier.
	 * @param values
	 *            List of values to append to the identifier'srow.
	 * @return True in case of success. False otherwise.
	 */
	protected Boolean addValuesToRow(String identifier, List<String> values) {
		Iterator<String> valuesIT = values.iterator();
		String value;
		Boolean out = true;
		while (valuesIT.hasNext()) {
			value = valuesIT.next();
			out = out && addValueToRow(identifier, value);
		}
		return out;
	}

	/**
	 * 
	 * @param rowIdentifier
	 *            Concerned identifier.
	 * @param label
	 *            Concerned Label.
	 * @param value
	 *            Value to put into the identifier array at the correct position
	 *            corresponding to the label.
	 * @return True in case of success. False otherwise (doesn't contain the
	 *         label or identifier).
	 */
	public Boolean addValueToRowLabel(String rowIdentifier, String label, String value) {
		if (!_data.containsKey(rowIdentifier))
			return false;
		Integer id = _head.indexOf(label);
		if (id < 0)
			return false;
		else
			_data.get(rowIdentifier).add(id, value);
		return true;
	}

	/**
	 * Side-effect : The metric of _totalReplacedValues is updated.
	 * 
	 * @param expr
	 *            Regular expression.
	 * @param replaceWith
	 *            Replace the values matching expr by replaceWith.
	 * @param label
	 *            Concerned label.
	 * @return The number of replaced values.
	 */
	public Integer filterReplaceColumnValuesBy(String expr, String replaceWith, String label) {
		if (!isLabel(label))
			return -1;
		Iterator<String> it = getRowIdentifierIterator();
		String key;
		List<String> values;
		Integer j = _head.indexOf(label);
		Integer k = 0;
		while (it.hasNext()) {
			key = it.next();
			values = _data.get(key);
			if (values.get(j).contains(expr)) {
				values.set(j, replaceWith);
				k++;
			}
		}
		_totalReplacedValues = _totalReplacedValues + k;
		return k;
	}

	/**
	 * Side-effect : The metric of _totalReplacedValues is updated.
	 * 
	 * @param expr
	 *            Regular expression.
	 * @param replaceWith
	 *            Replace the values matching expr by replaceWith.
	 * @return The number of replaced values.
	 */
	public Integer filterReplaceValuesBy(String expr, String replaceWith) {
		Iterator<String> it = getRowIdentifierIterator();
		String key;
		List<String> values;
		Integer i;
		Integer j;
		Integer k = 0;
		while (it.hasNext()) {
			key = it.next();
			values = _data.get(key);
			i = 0;
			j = values.size();
			while (i < j) {
				if (values.get(i).contains(expr)) {
					values.set(i, replaceWith);
					k++;
				}
				i++;
			}
		}
		_totalReplacedValues = _totalReplacedValues + k;
		return k;
	}

	/**
	 * @param rplMap
	 *            <expr,replaceWith> Replace each values matching expr by
	 *            replaceWith.
	 * @return Number of replaced values.
	 */
	public Integer filterReplaceValuesBy(Map<String, String> rplMap) {
		Iterator<String> it = getRowIdentifierIterator();
		Iterator<String> it2;
		String replaceExpr;
		String key;
		List<String> values;
		Integer i;
		Integer j;
		Integer k = 0;
		while (it.hasNext()) {
			key = it.next();
			values = _data.get(key);
			i = 0;
			j = values.size();
			while (i < j) {
				it2 = rplMap.keySet().iterator();
				while (it2.hasNext()) {
					replaceExpr = it2.next();
					if (values.get(i).contains(replaceExpr)) {
						values.set(i, rplMap.get(replaceExpr));
						k++;
					}
				}
				i++;
			}
		}
		_totalReplacedValues = _totalReplacedValues + k;
		return k;
	}

	public Boolean filterCharacteristic(String characteristicName) {
		if (filterColumn(characteristicName))
			return true;
		if (getNbSubViews() > 0) {
			Iterator<ConversionModelArray> it = getSubViewsIterator();
			ConversionModelArray conv;
			Boolean out = true;
			while (it.hasNext() && out) {
				conv = it.next();
				if (conv.filterCharacteristic(characteristicName))
					out = false;
			}
			if (!out)
				return true;
			return false;
		}
		return false;
		// TODO metric
	}

	// TODO javadoc
	public Integer isAmbiguousCharacteristic(String characteristicName) {
		Integer out = 0;
		if (getLabelID(characteristicName) != -1)
			out++;
		if (getNbSubViews() > 0) {
			Iterator<ConversionModelArray> convIT = getSubViewsIterator();
			ConversionModelArray conv;
			while (convIT.hasNext()) {
				conv = convIT.next();
				out = out + conv.isAmbiguousCharacteristic(characteristicName);
			}
		}
		return out;
	}

	/**
	 * @param label
	 *            Label name to filter.
	 * @return True if the label was successfully removed. False otherwise.
	 */
	public Boolean filterColumn(String label) {
		Integer index = _head.indexOf(label);
		if (index == -1)
			return false;
		removeLabel(label);
		String tmp;
		Iterator<String> it = _data.keySet().iterator();
		while (it.hasNext()) {
			tmp = it.next();
			List<String> getted = _data.get(tmp);
			getted.remove(index.intValue());
			_data.put(tmp, getted);
			_totalFilteredValue = _totalFilteredValue + 1;
		}
		_totalFilteredColumns = _totalFilteredColumns + 1;
		return true;
	}

	/**
	 * @param columns
	 *            ArrayList containing the list of label names to filter.
	 * @return True if every given label were successfully filtered.
	 */
	public Boolean filterColumns(ArrayList<String> columns) {
		Iterator<String> colnameIT = columns.iterator();
		String colname;
		Boolean out = true;
		Boolean hasFiltered = false;
		while (colnameIT.hasNext()) {
			colname = colnameIT.next();
			out = out && filterColumn(colname);
			hasFiltered = true;
		}
		if (hasFiltered)
			return out;
		return false;
	}

	/**
	 * 
	 * @param labelsName
	 *            Arraylist containing a list of labels to keep.
	 * @return Boolean if every other label than the labels in the labels list
	 *         have been filtered. False otherwise.
	 */
	public Boolean filterKeepOnlyColumns(Collection<String> labelsName) {
		Iterator<String> colNameIt = labelsName.iterator();
		String colName;
		while (colNameIt.hasNext()) {
			colName = colNameIt.next();
			if (!_head.contains(colName))
				return false;
		}
		Boolean out = true;
		int i = 0;
		while (i < getNbActualColumns() && out) {
			colName = _head.get(i);
			if (!labelsName.contains(colName)) {
				out = out && filterColumn(colName);
				i = i - 1;
			}
			i++;
		}
		if (i > 0)
			return out;
		return false;
	}

	/**
	 * @param x
	 *            Number of labels to keep.
	 * @return The number of filtered labels.
	 */
	public Integer filterKeepOnlyXColumns(int x) {
		Iterator<String> it = _head.iterator();
		String label;
		ArrayList<String> toFilter = new ArrayList<String>();
		int i = 0;
		while (it.hasNext() && i < x) {
			label = it.next();
			toFilter.add(label);
			i++;
		}
		filterKeepOnlyColumns(toFilter);
		return i;
	}

	/**
	 * @param identifierNames
	 *            List of identifier names. Only these names are kept, the
	 *            others are filtered.
	 * @return The number of filtered identifiers.
	 */
	public Boolean filterKeepOnlyRows(Collection<String> identifierNames) {

		Set<String> existingIdentifiers = new HashSet<String>(_data.keySet());
		boolean b1 = existingIdentifiers.containsAll(identifierNames);
		if (!b1)
			return false;
		boolean b2 = existingIdentifiers.removeAll(identifierNames);
		if (!b2) // checking is not necessary according to previous checking
					// (subset inclusion property)
			return false;

		return filterRows(existingIdentifiers);

	}

	/**
	 * @param rowName
	 *            Identifier to filter.
	 * @return True if the identifier was correctly filtered. False otherwise.
	 */
	public Boolean filterRow(String rowName) {
		if (_data.get(rowName) == null)
			return false;
		Integer rowSize = _data.get(rowName).size();
		Boolean out = removeRow(rowName);
		if (!out)
			return false;
		_totalFilteredRows = _totalFilteredRows + 1;
		_totalFilteredValue = _totalFilteredValue + rowSize;
		return true;
	}

	/**
	 * @param rowsName
	 *            List of identifier to filter.
	 * @return True if each given identifier was successfully filtered. False
	 *         otherwise.
	 */
	public Boolean filterRows(Collection<String> rowsName) {
		Iterator<String> names = rowsName.iterator();
		String name;
		Boolean out = true;
		while (names.hasNext() && out) {
			name = names.next();
			out = out && filterRow(name);
		}
		return out;
	}

	/**
	 * @param x
	 *            Number of identifier to keep.
	 * @return The number of filtered identifier.
	 */
	public Integer filterKeepOnlyXRows(Integer x) {

		// TODO use filterRows

		int nbBaseRows = getNbActualRows();
		Iterator<String> it = _data.keySet().iterator();
		String name;
		int i = 0;
		HashMap<String, List<String>> finalMap = new HashMap<String, List<String>>();
		while (it.hasNext() && i < x) {
			name = it.next();
			finalMap.put(name, _data.get(name));
			i++;
		}
		_data = finalMap;
		int filteredThisTime = nbBaseRows - getNbActualRows();
		_totalFilteredRows = _totalFilteredRows + filteredThisTime;
		_totalFilteredValue = _totalFilteredValue + (filteredThisTime * getNbActualColumns());
		return filteredThisTime;
	}

	/**
	 * @return the name of the view
	 */
	public String getViewName() {
		return _viewName;
	}

	/**
	 * Modify the name of the view.
	 * 
	 * @param viewName
	 *            The new name of the view.
	 */
	public void setViewName(String viewName) {
		_viewName = viewName;
	}

	public Integer getNbActualColumns() {
		return _head.size();
	}

	public Integer getNbActualRows() {
		return _data.size();
	}

	public Integer getNbFilteredValues() {
		return _totalFilteredValue;
	}

	/**
	 * @param by
	 */
	protected void increaseNbFilteredValue(Integer by) {
		_totalFilteredValue = _totalFilteredValue + by;
	}

	public Integer getNbFilteredColumns() {
		return _totalFilteredColumns;
	}

	/**
	 * @param by
	 */
	protected void increaseNbFilteredColumn(Integer by) {
		_totalFilteredColumns = _totalFilteredColumns + by;
	}

	public Integer getNbFilteredRows() {
		return _totalFilteredRows;
	}

	/**
	 * @param by
	 */
	protected void increaseNbFilteredRows(Integer by) {
		_totalFilteredRows = _totalFilteredRows + by;
	}

	public Integer getNbReplacedValues() {
		return _totalReplacedValues;
	}

	/**
	 * @param by
	 */
	protected void increaseReplacedValues(Integer by) {
		_totalReplacedValues = _totalReplacedValues + by;
	}

	/**
	 * @return String to place to the ConversionModelArray when there is no
	 *         value for a cell in the input CSV file.
	 */
	public String getDefaultCharacter() {
		return this._defaultCharacter;
	}

	/**
	 * Side-effects : <br />
	 * This object contains the data / head of the other object after
	 * aggregation.<br />
	 * other object isn't modified.
	 * 
	 * @param other
	 *            CSVAbstract object.
	 * @return The aggregation of this object with the object given in input
	 *         (other). Each labels of other are put at the right of this object
	 *         labels. After aggregation, the set of identifier correspond to
	 *         the union of this and other entities. When there is some values
	 *         that are empty, they are replaced with _defaultValue. Dimension
	 *         result = dimension this + dimension other.
	 */
	public Boolean aggregateWith(ConversionModelArray other) {

		int thisBaseDim = getNbActualColumns();
		Iterator<String> otherHeaderIT = other.getHeadLabelsIterator();
		String tmp;
		while (otherHeaderIT.hasNext()) {
			tmp = otherHeaderIT.next();
			if (isLabel(tmp))
				return false;
			addLabel(tmp);
		}

		Iterator<String> otherDataKeyIT = other.getRowIdentifierIterator();
		String otherDataKey;
		Iterator<String> valuesIT;
		while (otherDataKeyIT.hasNext()) {
			otherDataKey = otherDataKeyIT.next();
			if (!isIdentifier(otherDataKey)) {
				addRow(otherDataKey);
				while (0 < thisBaseDim) {
					addValueToRow(otherDataKey, _defaultCharacter);
					thisBaseDim--;
				}
			}
			valuesIT = other.getRowValuesIterator(otherDataKey);
			while (valuesIT.hasNext()) {
				tmp = valuesIT.next();
				addValueToRow(otherDataKey, tmp);
			}
		}

		Iterator<String> thisDataKeyIT = getRowIdentifierIterator();
		while (thisDataKeyIT.hasNext()) {
			tmp = thisDataKeyIT.next();
			while (getRowSize(tmp) < this.getNbActualColumns())
				addValueToRow(tmp, _defaultCharacter);
			if (getRowSize(tmp) > this.getNbActualColumns())
				return false;
		}
		return true;
	}

	/**
	 * Utilitary function.
	 * 
	 * @param path
	 *            Path of the file you want to write in.
	 * @param content
	 *            Content to put in the file.
	 * @return True if the file was correctly written. False otherwise.
	 */
	protected Boolean writeToFile(String path, String content) {
		try {
			// Create file
			FileWriter fstream = new FileWriter(path);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(content);
			// Close the output stream
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
