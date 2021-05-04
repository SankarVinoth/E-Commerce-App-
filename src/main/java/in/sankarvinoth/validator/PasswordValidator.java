package in.sankarvinoth.validator;

public class PasswordValidator {
	/**
	 * method to validate password
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isValidPassword(String password) {
		boolean isValid = false;
		// logic
		if (password.equals(null) || password.trim().equals("") || password.length() > 10) {
			isValid = false;
			return isValid;
		} else {
			isValid = true;
			return isValid;
		}
	}

}
