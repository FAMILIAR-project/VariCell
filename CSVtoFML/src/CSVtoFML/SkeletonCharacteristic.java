package CSVtoFML;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * This class represent a characteristic in the Skeleton. A characteristic is
 * associated to a label / a feature name. A characteristic contain all the
 * variability of a label for every entities associated to the parent view.
 * 
 * @author Charles Vanbeneden
 */
public class SkeletonCharacteristic {

	protected Set<String> _specialCharacteristics;
	protected String _featureName;
	protected Boolean _isOptional;

	// protected MultiValuedMode _mode;

	public SkeletonCharacteristic(String featureName) {
		_specialCharacteristics = new HashSet<String>();
		_featureName = featureName;
		_isOptional = false;
		// _mode = null;
	}

	// public void setMultiValuedMode(MultiValuedMode mode) {
	// _mode = mode;
	// }

	public String getFeatureName() {
		return _featureName;
	}

	public void setOptional(Boolean optional) {
		_isOptional = optional;
	}

	public Set<String> getSpecialCharacteristics() {
		return _specialCharacteristics;
	}

	public Boolean isOptional() {
		return _isOptional;
	}

	public String getFAMILIARSubProductions() {
		int size = _specialCharacteristics.size();
		if (size == 0)
			return "";
		Iterator<String> characteristicsIT = _specialCharacteristics.iterator();
		String out = _featureName + " : ";
		String tmp = "";
		Boolean first = true;
		while (characteristicsIT.hasNext()) {
			if (first) {
				tmp = tmp + characteristicsIT.next();
				first = false;
			} else
				tmp = tmp + " | " + characteristicsIT.next();
		}
		if (size == 1)
			if (isOptional())
				return out + "[" + tmp + "] ; ";
			else
				return out + tmp + " ; ";
		if (isOptional())
			return out + "(" + tmp + ")? ; ";
		return out + "(" + tmp + ") ; ";
	}
}
