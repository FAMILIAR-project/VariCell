import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.Expression;
import gsd.synthesis.FeatureEdge;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureGraphFactory;
import gsd.synthesis.FeatureModel;
import gsd.synthesis.FeatureNode;

/**
 * 
 */

/**
 * @author macher1
 *
 */
public class Product {

	private List<Header> _headers;
	private String _id;
	
	private Tree<String> _structuralInformation ; 
	
	
	private Map<String, String> _headers2Values = new HashMap<String, String>() ;


	public Product(String id, Tree<String> structuralInformation, List<Header> headers) {
		_id = id ; 
		_structuralInformation = structuralInformation ; 
		_headers = headers ;
	}

	public boolean add (int j, String val) {
		if (j < 0 || j >= _headers.size()) 
			return false ; 
		Header header = _headers.get(j);
		_headers2Values.put(header.getName(), val);
		return true ; 		
	}
	
	public String getValue(String s) {
		return _headers2Values.get(s);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder() ; 
		sb.append("" + _id + " (" + _structuralInformation + ") " + "#" + _headers.size() + " => ") ; 
		
		sb.append("{");
		Set<String> headersID = _headers2Values.keySet() ;
		for (String headerID : headersID) {
			Header h = getHeader(headerID);
			if (h == null)
				continue ;
			String parentHeader = "";
			if (h.getParentHeaders().size() > 0)
				parentHeader = " [" + h.getParentHeaders() + "] " ; 
			sb.append("" + headerID + parentHeader + "=" + _headers2Values.get(headerID) + ", ");			 
		}
		sb.append("}");
		return sb.toString() ; 
		
	}

	private Header getHeader(String headerID) {
		for (Header h : _headers) {
			String hName = h.getName() ; 
			if (hName.equals(headerID)) {
				return h ;
			}
		}
		return null ; 
	}

	public String getName() {
		return _id ; 
	}

	public List<Header> getHeaders() {
		return _headers ;
	}

	public void setName(String id) {
		_id = id ; 		
	}

	public boolean removeColumn(Header primaryHeader) {
		boolean b1 = _headers.remove(primaryHeader);
		String v = _headers2Values.remove(primaryHeader.getName());
		return b1 && v != null ; 
		
	}
	
	@Override
	public boolean equals(Object o ) {
		if (!(o instanceof Product))
			return false ; 
		else {
			Product op = (Product) o ;
			List<Header> hs = op.getHeaders() ;
			for (Header header : hs) {
				String hName = header.getName() ; 
				if (!op.getValue(hName).equals(getValue(hName)))
					return false ; 
			}
			return true ; 
					
		}
	}

