package com.njkol.recursion.string.problems;

public class Palindrome {

	public boolean isPalindrome(String text) {
		
		if (text.length() == 0 || text.length() == 1) {
			return true;
		} else {
			if (text.charAt(0) == text.charAt(text.length() - 1)) {
				return isPalindrome(text.substring(1, text.length() - 1));
			}
		}
		return false;
	}
}
