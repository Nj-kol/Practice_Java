package com.njkol.techniques.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubArraySumEqualsKTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSubarraySum() {

		int[] input1 = { 1, 1, 1 };
		int k1 = 2;

		int[] input2 = { 1,2,3};
		int k2 = 2;

		
		int res1 = SubArraySumEqualsK.subarraySum(input1, k1);
		assertEquals(2, res1);
		System.out.println(res1);
	}

}
