package com.njkol.strings.basic;

/**
 * https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
 * 
 * @author Nilanjan
 *
 */
public class Palindrome {

	// Method
	// Returning true if string is palindrome
	boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch no need to compare further
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	boolean isPalindromeRecursive(String str, int l, int r) {

		char[] stAsChar = str.toCharArray();

		if (l >= r) {
			return true;
		}

		if (stAsChar[l] != stAsChar[r]) {
			return false;
		}

		return isPalindromeRecursive(str, l + 1, r - 1);
	}

}
