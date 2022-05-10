package com.njkol.techniques.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinSizeSubArraySumTest {

	int result;

	@Test
	void testCase1() {
		result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
		System.out.println("Smallest subarray length: " + result);
	}

	// @Test
	void testCase2() {
		result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
		System.out.println("Smallest subarray length: " + result);
	}

	//@Test
	void testCase3() {
		result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
		System.out.println("Smallest subarray length: " + result);
	}
}
