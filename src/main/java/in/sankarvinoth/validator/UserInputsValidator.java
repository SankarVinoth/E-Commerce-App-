package in.sankarvinoth.validator;

public class UserInputsValidator {
	/**
	 * method to validate inputs
	 * 
	 * @param username
	 * @param Password
	 * @return boolean (true/false)
	 */
	public static boolean UserInputsValidation(String username, String Password) {
		boolean isValidInputs = false;
		// Logic
		if (StringValidator.isValidString(username)) {
			if (PasswordValidator.isValidPassword(Password)) {
				isValidInputs = true;
			}
		} else {
			isValidInputs = false;
		}
		return isValidInputs;
	}

}
