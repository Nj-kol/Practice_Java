package com.njkol.recursion.string.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	private Palindrome p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Palindrome();
	}

	@Test
	void testIsPalindromeTrue() {

		boolean expected = true;
		String input = "malayalam";
		boolean actual = p.isPalindrome(input);
		assertEquals(expected, actual);
	}

	@Test
	void testIsPalindromeFalse() {

		boolean expected = false;
		String input = "bengali";
		boolean actual = p.isPalindrome(input);
		assertEquals(expected, actual);
	}
}
