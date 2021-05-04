package in.sankarvinoth.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.service.GstCalculation;

public class GSTTest1 {

	@Test
	/**
	 * method used to test with correct ie.positive values values
	 */
	public void testCase1() {
		// passing arguments to gstCalculation method
		double gst = GstCalculation.gstCalculation(100, 10);
		assertEquals(10, gst);
	}

	@Test
	/**
	 * method used to test with incorrect input
	 */
	public void testCase2() {
		double gst = GstCalculation.gstCalculation(0, 10);
		assertEquals(0, gst);
	}

	@Test
	/**
	 * method used to test with incorrect input
	 */
	// test case with '0' for percentage
	public void testCase3() {
		double gst = GstCalculation.gstCalculation(100, 0);
		assertEquals(0, gst);
	}
}
