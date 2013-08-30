
public class VariabilityPatternsUtils {
	
	//Constrained/Partial/ambiguous yes/no values.
		// This kind of cells has to be interpreted as:
		// ”the criterion is satisfied under the condition of, with the following limitation, etc”. 
		// It sets additional constraints, which can be related or not to the criteria. 
		// ”Only”, ”if”, ”through”, ”paid”, ”via”, ”registered” can be candidate words to recognize this kind of value. 
		// The token ”partial” is the most significant evidence of the presence of the value type. 
		// One can also see a ”yes” with a footnote or followed by a list of one or several elements that express a condition or limitation. 
		// For instance, in Figure 1a, AOL Mail propose en client access only via POP3, IMAP and SMTP protocols 
		// (SSL or TLS are not mentioned, we can suppose that these protocols are not supported).
	public static boolean isConstrained(String val) {
		return val.contains("partial") || val.contains("only") || val.contains("Only") || val.contains("Partial")
				|| val.contains("if")  || val.contains("If")  || val.contains("Registered")  || val.contains("Via")  
				|| val.contains("paid") || val.contains("registered") || val.contains("via");
	}

	public static boolean isUncertain(String val) {
		return val.contains("dunno") || val.contains("depends")	;
	}

	public static boolean isBlanked(String val) {
		return val.isEmpty() ; 
	}

	 // ”yes/no”, ”true/false”, ”1/0”, ”x/-”, ”safe/un- safe”
	public static boolean isYes(String val) {
		return val.contains("Yes") || val.contains("yes")
				|| val.equals("1") || val.equals("x") 		
				;
	}

	public static boolean isNot(String val) {
		return
				(val.contains("no") ||
				val.contains("No") ||
				val.equals("0") ||
				val.equals("-")	|| val.contains("terminated") || val.contains("dropped")				
						) 
				&& !val.contains("Nonfree") // FIXME HACK
				;
	}

	// ”,”, ”;”, ”/”, ”or”, ”and”, ”-”
	public static boolean isMultiValues(String val) {
		return
				(val.contains(",") || val.contains(";") || val.contains("/") || val.contains("or") || val.contains("and") || val.contains("-"));
	}

	// Unknown value. One does not know if the criterion is satisfied. Cells are generally filled with ”?”, ”unknown”, ”-”, ”N/A”
	public static boolean isUnknowns(String val) {
		return val.contains("?") || val.contains("unknown")  ;
	}
	
	
}
