import java.util.Collection;

/**
 * 
 */

/**
 * @author macher1
 *
 */
public class PCMStatistic {
	



	private int _nTable ;
	
	private Collection<CatalogStat> _catalogStats ;
	

	/**
	 * @param catalogStats 
	 * 
	 */
	public PCMStatistic(int nTable, Collection<CatalogStat> catalogStats) {
		_nTable = nTable ;
		_catalogStats = catalogStats ; 
	}
	
	
	public int getNumbersOfTables() {
		return _nTable;
	}


	public Collection<CatalogStat> getCatalogStats() {
		return _catalogStats;
	}

}
