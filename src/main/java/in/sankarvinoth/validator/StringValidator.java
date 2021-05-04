package in.sankarvinoth.validator;

public class StringValidator {
	/**
	 * method to validate String
	 * 
	 * @param input
	 * @return boolean
	 */
	public static boolean isValidString(String input) {
		boolean isValid = false;
		// Logic
		if (input == null || input.trim().equals("") || input.length() > 12 || !input.equalsIgnoreCase(input)) {
			isValid = false;
			return isValid;
		} else {
			isValid = true;
			return isValid;
		}
	}

}
