package CSVtoFML;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This class represents the conversion model described in the paper. This
 * conversion model contains all the necessary data to make a feature model.
 * This class contains a set of ConversionModelArray that represents views.
 * This class provides also a consequent set of function to filter and make
 * operations on all contained ConversionModelArray. You can for example, filter
 * one entity, or replace some value by another. This class also provides some
 * metrics to quantify the data in input.
 * 
 * @author Charles Vanbeneden
 * 
 */
public class ConversionModel {

	/**
	 * Container of all ConversionModelArray of this conversion model. Each of
	 * these ConversionModelArray are views.
	 */
	private ArrayList<ConversionModelArray> _container;
	/**
	 * The root feature name specified by the user
	 */
	protected String _rootFeatureName;
	/**
	 * Some values are actually used to identify a product (it is not necessary
	 * the value of the first column/line) or *several values* can identify a
	 * product (e.g., the primary identifier, ATI, and another, NVidia)
	 */
	protected String[] _composedID;
	/**
	 * Number of view / ConversionModelArray
	 */
	protected Integer _totalFilteredView;

	/**
	 * Constructor. Makes just some initialisings.
	 * 
	 * @param rootFeatureName
	 *            Typically, name of the family/SPL or the high-level concept
	 *            further detailed by sub-features
	 * @param composedID
	 *            Complements the primary identifier, e.g., ATI is the primary
	 *            identifier while Nvidia is the composed ID.
	 *            Hence, a product is identified by its primary identifier and
	 *            the composed ID.
	 *            If you don't want to use composed ids, give just an empty
	 *            array.
	 */
	public ConversionModel(String rootFeatureName, String[] composedID) {
		_rootFeatureName = rootFeatureName;
		_container = new ArrayList<ConversionModelArray>();
		_composedID = composedID;
		_totalFilteredView = 0;
	}

	/**
	 * If you don't use composed ID, invoke this constructor.
	 * 
	 * @param rootFeatureName
	 *            Typically, name of the family/SPL or the high-level concept
	 *            further detailed by sub-features
	 */
	public ConversionModel(String rootFeatureName) {
		this(rootFeatureName, new String[0]);
	}

	/**
	 * @param cma
	 *            ConversionModelArray to add to this conversion model.
	 * @return True if the given cma is added to the conversion model.
	 */
	public Boolean addView(ConversionModelArray cma) {
		return _container.add(cma);
	}

	/**
	 * @param viewName
	 *            ViewName corresponding to the ConversionModelArray you want to
	 *            retrieve.
	 * @return The ConversionModelArray corresponding to the given viewName.
	 */
	public ConversionModelArray getView(String viewName) {
		Iterator<ConversionModelArray> viewIT = getViewsIterator();
		ConversionModelArray view = null;
		while (viewIT.hasNext()) {
			view = viewIT.next();
			if (view.getViewName().compareTo(viewName) == 0)
				return view;
		}
		return null;
	}

	/**
	 * @param cma
	 *            ConversionModelArray to delete from this ConversionModel
	 * @return True if this operation was a success. False otherwise.
	 */
	public Boolean filterView(ConversionModelArray cma) {
		Integer index = _container.indexOf(cma);
		if (index == -1)
			return false;
		_container.remove(index);
		_totalFilteredView++;
		return true;
	}

	/**
	 * 
	 * @param viewName
	 *            ViewName of the ConversionModelArray you want to filter.
	 * @return True if this operation was a success. False otherwise.
	 */
	public Boolean filterView(String viewName) {
		ConversionModelArray view = getView(viewName);
		if (view == null)
			return false;
		int cSize = _container.size();
		_container.remove(view);
		if (cSize == _container.size())
			return false;
		_totalFilteredView++;
		return true;
	}

	public void setRootFeatureName(String rootFeatureName) {
		_rootFeatureName = rootFeatureName;
	}

	/**
	 * This function keeps only the ConversionModelArray that are named in the
	 * set given in input.
	 * 
	 * @param viewNamesToKeep
	 *            Set of String corresponding to viewNames of
	 *            ConversionModelArray you want to keep.
	 * @return True in case of success. False otherwise.
	 */
	public Boolean filterKeepOnlyViews(List<String> viewNamesToKeep) {
		Iterator<ConversionModelArray> viewsIT = getViewsIterator();
		ConversionModelArray view;
		ArrayList<String> viewNamesToDelete = new ArrayList<String>();
		while (viewsIT.hasNext()) {
			view = viewsIT.next();
			if (!viewNamesToKeep.contains(view.getViewName()))
				viewNamesToDelete.add(view.getViewName());
			else
				viewNamesToKeep.remove(view.getViewName());
		}

		if (viewNamesToKeep.size() > 0)
			return false;

		Iterator<String> viewNamesToDeleteIT = viewNamesToDelete.iterator();
		String viewNameToDelete;
		Boolean out = true;
		while (viewNamesToDeleteIT.hasNext() && out) {
			viewNameToDelete = viewNamesToDeleteIT.next();
			out = out && filterView(viewNameToDelete);
		}
		return out;
	}

