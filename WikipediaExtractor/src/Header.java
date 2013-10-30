import java.util.ArrayList;
import java.util.Collection;


public class Header {
	
	private Collection<Header> _nestedHeaders = new ArrayList<Header>();
	private Collection<Header> _parentHeaders = new ArrayList<Header>();
	private String _name;
	private int _numbersOfNestedHeaders = 0; 
	
	
	public Header(String hName) {
		setName(hName) ; 
	}
	
	public boolean hasNestedHeaders() {
		return !_nestedHeaders.isEmpty() || _numbersOfNestedHeaders > 0 ; 
	}

	public String getName() {
		return _name.replaceAll("<ref>...</ref>", "");
	}

	public void setName(String _name) {
		this._name = _name;
	}
	
	public boolean addNestedHeader(Header h) {
		return _nestedHeaders.add(h);
	}
	
	@Override
	public String toString() {
		 return _name ; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Header)) {
			return false ; 
		}
		else {
			Header oh = (Header) o ; 
			return oh.getName().equals(getName());
		}
	}

	public void setNumbersOfNestedHeaders(int v) {
		_numbersOfNestedHeaders  = v ; 
		
	}
	
	public int getNumbersOfNestedHeaders() {
		return _numbersOfNestedHeaders ; 
		
	}

	public Collection<Header> getNestedHeaders() {
		return _nestedHeaders ; 
	}

	public void addParentHeader(Header header) {
		header.addNestedHeader(this);
		_parentHeaders.add(header);
		
	}
	
	public Collection<Header> getParentHeaders() {
		return _parentHeaders ; 
	}
	

}
