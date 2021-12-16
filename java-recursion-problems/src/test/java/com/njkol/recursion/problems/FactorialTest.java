package com.njkol.recursion.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.recursion.number.problems.Factorial;

/**
 * Test for factorial
 * 
 * @author Nilanjan Sarkar
 *
 */
class FactorialTest {

	private Factorial fc;
	
	@BeforeEach
	void setUp() throws Exception {
		fc = new Factorial();
	}

	@Test
	void testRecursiveFactorial() {
		int num = 3;
		int expected = 6;
		int actual = fc.recursiveFactorial(num);
		assertEquals(expected,actual);
	}

	@Test
	void testIterativeFactorial() {
		int num = 3;
		int expected = 6;
		int actual = fc.iterativeFactorial(num);
		assertEquals(expected,actual);
	}
}
