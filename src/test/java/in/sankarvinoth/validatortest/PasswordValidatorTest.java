package in.sankarvinoth.validatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.validator.PasswordValidator;

class PasswordValidatorTest {

	@Test
	/**
	 * method to test password using tested with correct password
	 */
	void testCase1() {
		boolean isValidPassword = PasswordValidator.isValidPassword("VinoS@25");
		assertTrue(isValidPassword);
	}

	@Test
	/**
	 * method to test password using tested with null password
	 */
	void testCase2() {
		boolean isValidPassword = PasswordValidator.isValidPassword("");
		assertFalse(isValidPassword);
	}

	@Test
	/**
	 * method to test password using tested with higher length password
	 */
	void testCase3() {
		boolean isValidPassword = PasswordValidator.isValidPassword("Vinothsank@25");
		assertFalse(isValidPassword);
	}

}
