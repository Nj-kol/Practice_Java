package com.njkol.bitwise.and;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenOddTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEven() {
		boolean exp = EvenOdd.isEven(12);
		System.out.println(exp);
		assertEquals(true, exp);
	}
	
	@Test
	void testodd() {
		boolean exp =  EvenOdd.isEven(7);
		System.out.println(exp);
		assertEquals(false, exp);
	}
}
