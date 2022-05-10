package com.njkol.techniques.slidingwindow;

/**
 * Smallest Subarray With a Greater Sum :
 * 
 * Given an array of positive numbers and a positive number ‘S,’ find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’.
 * 
 * Return 0 if no such subarray exists.
 * 
 * @author Nilanjan
 *
 */
public class MinSizeSubArraySum {

	public static int findMinSubArray(int S, int[] arr) {

		int windowSum = 0;
		int minLength = Integer.MAX_VALUE;
		int windowStart = 0;
		
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd]; // add the next element
			// shrink the window as small as possible until the 'windowSum' is smaller than 'S'
			while (windowSum >= S) {
				System.out.println(minLength+ " : " + (windowEnd - windowStart + 1) );
				minLength = Math.min(minLength, windowEnd - windowStart + 1);
				windowSum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}

		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}
