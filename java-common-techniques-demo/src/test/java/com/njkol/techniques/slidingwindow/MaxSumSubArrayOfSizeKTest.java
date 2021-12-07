package com.njkol.techniques.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxSumSubArrayOfSizeKTest {

	private MaxSumSubArrayOfSizeK algo;

	@BeforeEach
	void setUp() throws Exception {
		algo = new MaxSumSubArrayOfSizeK();
	}

	@Test
	void testBruteForce() {
		int[] A = { 1, 9, -1, -2, 7, 3, -1, 2 };
		int k = 4;
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		int res= algo.getMaxSumSubArrayOfSizeKM1(A, k);
		System.out.println("brute for solution O(n*k) result=" + res);
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for brute for solution :" + executionTime + " ns \n");
		assertEquals(13,res);
	}

	@Test
	void testSlidingWindow() {
		int[] A = { 1, 9, -1, -2, 7, 3, -1, 2 };
		int k = 4;
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		int res=  algo.getMaxSumSubArrayOfSizeKM2(A, k);
		System.out.println("sliding window technique O(n) result=" + res);
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for optimized solution :" + executionTime + " ns \n");
		assertEquals(13,res);
	}
}
