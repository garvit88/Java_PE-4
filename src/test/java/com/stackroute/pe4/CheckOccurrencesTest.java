package com.stackroute.pe4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckOccurrencesTest {

	static CheckOccurrences checkingOccurrences;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		checkingOccurrences = new CheckOccurrences();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		checkingOccurrences = null;

	}

	@Test
	public void testFindOccurrences() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("4-6");
		testList.add("10-12");
		testList.add("27-29");
		assertEquals(
				"testFindOccurrences(): testFindOccurrences function failed, the value returned by the function is not as expected",
				testList,checkingOccurrences.findOccurrences("She sells seashells by the seashore", "se"));
		
	}
	
	@Test
	public void testFindOccurrencesFailure() {
		assertNotNull(
				"testFindOccurrencesFailure(): testFindOccurrencesFailure function failed, giving null values",
				checkingOccurrences.findOccurrences("She sells seashells by the seashore", "1"));
	}
}
