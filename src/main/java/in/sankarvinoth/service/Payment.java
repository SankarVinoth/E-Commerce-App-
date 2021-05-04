package in.sankarvinoth.service;

import java.time.YearMonth;

public class Payment {
	/**
	 * method used to verify the card validity
	 * 
	 * @param date
	 * @return
	 */
	public static boolean paymentVerification(String date) {
		boolean isValid = false;
		// converting the String typed date to integer
		YearMonth cardExpiryDate = YearMonth.parse(date); // yyyy-mm
		if (cardExpiryDate.isBefore(YearMonth.now())) { // logic to calculate the card expiry
			isValid = false;
		} else {
			isValid = true;
		}
		return isValid;
	}
}
