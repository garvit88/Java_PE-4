package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckPresenceOfStringTest {


	static CheckPresenceOfString checkPresenceOfString;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		checkPresenceOfString = new CheckPresenceOfString();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		checkPresenceOfString = null;

	}

	@Test
	public void testCheckPresence() {
		assertTrue(
				"testCheckPresence(): testCheckPresence function failed, the value returned by the function is not as expected",
				checkPresenceOfString.checkPresence("This is Harry"));
		
		assertFalse(
				"testCheckPresence(): testCheckPresence function failed, the value returned by the function is not as expected",
				checkPresenceOfString.checkPresence("This is Henry."));
		
	}
	
	@Test
	public void testCheckPresenceFailure() {
		assertNotNull(
				"testCheckPresenceFailure(): testCheckPresenceFailure function failed, giving null values",
				checkPresenceOfString.checkPresence("This is Henry"));
	}

}
