/**
 * 
 */
package CSVtoFML;

/**
 * @author mathieuacher
 *
 */
public class StoFMException extends Exception {


	private static final long serialVersionUID = 2661282015538559612L;
	
	/**
	 * message that informs on the root cause of the error
	 */
	private String _message ; 
	
	public StoFMException(String message) {
		_message = message ; 
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return _message ;
	}
	
	

}
