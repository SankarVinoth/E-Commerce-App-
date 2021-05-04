package in.sankarvinoth.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.service.PriceEstimator;

class PriceEstimatorTest {
	@Test
	/**
	 * test case 1: using positive values
	 */
	public void testCase1() {
		// passing serial no and Quantity of the product
		double totalAmount = PriceEstimator.priceEstimator(2, 2);
		assertEquals(17160, totalAmount);

	}

	@Test
	/**
	 * test case 2: using zeros as input
	 */
	public void testCase2() {
		double totalAmount = PriceEstimator.priceEstimator(0, 0);

	}

}
