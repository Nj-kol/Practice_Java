package com.njkol.strings.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new Palindrome();
	}

	@Test
	void testIterative() {
		// String input = "test";
		String input = "malayalam";
		System.out.println(prob.isPalindrome(input));
	}

	@Test
	void testRecurive() {
		// String input = "test";
		String input = "malayalam";
		System.out.println(prob.isPalindromeRecursive(input, 0, input.length() - 1));
	}

}
