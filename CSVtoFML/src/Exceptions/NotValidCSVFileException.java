package Exceptions;

public class NotValidCSVFileException extends Exception {

	private static final long serialVersionUID = 7093167630765481354L;

	public NotValidCSVFileException() {
		super();
	}

	public NotValidCSVFileException(String message) {
		super(message);
	}

	public NotValidCSVFileException(Exception source) {
		super(source);
	}

}
