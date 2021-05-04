package in.sankarvinoth.validatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.validator.NumberValidator;

class NumberValidatorTest {

	@Test
	/**
	 * test case 1: using positive number
	 */
	public void testCase1() {

		boolean isValid = NumberValidator.numberValidation(2);
		assertTrue(isValid);
	}

	@Test
	/**
	 * test case 2: using Zero as input
	 */
	public void testCase2() {

		boolean isValid = NumberValidator.numberValidation(0);
		assertFalse(isValid);

	}

	@Test
	/**
	 * test case 2: using negative numbers as input
	 */
	public void testCase3() {

		boolean isValid = NumberValidator.numberValidation(-2);
		assertFalse(isValid);
	}
}
