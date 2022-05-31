/**
 * 
 */
package com.njkol.bitwise.misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Nilanjan
 *
 */
class AddNumbersTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBothPositive() {
		int sum =  AddNumbers.add(4, 3);
		System.out.println(sum);
		assertEquals(7, sum);
	}
	
	@Test
	void testOnePositiveOneNegetive() {
		int sum =  AddNumbers.add(-7, 3);
		System.out.println(sum);
		assertEquals(-4, sum);
	}
	
	@Test
	void testBothNegetive() {
		int sum =  AddNumbers.add(-7, -3);
		System.out.println(sum);
		assertEquals(-10, sum);
	}

}
