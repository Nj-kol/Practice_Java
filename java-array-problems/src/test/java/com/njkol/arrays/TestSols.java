package com.njkol.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSols {

	@Test
	void testTwoSums() {

		int[] nums = { 2, 7, 11, 15};
		int target = 9;

		TwoSum sa = new TwoSum();
		int sol[] = sa.twoSumOptimal(nums, target);
		System.out.println("["+sol[0]+","+sol[1]+"]");
	}
}
