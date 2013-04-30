
public class CatalogStat {

	private int _nHeaders;
	
	private int _nProduct;

	public CatalogStat(int nHeaders, int nProduct) {
		_nHeaders = nHeaders ; 
		_nProduct = nProduct ; 
	}
	
	public int getNumbersOfHeaders() {
		return _nHeaders;
	}

	public int getNumbersOfProduct() {
		return _nProduct;
	}


}
