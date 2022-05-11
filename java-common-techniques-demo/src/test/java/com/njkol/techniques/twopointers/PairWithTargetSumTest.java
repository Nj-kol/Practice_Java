package com.njkol.techniques.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PairWithTargetSumTest {

	PairWithTargetSum prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new PairWithTargetSum();
	}

	@Test
	void testCase1() {
		int[] arr = { 1, 2, 3, 4, 6 };
		int targetSum = 6;
		int[] sol = prob.search(arr, targetSum);
		System.out.println(Arrays.toString(sol));
	}

}
