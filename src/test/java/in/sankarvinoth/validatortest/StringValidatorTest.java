package in.sankarvinoth.validatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.validator.StringValidator;

class StringValidatorTest {

	@Test
	/**
	 * method to test the string tested with correct string type
	 */
	void testCase1() {
		String input1 = "sankar";
		boolean isValidString = StringValidator.isValidString(input1);
		assertTrue(isValidString);

	}

	@Test
	/**
	 * method to test the string tested with null string type
	 */
	void testCase2() {
		String input2 = "";
		boolean isValidString = StringValidator.isValidString(input2);
		assertFalse(isValidString);

	}

	@Test
	/**
	 * method to test the string tested with null string type
	 */
	void testCase3() {
		String input3 = "            ";
		boolean isValidString = StringValidator.isValidString(input3);
		assertFalse(isValidString);

	}

	@Test
	/**
	 * method to test the string tested with exceeded length string type
	 */
	void testCase4() {
		String input4 = "sankarvinoth1234";
		boolean isValidString = StringValidator.isValidString(input4);
		assertFalse(isValidString);

	}

}
