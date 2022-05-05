package com.njkol.arrays.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	TwoSum sa;
	
	@BeforeEach
	void setUp() throws Exception {
		 sa = new TwoSum();
	}

	@Test
	void test() {

		int[] nums = { 2, 7, 11, 15};
		int target = 9;
		int sol[] = sa.twoSumOptimal(nums, target);
		System.out.println("["+sol[0]+","+sol[1]+"]");
	}

}
