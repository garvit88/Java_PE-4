package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReplaceCharactersTest {

	static ReplaceCharacters replaceChar;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		replaceChar = new ReplaceCharacters();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		replaceChar = null;

	}

	@Test
	public void testReplaceChars() {
		assertEquals(
				"testReplaceChars(): testReplaceChars function failed, the value returned by the function is not as expected",
				"faity fry",replaceChar.replaceChars("daily dry"));
		
		assertEquals(
				"testReplaceChars(): testReplaceChars function failed, the value returned by the function is not as expected",
				"1",replaceChar.replaceChars("1"));
		
	}
	
	@Test
	public void testReplaceCharsFailure() {
		assertNotNull(
				"testReplaceCharsFailure(): testReplaceCharsFailure function failed, giving null values",
				replaceChar.replaceChars(""));
	}
}
