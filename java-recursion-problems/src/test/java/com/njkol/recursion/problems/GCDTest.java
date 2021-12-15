package com.njkol.recursion.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GCDTest {

	private GCD g;
	
	@BeforeEach
	void setUp() throws Exception {
		g = new GCD();
	}

	@Test
	void testFindGCD() {
		int expected = 6;
		int actual = g.findGCD(24, 18);
		assertEquals(expected,actual);
	}
}
