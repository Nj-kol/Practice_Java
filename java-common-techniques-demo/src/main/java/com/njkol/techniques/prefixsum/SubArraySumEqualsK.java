package com.njkol.techniques.prefixsum;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 
 * https://www.youtube.com/watch?v=20v8zSo2v18
 * 
 * https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
 * 
 * Given an array of integers nums and an integer k, return the total number of
 * subarrays whose sum equals to k.
 *
 */
public class SubArraySumEqualsK {

	public static int subarraySum(int[] arr, int k) {

		int n = arr.length;

		// HashMap to store number of subarrays starting from index zero having particular value of sum.
		HashMap<Integer, Integer> prevSum = new HashMap<>();
		prevSum.put(0, 1);
		int res = 0;

		// Sum of elements so far.
		int currSum = 0;

		for (int i = 0; i < n; i++) {

			// Add current element to sum so far.
			currSum += arr[i];

			// calculate the sum that have to be removed so that we can get the desired sum
			int removeSum = currSum - k;

			// get count of occurrences of that sum that have to removed and add it to res
			// value
			if (prevSum.containsKey(removeSum)) {
				res += prevSum.get(removeSum);
			}

			// Add currsum value to count of different values of sum.
			prevSum.put(currSum, prevSum.getOrDefault(currSum, 0) + 1);
		}

		return res;
	}
}
