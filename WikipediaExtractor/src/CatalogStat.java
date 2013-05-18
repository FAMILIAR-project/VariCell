
public class CatalogStat {
	
	int nConstrained = 0 ; 
	
	public int getnConstrained() {
		return nConstrained;
	}

	public void setnConstrained(int nConstrained) {
		this.nConstrained = nConstrained;
	}

	int nUnknowns = 0 ; 
	
	public int getnUnknowns() {
		return nUnknowns;
	}

	public void setnUnknowns(int nUnknowns) {
		this.nUnknowns = nUnknowns;
	}

	int nSingleV = 0 ; 
	
	public int getnSingleV() {
		return nSingleV;
	}

	public void setnSingleV(int nSingleV) {
		this.nSingleV = nSingleV;
	}

	int nMultiValues = 0 ; 
	
	public int getnMultiValues() {
		return nMultiValues;
	}

	public void setnMultiValues(int nMultiValues) {
		this.nMultiValues = nMultiValues;
	}

	private int nEmpty = 0 ; 
	
	private int nBooleans ; 
	
	private int nUncertains ; 

	private int _nHeaders;
	
	public void setNProduct(int _nProduct) {
		this._nProduct = _nProduct;
	}

	public void setNHeaders(int _nHeaders) {
		this._nHeaders = _nHeaders;
	}

	private int _nProduct;

	
	public CatalogStat() {
		
	}

	public int getNumbersOfHeaders() {
		return _nHeaders;
	}

	public int getNumbersOfProduct() {
		return _nProduct;
	}

	/**
	 * @return the nUncertains
	 */
	public int getnUncertains() {
		return nUncertains;
	}

	/**
	 * @param nUncertains the nUncertains to set
	 */
	public void setnUncertains(int nUncertains) {
		this.nUncertains = nUncertains;
	}

	/**
	 * @return the nBooleans
	 */
	public int getnBooleans() {
		return nBooleans;
	}

	/**
	 * @param nBooleans the nBooleans to set
	 */
	public void setnBooleans(int nBooleans) {
		this.nBooleans = nBooleans;
	}

	/**
	 * @return the nEmpty
	 */
	public int getnEmpty() {
		return nEmpty;
	}

	/**
	 * @param nEmpty the nEmpty to set
	 */
	public void setnEmpty(int nEmpty) {
		this.nEmpty = nEmpty;
	}


}
