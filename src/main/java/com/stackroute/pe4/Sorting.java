package com.stackroute.pe4;

import java.util.Arrays;

public class Sorting {

	/*
	 * sortAlphabetically() method take one string as input which is used to 
	 * sort all the words. For this split method is used to split the string 
	 * into array of string on the basis of space between two words. Then till
	 * the length of string array loop is used in which each word in the array 
	 * is splitted into char array and then this character array is sorted using
	 * Arrays.sort() method then this sorted array is converted back to String
	 * and is added to output string.
	 */
	
	public String sortAlphabetically(String str) {
		String sortedInput = "";
		String[] stringArray = str.toLowerCase().split(" ");

		for(int i = 0; i < stringArray.length; i++) {
			char[] charArray = stringArray[i].toCharArray();
			Arrays.sort(charArray);
			sortedInput += String.valueOf(charArray) + " ";
		}
			
		return sortedInput.trim();
	}
		
}
