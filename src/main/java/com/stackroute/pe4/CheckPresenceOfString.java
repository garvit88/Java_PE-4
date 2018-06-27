package com.stackroute.pe4;

public class CheckPresenceOfString {
	
	/*
	 * checkPresence() method take one String as an input and it matches the
	 * input string with the pattern ".*Harry.*" and if it contains this pattern
	 * than true is returned otherwise false is returned.
	 */
	
	public boolean checkPresence(String str) {
		if(str.matches(".*Harry.*")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
