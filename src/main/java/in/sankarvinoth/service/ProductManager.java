package in.sankarvinoth.service;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ProductManager {

	static public TreeMap<Integer, String> productsAvailable = new TreeMap<Integer, String>();

	static {
		// List of products to be displayed
		productsAvailable.put(-1,"");
		productsAvailable.put(0,"Washing Machine");
		productsAvailable.put(8,"Water Purifier");
		productsAvailable.put(9,"Television");
		productsAvailable.put(5,"vacuum Cleaner");
		productsAvailable.put(3,"Refrigerator");
		productsAvailable.put(4,"Induction Stove");
		productsAvailable.put(6,"Camera");
		productsAvailable.put(7,"Microwave Oven");
		productsAvailable.put(10,"Mixer Grinder");

	}

	/**
	 * method to Display all the available products with its serial number
	 * 
	 */
	public static void display() {
		System.out.println("\t ****************************");
		System.out.println("\t List of Our Products");
		System.out.println("\t ****************************");
		Set<Integer> keySet = productsAvailable.keySet(); // getting values with respective to keys
		for (Integer Key : keySet) {
			String value = productsAvailable.get(Key); // Logic for printing keys
			System.out.println(value);
		}
	}
	
	
	public static void addProducts(Integer serialNo,String productName) {
		productsAvailable.put(serialNo,productName);
	}
}