	public FeatureModelVariable toFeatureDiagram() {
		FeatureModel<String> rFM = FeatureGraphFactory.mkStringFactory().mkTopModel() ; 
		FeatureGraph<String> g = rFM.getDiagram() ; 
		/*
		 * 0. add all features
		 */
		
		
 
		String idFM = _id.replaceAll(" ", "");

		
		// strctural information
		String hS = _structuralInformation.getHead() ;
		FeatureNode<String> currentTopFeature = mkFeatureNode(hS, rFM) ; 
		g.addEdge(currentTopFeature, g.getTopVertex(), FeatureEdge.HIERARCHY); 
		g.addEdge(currentTopFeature, g.getTopVertex(), FeatureEdge.MANDATORY);
		
		Collection<Tree<String>> leafs = _structuralInformation.getSubTrees() ;
		if (leafs.size() > 0) {
			for (Tree<String> leaf : leafs) {
				FeatureNode<String> leafNode = mkFeatureNode(leaf.getHead(), rFM) ;
				g.addEdge(currentTopFeature, leafNode, FeatureEdge.HIERARCHY) ; 
				g.addEdge(currentTopFeature, leafNode, FeatureEdge.MANDATORY) ; 
			}
		} // FIXME doing that recursively 
		
		
		// assemble headers
		
		
		
		// and treat value / content
		for (Map.Entry<String, String> entry : _headers2Values.entrySet())
		{
			String headerID = entry.getKey() ; 
			
			
			Header h = getHeader(headerID);
			if (h == null)
				continue ;
			if (h.getParentHeaders().size() > 0) {
				Collection<Header> pHeaders = h.getParentHeaders() ; // FIXME: normally 1 parent
				for (Header pH : pHeaders) {
					
				}
			}		
			
			String val = entry.getValue() ;
			
			if (VariabilityPatternsUtils.isNot(val)) {
			// more restrictive
				/*if (VariabilityPatternsUtils.isNot(val) 
					||	VariabilityPatternsUtils.isUncertain(val) 
				|| VariabilityPatternsUtils.isUnknowns(val)) {*/
				FeatureNode<String> pFt = mkFeatureNode(headerID, rFM) ; 
				g.addEdge(pFt, currentTopFeature, FeatureEdge.HIERARCHY); // FIXME: negated afterwards
				rFM.addConstraint(new Expression<String>(headerID).not());
			}
			
			else if (VariabilityPatternsUtils.isYes(val)) {
				// mandatory ?
				FeatureNode<String> cFt = mkFeatureNode(headerID, rFM) ; 
				g.addEdge(cFt, currentTopFeature, FeatureEdge.HIERARCHY);
				g.addEdge(cFt, currentTopFeature, FeatureEdge.MANDATORY);
				
			}
			else if (VariabilityPatternsUtils.isBlanked(val)) {
				// nothing ?
				
			}
			
			else if (VariabilityPatternsUtils.isUncertain(val) || VariabilityPatternsUtils.isUnknowns(val)) {
				FeatureNode<String> pFt = mkFeatureNode(headerID, rFM) ; 
				g.addEdge(pFt, currentTopFeature, FeatureEdge.HIERARCHY); // optional
				
			}
			
			else if (VariabilityPatternsUtils.isConstrained(val)) {
				FeatureNode<String> pFt = mkFeatureNode(headerID, rFM) ; 
				g.addEdge(pFt, currentTopFeature, FeatureEdge.HIERARCHY); // optional
				
			}
			
			else {
				FeatureNode<String> pFt = mkFeatureNode(headerID, rFM) ; 
				g.addEdge(pFt, currentTopFeature, FeatureEdge.HIERARCHY);
				g.addEdge(pFt, currentTopFeature, FeatureEdge.MANDATORY);
				
				FeatureNode<String> cFt = mkFeatureNode(val, rFM) ; 
				if (cFt != pFt) {
					g.addEdge(cFt, pFt, FeatureEdge.HIERARCHY);
					g.addEdge(cFt, pFt, FeatureEdge.MANDATORY);
				}
			}	

		}
		
		return new FeatureModelVariable(idFM, rFM) ; 
	}



	private FeatureNode<String> mkFeatureNode(String hS, FeatureModel<String> rFM) {
		String ftName = _interop(hS);
		FeatureGraph<String> g = rFM.getDiagram() ; 
		try {
			FeatureNode<String> fn = g.findVertex(ftName) ;
			return fn ;
		}
		catch(Exception e) {
			FeatureNode<String> fn = new FeatureNode<String>(ftName); //if it already exists
			g.addVertex(fn);
			return fn ; 
		}
	
		
	}

	private String _interop(String hS) {
		
		if (hS.contains(")")) {
		//	hS = hS.substring(0, hS.lastIndexOf(")"));
		}
		return hS.replaceAll("\\{", "")
				.replaceAll("\\}", "")
				.replaceAll("<ref>...</ref>", "") // hack
				.replaceAll("<ref .../>", "")
				.replaceAll("<ref ...>...</ref>", "")
				;
	}

	

	public boolean removeColumn(String headerName) {
		Header h = getHeader(headerName) ;
		if (h == null)
			return false ; 
		return removeColumn(h);		
	}

	public Collection<String> getAllValues() {
		return _headers2Values.values() ; 	
	}

	

	

	
}
