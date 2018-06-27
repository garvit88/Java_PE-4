package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckOccurrences {

	/*
	 * findOccurrences() method take one input string and the key to be
	 * searched in the given string. key is passed to the Pattern.compile()
	 * and input string is check that if it contain that key and if that is 
	 * found in input string than we add it's starting position + "-" + 
	 * end position into an array list.
	 */
	
	public ArrayList<String> findOccurrences(String input, String key) {
		
		Pattern pattern = Pattern.compile(key);
        Matcher str = pattern.matcher(input);
        ArrayList<String> occurrences = new ArrayList<String>();
        while (str.find()){
        	occurrences.add(str.start()+"-"+str.end());
        }

        return occurrences;
	}

}
