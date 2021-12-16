package com.njkol.recursion.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.recursion.number.problems.PrimeNumber;

class PrimeNumberTest {
	
	private PrimeNumber pn;

	@BeforeEach
	void setUp() throws Exception {
		pn = new PrimeNumber();
	}

	@Test
	void testIsPrime() {
	    int input = 13;
        boolean actual = pn.isPrime(input, input/2);
		boolean expected = true;
		assertEquals(expected,actual);
	}
}
