package in.sankarvinoth.service;

import java.util.HashMap;

import in.sankarvinoth.validator.NumberValidator;

public class PriceEstimator {
	static HashMap<Integer, Integer> pricelist = new HashMap<Integer, Integer>();
	static {
		// products serial no and their amount
		pricelist.put(1,10000);
		pricelist.put(2,7800);
		pricelist.put(3,8900);
		pricelist.put(4,7500);
		pricelist.put(5,9800);
		pricelist.put(6,5689);
		pricelist.put(7,4788);
		pricelist.put(8,4567);
		pricelist.put(9,7890);
		pricelist.put(10,4567);
	}

	/**
	 * 
	 * method used to calculate the price of product
	 * 
	 * @param quantity
	 * @param serialNo
	 * 
	 * @return TotalAmount to be paid
	 */

	public static double priceEstimator(int quantity, int serialNo) {
		double Totalamount = 0;
		double gst = 0;
		double amount = 0;
		// number validation
		if (NumberValidator.numberValidation(quantity) && NumberValidator.numberValidation(serialNo)) {
			Integer amountOfProduct = pricelist.get(serialNo);
			amount = (quantity * amountOfProduct);
			// GST Calculation
			gst = GstCalculation.gstCalculation(amount, 10);
			// Total Amount Calculation
			Totalamount = (Math.round(amount + gst));

		} else {
			System.out.println("Invalid serial no and quantity type");
		}
		return Totalamount;

	}
}
