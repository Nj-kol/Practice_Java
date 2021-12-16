package com.njkol.recursion.string.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountVowelsTest {

	private CountVowels cv;

	@BeforeEach
	void setUp() throws Exception {
		cv = new CountVowels();
	}

	@Test
	void testTotalVowels() {
		int expected = 6;
		String input = "thisisrecursion";
		int actual = cv.totalVowels(input, input.length(), 0);
		assertEquals(expected,actual);
	}

}
