package CSVtoFML;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * 
 * @author Charles Vanbeneden
 */
public class SkeletonView {

	protected String _viewName;
	protected Set<SkeletonCharacteristic> _characteristics;
	protected Boolean _isOptional;
	protected Boolean _isVisibilityInferred;
	protected List<SkeletonView> _subviews;

	public SkeletonView(String viewName) {
		_viewName = viewName;
		_characteristics = new HashSet<SkeletonCharacteristic>();
		_isOptional = true;
		_isVisibilityInferred = false;
		_subviews = new ArrayList<SkeletonView>();
	}

	public Boolean addSubView(SkeletonView subview) {
		return _subviews.add(subview);
	}

	public Integer getNbSubViews() {
		return _subviews.size();
	}

	public Iterator<SkeletonView> getSubViewsIterator() {
		return _subviews.iterator();
	}

	public SkeletonView getSubView(String subViewName) {
		Iterator<SkeletonView> vIT = getSubViewsIterator();
		SkeletonView v;
		while (vIT.hasNext()) {
			v = vIT.next();
			if (v.getViewName().compareTo(subViewName) == 0)
				return v;
		}
		return null;
	}

	public Boolean hasSubView() {
		return _subviews.size() > 0;
	}

	public Boolean isSubView(String subViewName) {
		SkeletonView v = getSubView(subViewName);
		if (v == null)
			return false;
		return true;
	}

	public Boolean removeSubView(String viewName) {
		Iterator<SkeletonView> convIT = _subviews.iterator();
		SkeletonView conv;
		while (convIT.hasNext()) {
			conv = convIT.next();
			if (conv.getViewName().compareTo(viewName) == 0)
				return _subviews.remove(conv);
		}
		return false;
	}

	public Set<SkeletonCharacteristic> getCharacteristics() {
		return _characteristics;
	}

	public SkeletonCharacteristic getCharacteristic(String name) {
		Iterator<SkeletonCharacteristic> it = getCharacteristics().iterator();
		SkeletonCharacteristic ch;
		while (it.hasNext()) {
			ch = it.next();
			if (ch.getFeatureName().compareTo(name) == 0)
				return ch;
		}
		return null;
	}

	public String getViewName() {
		return _viewName;
	}

	public Boolean isOptional() {
		inferVisibility();
		return _isOptional;
	}

	private void inferVisibility() {
		if (!_isVisibilityInferred) {
			Iterator<SkeletonCharacteristic> charIT = _characteristics.iterator();
			SkeletonCharacteristic characteristic;
			while (charIT.hasNext() && _isOptional) {
				characteristic = charIT.next();
				_isOptional = _isOptional && characteristic.isOptional();
			}
			_isVisibilityInferred = true;
		}
	}

	public String getFAMILIARSubProductions() {
		if (_characteristics.size() == 0)
			return "";
		Iterator<SkeletonCharacteristic> charIT = _characteristics.iterator();
		SkeletonCharacteristic characteristic;
		String out = _viewName + " : ";
		String subProds = "";
		while (charIT.hasNext()) {
			characteristic = charIT.next();
			if (characteristic.isOptional())
				out = out + "[" + characteristic.getFeatureName() + "] ";
			else
				out = out + characteristic.getFeatureName() + " ";
			subProds = subProds + characteristic.getFAMILIARSubProductions();
		}

		if (hasSubView()) {
			Iterator<SkeletonView> vIT = getSubViewsIterator();
			SkeletonView v;
			while (vIT.hasNext()) {
				v = vIT.next();
				out = out + v.getViewName();
				subProds = subProds + v.getFAMILIARSubProductions();
			}
		}
		return out + "; " + subProds;
	}
}
