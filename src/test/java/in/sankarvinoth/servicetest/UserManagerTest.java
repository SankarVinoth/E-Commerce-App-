package in.sankarvinoth.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.sankarvinoth.service.UserManager;

class UserManagerTest {

	@Test
	/**
	 * testcase 1: by giving "registered User" as user type and giving correct
	 * credentials
	 */
	void testCase1() {
		String userType = "registered user";
		boolean isValid = UserManager.registeredUser("vibin", "vibin12", userType);
		assertTrue(isValid);
	}

	@Test
	/**
	 * testcase 2: by giving "registered User" as user type and giving invalid
	 * password type
	 */
	void testCase2() {
		String userType = "registered user";
		boolean isValid = UserManager.registeredUser("vibin", "vibin1245", userType);
		assertFalse(isValid);
	}

	@Test
	/**
	 * testcase 3: by giving "new User" as user type and giving already exists
	 * credentials
	 */
	void testCase3() {
		String userType = "new user";
		boolean isValid = UserManager.newUserRegistration("vibin", "vibin12", userType);
		assertFalse(isValid);
	}

	@Test
	/**
	 * testcase 4: by giving "new User" as user type and giving new username and
	 * password
	 */
	void testCase4() {

		// System.out.println(" you are a Registered User/new user");
		String userType = "new user";

		boolean isValid = UserManager.newUserRegistration("tesla", "vinoth@25", userType);
		assertTrue(isValid);
	}

	@Test
	/**
	 * testcase 5: by giving "new user" as user type and giving new user credentials
	 */
	void testCase5() {

		// System.out.println(" you are a Registered User/new user");
		String userType = "new user";
		boolean isValid = UserManager.newUserRegistration("vijay", "vijay123", userType);
		assertTrue(isValid);

	}
}
