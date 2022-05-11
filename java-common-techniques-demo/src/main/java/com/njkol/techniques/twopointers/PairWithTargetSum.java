package com.njkol.techniques.twopointers;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * 
 * @author Nilanjan
 *
 */
public class PairWithTargetSum {

	public int[] search(int[] arr, int targetSum) {

		int left = 0;
		int right = arr.length - 1;

		int currSum = 0;

		while (left <= right) {
			currSum = arr[left] + arr[right];
			if (currSum == targetSum) {
				return new int[] { left, right };
			} else if (currSum > targetSum) {
				right = right - 1;
			} else if (currSum < targetSum) {
				left = left + 1;
			}
		}
		return new int[] { -1, -1 };
	}
}
