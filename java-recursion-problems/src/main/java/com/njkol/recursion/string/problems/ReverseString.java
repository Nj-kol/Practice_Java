package com.njkol.recursion.string.problems;

public class ReverseString {

	public String reverseString(String myStr) {

		// Base case
		if (myStr.isEmpty()) {
			return myStr;
		}

		// Recursive case
		else {
			return reverseString(myStr.substring(1)) + myStr.charAt(0);
		}
	}
}
