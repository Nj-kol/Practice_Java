package com.njkol.dynamic.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KadaneAlgorithmTest {

	KadaneAlgorithm prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new KadaneAlgorithm();
	}

	@Test
	void test() {
		int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = prob.maxContiguousSubarraySum(input);
		System.out.println(result);
	}

}
