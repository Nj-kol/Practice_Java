package com.njkol.techniques.prefixsum;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * 
 * @author Nilanjan
 *
 */
public class SubArraySumEqualsK {

	public static int subarraySum(int[] nums, int k) {

		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}


		System.out.println(Arrays.toString(nums));  
		return k;
	}
}
