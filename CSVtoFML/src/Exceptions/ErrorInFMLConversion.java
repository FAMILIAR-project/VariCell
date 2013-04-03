package Exceptions;

public class ErrorInFMLConversion extends Exception {

	private static final long serialVersionUID = 8645951602700137817L;

	public ErrorInFMLConversion() {
		super();
	}

	public ErrorInFMLConversion(String message) {
		super(message);
	}

	public ErrorInFMLConversion(Exception source) {
		super(source);
	}
}
