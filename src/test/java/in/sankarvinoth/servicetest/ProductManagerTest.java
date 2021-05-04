package in.sankarvinoth.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.service.ProductManager;


class ProductManagerTest {

	@Test
	/**
	 *   method to display the List of products available
	 */
	void testCase1() {
		// calling the display method
		ProductManager.display();
	}
	
	@Test
	/**
	 *   method to add new products to list
	 */
	void testCase2() {
		// calling the display method
		ProductManager.addProducts(12,"Wi-fi Module");
		ProductManager.addProducts(11,"Hair Dryer");
		
	}
	
	@Test
	/**
	 *  method to display the List of products available
	 */
	void testCase3() {
		// calling the display method
		ProductManager.display();
		
	}
}
