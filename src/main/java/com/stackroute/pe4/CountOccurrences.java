package com.stackroute.pe4;

public class CountOccurrences {
	
	/*
	 * countOccurrences() method take one input String and one String which 
	 * contains only on character as input. Goal is to find the total no of
	 * occurrences of that character in the String. In the given String all 
	 * the character similar to the given character are replaced by empty 
	 * String which means now nothing is there at that point and now the 
	 * length of the new String is calculated which is subtracted from the
	 * length of the original string and the subtraction of length of both the
	 * string gives the no of occurrences of the given character in our input
	 * string.
	 */

	public int countOccurrences(String str, String ch) {
		int count = str.toLowerCase().length() - str.replaceAll(ch.toLowerCase(), "").length();
		return count;
	}
	
}
