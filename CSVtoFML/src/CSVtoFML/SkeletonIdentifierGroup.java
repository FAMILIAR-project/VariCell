package CSVtoFML;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * This class represents a group of identifier. The primary group is the ID
 * group. If there is another identifier group than the primary group, the
 * concerned entities have composed ids.
 * 
 * @author Charles Vanbeneden
 */
public class SkeletonIdentifierGroup {

	protected Set<String> _identifiers;
	protected Boolean _primary;
	protected String _featureName;

	/**
	 * 
	 * @param featureName
	 *            Name of the identifier group.
	 */
	public SkeletonIdentifierGroup(String featureName) {
		this._identifiers = new HashSet<String>();
		this._primary = true;
		this._featureName = featureName;
	}

	/**
	 * @param primary
	 *            True to make this identifier group primary. (ID group)
	 */
	public void setPrimary(Boolean primary) {
		this._primary = primary;
	}

	/**
	 * @return The feature name of this group of identifier.
	 */
	public String getFeatureName() {
		return _featureName;
	}

	/**
	 * @return Set of entity identifiers.
	 */
	public Set<String> getIdentifiers() {
		return this._identifiers;
	}

	/**
	 * @return True if this Identifier is the primary identifier (ID).
	 */
	public Boolean isPrimary() {
		return this._primary;
	}

	/**
	 * Used by the Skeleton class.
	 * 
	 * @return FAMILIAR String representation of this identifier group.
	 */
	public String getFAMILIARSubProduction() {
		int size = _identifiers.size();
		if (size == 0)
			return "";
		Iterator<String> identifierIT = this._identifiers.iterator();
		String out = this._featureName + " : ";
		String tmp = "";
		Boolean first = true;
		while (identifierIT.hasNext()) {
			if (first) {
				tmp = identifierIT.next();
				first = false;
			} else {
				tmp = tmp + " | " + identifierIT.next();
			}
		}
		if (size == 1)
			return out + tmp + ";";
		return out + "(" + tmp + ");";
	}
}
