package in.sankarvinoth.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.service.Payment;

class PaymentTest {

	@Test
	/**
	 * method to test case 1 using valid Date
	 */
	void testase1() {
		// Test case 1(with valid Date)
		boolean isValid = Payment.paymentVerification("2021-06");
		assertTrue(isValid);
	}

	@Test
	/**
	 * method to test case 2 using Invalid Date
	 */
	void testCase2() {
		// Test case 1(with Invalid Date)
		boolean isValid = Payment.paymentVerification("2021-02");
		assertFalse(isValid);
	}
}
