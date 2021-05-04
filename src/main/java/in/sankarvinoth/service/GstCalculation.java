package in.sankarvinoth.service;

public class GstCalculation {
	/**
	 * method used to calculate GST
	 * 
	 * @param amount
	 * @param percentage
	 * @return
	 */
	public static double gstCalculation(double amount, int percentage) {
		// logic to calculate GST
		double gst = Math.round((amount * percentage) / 100);
		return gst;
	}
}
