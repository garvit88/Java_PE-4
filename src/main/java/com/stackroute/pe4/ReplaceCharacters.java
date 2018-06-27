package com.stackroute.pe4;

public class ReplaceCharacters {
	
	/*
	 * replaceChars() take one input string in which all the all the 
	 * d is to be replaced by f and all the l to be replaced by t.
	 * replaceAll() method is used first to replace all the d with f
	 * and then again replaceAll() method is used to replace all l with t.
	 */
	
	public String replaceChars(String str) {
		String s = str.replaceAll("d", "f").replaceAll("l", "t");
		return s;
	}
	
}
