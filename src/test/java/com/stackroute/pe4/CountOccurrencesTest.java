package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountOccurrencesTest {

	static CountOccurrences countOccurrences;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		countOccurrences = new CountOccurrences();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		countOccurrences = null;

	}

	@Test
	public void testCountOccurrences() {
		assertEquals(
				"testCountOccurrences(): testCountOccurrences function failed, the value returned by the function is not as expected",
				7,countOccurrences.countOccurrences("She sells seashells by the seashore", "s"));
		
		assertEquals(
				"testCountOccurrences(): testCountOccurrences function failed, the value returned by the function is not as expected",
				10,countOccurrences.countOccurrences("Java is java again java again", "a"));
		
	}
	
	@Test
	public void testCountOccurrencesFailure() {
		assertEquals(
				"testCountOccurrencesFailure(): testCountOccurrencesFailure function failed, it is considering case senstive cases",
				7,countOccurrences.countOccurrences("She sells seashells by the seashore", "S"));
		
		assertEquals(
				"testCountOccurrences(): testCountOccurrences function failed, there are values returned by the function for the empty String",
				0,countOccurrences.countOccurrences("Java is java again java again", ""));
	}
	
	@Test
	public void testCountOccurrencesNotNull() {
		assertNotNull(
				"testCountOccurrencesNotNull(): testCountOccurrencesNotNull function failed, giving null values",
				countOccurrences.countOccurrences("Java is java again java again", "a"));
	}

}
