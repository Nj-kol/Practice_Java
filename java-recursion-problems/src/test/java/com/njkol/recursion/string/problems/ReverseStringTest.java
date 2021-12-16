package com.njkol.recursion.string.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	private ReverseString rs;
	
	@BeforeEach
	void setUp() throws Exception {
		rs = new ReverseString();
	}

	@Test
	void testReverseString() {
		String expected = "najnaliN";
		String input = "Nilanjan";
		String actual = rs.reverseString(input);
		assertEquals(expected, actual);
	}

}