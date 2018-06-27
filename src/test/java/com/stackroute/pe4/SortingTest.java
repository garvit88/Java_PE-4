package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortingTest {

	static Sorting sorting;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		sorting = new Sorting();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		sorting = null;

	}

	@Test
	public void testSortAlphabetically() {
		assertEquals(
				"testSortAlphabetically(): testSortAlphabetically function failed, the value returned by the function is not as expected",
				"eehrt is eghimnost",sorting.sortAlphabetically("There is something"));
		
		assertEquals(
				"testSortAlphabetically(): testSortAlphabetically function failed, the value returned by the function is not as expected",
				"12",sorting.sortAlphabetically("12"));
		
	}
	
	@Test
	public void testSortAlphabeticallyFailure() {
		assertNotNull(
				"testSortAlphabeticallyFailure(): testSortAlphabeticallyFailure function failed, giving null values",
				sorting.sortAlphabetically(" "));
	}

}
