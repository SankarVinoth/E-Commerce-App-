package in.sankarvinoth.validator;

public class NumberValidator {
	/**
	 * method to validate number
	 * 
	 * @param number
	 * @return
	 */
	public static boolean numberValidation(int number) {
		boolean isValid = false;
		// logic
		if (number == 0 || number < 0) {
			isValid = false;
		} else {
			isValid = true;
		}

		return isValid;
	}
}
