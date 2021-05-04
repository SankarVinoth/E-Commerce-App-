package in.sankarvinoth.validatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.validator.UserInputsValidator;

class UserInputsValidatorTest {

	@Test
	/**
	 * method to test inputs (username and password) tested with correct username
	 * and password
	 */
	void testCase1() {
		boolean isValidInputs = UserInputsValidator.UserInputsValidation("sankar", "Sankar@25");
		assertTrue(isValidInputs);
	}

	@Test
	/**
	 * method to test inputs (username and password) tested with incorrect username
	 * and password
	 */
	void testCase2() {
		boolean isValidInputs = UserInputsValidator.UserInputsValidation("sankar12345", "Sankar@2512334");
		assertFalse(isValidInputs);
	}

	@Test
	/**
	 * method to test inputs (username and password) tested with null username and
	 * password
	 */
	void testCase3() {
		boolean isValidInputs = UserInputsValidator.UserInputsValidation("", "");
		assertFalse(isValidInputs);
	}
}
