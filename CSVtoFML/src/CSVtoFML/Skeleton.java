package CSVtoFML;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * An instance of this class is created by FMLConvert during the conversion
 * process. The Skeleton represents a basic but ideal FM (without constraints)
 * that specialize the final feature model that the user wants to creates. With
 * the diff operator, FMLConvert obtains the constraints between the boolean
 * form of the complete calculated FM and this skeleton. Then, it add these
 * constraints to the skeleton and obtain the final feature model without using
 * a reconstructing algorithm like Waterloo's university algorithm.
 * 
 * @author Charles Vanbeneden
 */
public class Skeleton {

	protected Set<SkeletonIdentifierGroup> _identifiors;
	protected Set<SkeletonView> _views;
	protected String _rootFeatureName;

	public Skeleton(String rootFeatureName) {
		_rootFeatureName = rootFeatureName;
		_views = new HashSet<SkeletonView>();
		_identifiors = new HashSet<SkeletonIdentifierGroup>();
	}

	/**
	 * @return Set of primary views, the views under the rootFeatureName.
	 */
	public Set<SkeletonView> getViews() {
		return _views;
	}

	/**
	 * @param name
	 *            Name of the view you want to get.
	 * @return The view named name.
	 */
	public SkeletonView getView(String name) {
		Iterator<SkeletonView> viewIT = _views.iterator();
		SkeletonView view;
		while (viewIT.hasNext()) {
			view = viewIT.next();
			if (view.getViewName().compareTo(name) == 0)
				return view;
		}
		return null;
	}

	/**
	 * @return The root feature name.
	 */
	public String getRootFeatureName() {
		return _rootFeatureName;
	}

	/**
	 * @return A set of Identifior, these represents groups of identifier
	 *         (primary = ID, composed = mark, model,...).
	 */
	public Set<SkeletonIdentifierGroup> getIdentifiors() {
		return _identifiors;
	}

	/**
	 * @param name
	 *            Name of the identifior you want to get ("ID" for the primary
	 *            identifior).
	 * @return The wanted identifior, or null if it doesn't exists.
	 */
	public SkeletonIdentifierGroup getIdentifior(String name) {
		Iterator<SkeletonIdentifierGroup> idIT = _identifiors.iterator();
		SkeletonIdentifierGroup id;
		while (idIT.hasNext()) {
			id = idIT.next();
			if (id.getFeatureName().compareTo(name) == 0)
				return id;
		}
		return null;
	}

	/**
	 * @return The FAMILIAR feature model string representation of the skeleton.
	 */
	public String toFMLFeatureModel() {
		String out = "FM ( " + _rootFeatureName + " : ";
		String identifiersProductions = "";
		String viewsProductions = "";
		Iterator<SkeletonIdentifierGroup> idIT = _identifiors.iterator();
		SkeletonIdentifierGroup id;
		while (idIT.hasNext()) {
			id = idIT.next();
			out = out + id.getFeatureName() + " ";
			identifiersProductions = identifiersProductions + " " + id.getFAMILIARSubProduction();
		}
		Iterator<SkeletonView> viewsIT = _views.iterator();
		SkeletonView view;
		while (viewsIT.hasNext()) {
			view = viewsIT.next();
			if (view.isOptional())
				out = out + "[" + view.getViewName() + "] ";
			else
				out = out + view.getViewName() + " ";
			viewsProductions = viewsProductions + " " + view.getFAMILIARSubProductions();
		}
		return out + " ; " + identifiersProductions + viewsProductions + ")";
	}
}
