package com.njkol.techniques.slidingwindow.withhashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubArrayWithSumKTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLenOfLongSubarr() {
		int k = 15;
		int arr[] = { 10, 5, 2, 7, 1, 9 };
		int answer = LongestSubArrayWithSumK.lenOfLongSubarr(arr, arr.length, k);
		System.out.println(answer);
	}

}
