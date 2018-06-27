package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring {
	
	/*
	 * longestSubstring() method take one string as input and return the longest 
	 * substring in the input string. For this, the first loop is run through the 
	 * whole length of the input string and inside that second loop is run from 
	 * the index of the first loop till the length of the input string. Then the 
	 * characters are taken from the indexes of second loop and put it in a map
	 * and when the size of the map increases the 2 then we break the inner loop
	 * and that substring is added into a ArrayList. Then the the longest substring 
	 * find out from the array list.
	 */
	
    public String longestSubstring(String inputString) {
    	
    	if(inputString.isEmpty()) {
    		return null;
    	}
    	
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	ArrayList<String> subStrings = new ArrayList<String>();
    	
    	for(int i=0;i<inputString.length();i++) {
    		map.clear();
    		String str="";
	    	for(int j=i;j<inputString.length();j++) {
	    		char letter = inputString.charAt(j);
	    		if(map.containsKey(letter)) {
	    			map.put(letter, map.get(letter)+1);
	    		} else {
	    			map.put(letter, 1);
	    		}
	    		if(map.size()>2) {
	    			break;
	    		} else {
	    			str += String.valueOf(letter);
	    		}
	    	}
	    	subStrings.add(str);
    	}
    	
    	String largest = "";
    	for(String s: subStrings) {
    		if(s.length()>largest.length())
    			largest = s;
    	}
    	
    	return largest;
    }
	
}
