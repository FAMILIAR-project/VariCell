import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Catalog implements Collection<Product> {
	
	private List<Product> _products = new ArrayList<Product>() ;
	private Tree<String> _structuralInformation;
	private List<Header> _headers = new ArrayList<Header>() ;; 

	public Catalog(Tree<String> structuralInformation, List<Header> rHeaders) {
		setStructuralInformation(structuralInformation) ;
		setHeaders(rHeaders) ; 
	}

	@Override
	public boolean add(Product arg0) {
		return _products.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends Product> arg0) {
		return _products.addAll(arg0);
	}

	@Override
	public void clear() {
		_products.clear() ; 
		
	}

	@Override
	public boolean contains(Object arg0) {
		return _products.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return _products.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return _products.isEmpty() ; 
	}

	@Override
	public Iterator<Product> iterator() {
		return _products.iterator() ; 
	}

	@Override
	public boolean remove(Object arg0) {
		return _products.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return _products.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return _products.retainAll(arg0);
	}

	@Override
	public int size() {
		return _products.size() ; 
	}

	@Override
	public Object[] toArray() {
		return _products.toArray() ; 
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return _products.toArray(arg0);
	}

	/**
	 * @return the _structuralInformation
	 */
	public Tree<String> getStructuralInformation() {
		return _structuralInformation;
	}

	/**
	 * @param _structuralInformation the _structuralInformation to set
	 */
	public void setStructuralInformation(Tree<String> _structuralInformation) {
		this._structuralInformation = _structuralInformation;
	}

	public boolean removeColumn(String headerName) {
		for (Product p : _products) {
			if (!p.removeColumn(headerName)) 
				return false;  
		}
		return true ; 
		
	}

	/**
	 * @return the _headers
	 */
	public List<Header> getHeaders() {
		return _headers;
	}

	/**
	 * @param _headers the _headers to set
	 */
	public void setHeaders(List<Header> _headers) {
		this._headers = _headers;
	}

	public boolean hasHeader(String columnName) {
		for (Header h : _headers) {
			if (h.getName().equals(columnName))
				return true ; 			
		}
		return false ;
	}

	public String getName() {
		return getStructuralInformation().getHead() ; 
	}

}
