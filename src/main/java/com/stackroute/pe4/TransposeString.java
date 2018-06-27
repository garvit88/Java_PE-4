package com.stackroute.pe4;

public class TransposeString {

	/*
	 * transpose() method take one input string and it is used to transpose each
	 * word in the given string. For this firstly string is splitted into array of 
	 * string on the basis of space between characters. Then the loop is run till
	 * the length of the string array in which each word is reversed using reverse()
	 * function of StringBuilder class then this reversed string is added into a 
	 * output string. 
	 */
	
	public String transpose(String str) {
		String[] stringArray = str.split(" ");
		
		String transposedString = "";
		for(int i = 0; i < stringArray.length; i++) {
			StringBuilder builderString = new StringBuilder(stringArray[i]);
			transposedString += builderString.reverse() + " ";
		}
		
		return transposedString.trim();
	}

}