	/**
	 * @return An iterator of all the views in the local container.
	 */
	public Iterator<ConversionModelArray> getViewsIterator() {
		return _container.iterator();
	}

	/**
	 * @return The root feature name.
	 */
	public String getRootFeatureName() {
		return _rootFeatureName;
	}

	/**
	 * @return An array containing the differents identifiors of the composed
	 *         ids.
	 */
	public String[] getComposedIDArray() {
		return _composedID;
	}

	/**
	 * Replace each values of each ConversionModelArray corresponding to the
	 * regular expression expr by replaceWith.
	 * 
	 * @param expr
	 *            Regular expression of the values to replace.
	 * @param replaceWith
	 *            String to put instead of the value to replace.
	 * @return Number of replaced values.
	 */
	public Integer filterReplaceValuesBy(String expr, String replaceWith) {
		Iterator<ConversionModelArray> convArrIT = _container.iterator();
		Integer k = 0;
		ConversionModelArray convArr;
		while (convArrIT.hasNext()) {
			convArr = convArrIT.next();
			k = k + convArr.filterReplaceValuesBy(expr, replaceWith);
		}
		return k;
	}

	/**
	 * Replace each values of each ConversionModelArray corresponding to the
	 * regular expression expr by replaceWith (remplaceMap =
	 * <expr,replaceWith>).
	 * 
	 * @param expr
	 *            Regular expression of the values to replace.
	 * @param replaceWith
	 *            String to put instead of the value to replace.
	 * @return Number of replaced values.
	 */
	public Integer filterReplaceValuesBy(Map<String, String> remplaceMap) {
		Iterator<ConversionModelArray> convArrIT = _container.iterator();
		Integer k = 0;
		ConversionModelArray convArr;
		while (convArrIT.hasNext()) {
			convArr = convArrIT.next();
			k = k + convArr.filterReplaceValuesBy(remplaceMap);
		}
		return k;
	}

	/**
	 * Keep at the maximum x ConversionModelArrays in the local container.
	 * 
	 * @param x
	 *            Number of view to keep in the container.
	 * @return True in case of success. False otherwise.
	 */
	public Boolean filterKeepOnlyXViews(Integer x) {
		Boolean out = true;
		while (x < _container.size() && out) {
			out = out && filterView(_container.get(x));
		}
		return out;
	}

	/**
	 * Filter an entity in every view and sub-views.
	 * 
	 * @param entityName
	 *            Name of the entity to filter.
	 * @return True in case of success. False otherwise.
	 */
	public Boolean filterEntity(String entityName) {
		Iterator<ConversionModelArray> convArrayIT = getViewsIterator();
		ConversionModelArray convArray;
		Boolean out = true;
		while (convArrayIT.hasNext() && out) {
			convArray = convArrayIT.next();
			out = out && filterEntitySubViews(convArray, entityName);
		}
		return out;
	}

	/**
	 * Recursive function to filter an entity in every subviews of a given view.
	 * 
	 * @param view
	 *            View to filter.
	 * @return True in case of success of the filtering of every subviews. False
	 *         otherwise.
	 */
	private Boolean filterEntitySubViews(ConversionModelArray view, String entityName) {
		Boolean out = true;
		out = out && view.filterRow(entityName);

		Iterator<ConversionModelArray> it = view.getSubViewsIterator();
		ConversionModelArray sub;
		while (it.hasNext() && out) {
			sub = it.next();
			out = out && filterEntitySubViews(sub, entityName);
		}
		return out;
	}

	/**
	 * Ambiguous means that the given characteristic name is present at the same
	 * time in different views (or sub-views). So, the name isn't unique.
	 * 
	 * @param characteristicName
	 *            Name of the characteristic to check.
	 * @return True, if the characteristic isn't ambiguous. False otherwise.
	 */
	public Boolean isNotAmbiguousCharacteristic(String characteristicName) {
		Iterator<ConversionModelArray> convArrayIT = getViewsIterator();
		ConversionModelArray convArray;
		Integer out = 0;
		while (convArrayIT.hasNext()) {
			convArray = convArrayIT.next();
			out = convArray.isAmbiguousCharacteristic(characteristicName);
		}
		if (out > 1)
			return false;
		return true;
	}

	/**
	 * @param characteristicName
	 *            Name of the characteristic to filter.
	 * @return False if the characteristic is ambiguous or if it wasn't
	 *         filtered.
	 */
	public Boolean filterCharacteristic(String characteristicName) {
		if (!isNotAmbiguousCharacteristic(characteristicName))
			return false;
		Iterator<ConversionModelArray> convArrayIT = getViewsIterator();
		ConversionModelArray convArray;
		Boolean out = false;
		while (convArrayIT.hasNext() && !out) {
			convArray = convArrayIT.next();
			out = out || convArray.filterCharacteristic(characteristicName);
		}
		return out;
	}

