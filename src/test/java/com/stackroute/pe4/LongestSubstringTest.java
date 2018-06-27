package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LongestSubstringTest {

	static LongestSubstring longestSubstring;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		longestSubstring = new LongestSubstring();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		longestSubstring = null;

	}

	@Test
	public void testLongestSubstring() {
		assertEquals(
				"testLongestSubstring(): testLongestSubstring function failed, the value returned by the function is not as expected",
				"abababaaaabababa",longestSubstring.longestSubstring("aaaaabbccabababaaaabababacbabccbcbcb"));
		assertEquals(
				"testLongestSubstring(): testLongestSubstring function failed, the value returned by the function is not as expected",
				"a",longestSubstring.longestSubstring("a"));
	}
	
	@Test
	public void testLongestSubstringFailure() {
		assertNull(
				"testLongestSubstringFailure(): testLongestSubstringFailure function failed, not giving null values",
				longestSubstring.longestSubstring(""));
	}

}
