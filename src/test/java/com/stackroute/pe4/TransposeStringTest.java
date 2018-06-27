package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransposeStringTest {

	static TransposeString transposeString;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		transposeString = new TransposeString();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		transposeString = null;

	}

	@Test
	public void testTranspose() {
		assertEquals(
				"testTranspose(): testTranspose function failed, the value returned by the function is not as expected",
				"a kciuq nworb xof spmuj revo eht yzal god",transposeString.transpose("a quick brown fox jumps over the lazy dog"));
		
		assertEquals(
				"testTranspose(): testTranspose function failed, the value returned by the function is not as expected",
				"21",transposeString.transpose("12"));
		
	}
	
	@Test
	public void testTransposeFailure() {
		assertNotNull(
				"testTransposeFailure(): testTransposeFailure function failed, giving null values",
				transposeString.transpose(" "));
	}

}
