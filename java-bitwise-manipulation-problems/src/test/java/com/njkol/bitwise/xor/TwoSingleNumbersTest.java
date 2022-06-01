package com.njkol.bitwise.xor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.bitwise.utils.BitwiseUtils;

class TwoSingleNumbersTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	//@Test
	void testFindSingleNumbers() {
		int[] arr = new int[] { 1, 4, 2, 1, 3, 5, 6, 2, 3, 5 };
		int[] result = TwoSingleNumbers.findSingleNumbers(arr);
		System.out.println("Single numbers are: " + result[0] + ", " + result[1]);

		arr = new int[] { 2, 1, 3, 2 };
		result = TwoSingleNumbers.findSingleNumbers(arr);
		System.out.println("Single numbers are: " + result[0] + ", " + result[1]);
	}

	@Test
	void testCountBits() {
		BitwiseUtils.printBinaryString(31);
	}
}