	/**
	 * Keep only the given identifiers as entity names in every
	 * ConversionModelArray.
	 * 
	 * @param identifiers
	 *            ArrayList of identifiers to keep in the different
	 *            ConversionModelArrays.
	 */
	public Boolean filterKeepOnlyEntities(Collection<String> identifiers) {
		Iterator<ConversionModelArray> convArrayIT = getViewsIterator();

		ConversionModelArray convArray;
		while (convArrayIT.hasNext()) {
			convArray = convArrayIT.next();
			if (!convArray.filterKeepOnlyRows(identifiers))
				return false;
		}
		return true;

	}

	/**
	 * Keep only x identifiers in every ConversionModelArrays.
	 * 
	 * @param x
	 *            Number of identifier to keep in every ConversionModelArrays.
	 */
	public void filterKeepOnlyXFirstRows(Integer x) {
		Iterator<ConversionModelArray> convArrIT = getViewsIterator();
		ConversionModelArray convArr;
		while (convArrIT.hasNext()) {
			convArr = convArrIT.next();
			convArr.filterKeepOnlyXRows(x);
		}
	}

	/**
	 * @return The addition of every dimension of every ConversionModelArrays.
	 */
	public Integer getTotalDimension() {
		Iterator<ConversionModelArray> convAIT = getViewsIterator();
		ConversionModelArray view;
		int dimension = 0;
		while (convAIT.hasNext()) {
			view = convAIT.next();
			dimension = dimension + view.getNbActualColumns();
		}
		return dimension;
	}

	/**
	 * @return The addition of rows in every ConversionModelArray.
	 */
	public Integer getTotalRows() {
		Iterator<ConversionModelArray> convAIT = getViewsIterator();
		ConversionModelArray view;
		int rows = 0;
		while (convAIT.hasNext()) {
			view = convAIT.next();
			rows = rows + view.getNbActualRows();
		}
		return rows;
	}

	/**
	 * @return The number of different entities in the combination of each
	 *         ConversionModelArray.
	 */
	public Integer getTotalEntity() {
		Iterator<ConversionModelArray> convAIT = getViewsIterator();
		Iterator<String> idIT;
		String id;
		HashSet<String> set = new HashSet<String>();
		ConversionModelArray view;
		while (convAIT.hasNext()) {
			view = convAIT.next();
			idIT = view.getRowIdentifierIterator();
			while (idIT.hasNext()) {
				id = idIT.next();
				set.add(id);
			}
		}
		return set.size();
	}

	/**
	 * @return The number of views / ConversionModelArray. Doesn't contain
	 *         sub-views.
	 */
	public Integer getTotalView() {
		return _container.size();
	}

	/**
	 * @return The addition of the number of filtered Dimension of every
	 *         ConversionModelArray.
	 */
	public Integer getTotalFilteredDimension() {
		Iterator<ConversionModelArray> it = getViewsIterator();
		ConversionModelArray conv;
		int filtered = 0;
		while (it.hasNext()) {
			conv = it.next();
			filtered = filtered + conv.getNbFilteredColumns();
		}
		return filtered;
	}

	/**
	 * @return The number of filtered views / ConversionModelArrays.
	 */
	public Integer getTotalFilteredView() {
		return _totalFilteredView;
	}

	/**
	 * @return The addition of the number of filtered rows of every
	 *         ConversionModelArrays.
	 */
	public Integer getTotalFilteredRows() {
		Iterator<ConversionModelArray> it = getViewsIterator();
		ConversionModelArray conv;
		int filtered = 0;
		while (it.hasNext()) {
			conv = it.next();
			filtered = filtered + conv.getNbFilteredRows();
		}
		return filtered;
	}

	/**
	 * @return The addition of the number of current rows of every
	 *         ConversionModelArrays.
	 */
	public Integer getTotalKeptRows() {
		Iterator<ConversionModelArray> it = getViewsIterator();
		ConversionModelArray conv;
		int kept = 0;
		while (it.hasNext()) {
			conv = it.next();
			kept = kept + conv.getNbActualRows();
		}
		return kept;
	}

	/**
	 * @return The addition of the number of current dimension of every
	 *         ConversionModelArrays.
	 */
	public Integer getTotalKeptDimension() {
		Iterator<ConversionModelArray> it = getViewsIterator();
		ConversionModelArray conv;
		int kept = 0;
		while (it.hasNext()) {
			conv = it.next();
			kept = kept + conv.getNbActualColumns();
		}
		return kept;
	}

	/**
	 * @return The addition of the number of replaced values of every
	 *         ConversionModelArrays.
	 */
	public Integer getTotalReplacedValues() {
		Iterator<ConversionModelArray> it = getViewsIterator();
		ConversionModelArray conv;
		int replaced = 0;
		while (it.hasNext()) {
			conv = it.next();
			replaced = replaced + conv.getNbReplacedValues();
		}
		return replaced;
	}
}
