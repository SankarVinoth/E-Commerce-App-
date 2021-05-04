package in.sankarvinoth.service;

import java.util.HashMap;
import java.util.Set;

import in.sankarvinoth.validator.UserInputsValidator;

public class UserManager {
	private static HashMap<String, String> credentials = new HashMap<String, String>();

	static { // register for registered users
		credentials.put("sankar", "sankar25");
		credentials.put("vinoth", "vinoth25");
		credentials.put("nethaji", "nethaji14");
		credentials.put("lingtan", "lingtan21");
		credentials.put("vibin", "vibin12");

	}

	/**
	 * method to validate registered user
	 * 
	 * @param username
	 * @param Password
	 * @param userType
	 * @return boolean
	 */

	public static boolean registeredUser(String username, String Password, String userType) {
		boolean isValidInputs = false;
		boolean isValid = false;
		isValidInputs = UserInputsValidator.UserInputsValidation(username, Password);
		if (isValidInputs) {
			String actualPassword = credentials.get(username); // getting the password with respect to the username
			if (actualPassword.equals(Password)) {
				isValid = true;
				System.out.println("Successfully Logged in");
			} else {
				isValid = false;
				System.out.println("Incorrect username and password");

			}

		}
		return isValid;

	}

	/**
	 * method used to add user credentials into the register if they are new user
	 * 
	 * @param username
	 * @param Password
	 * @param userType
	 */

	public static boolean newUserRegistration(String username, String Password, String userType) {
		boolean isValidInputs = false;
		boolean isValid = false;
		// inputs validation
		isValidInputs = UserInputsValidator.UserInputsValidation(username, Password);
		// Logic
		if (isValidInputs) {
			boolean exists = credentials.containsKey(username);
			if (exists) {
				isValid = false;
				System.err.println("username already exists !!!!!!");

			} else {
				isValid = true;
				System.out.println("Successfully registered  !!!!!!!!");
				credentials.put(username, Password);

			}

		}
		return isValid;
	}
}
