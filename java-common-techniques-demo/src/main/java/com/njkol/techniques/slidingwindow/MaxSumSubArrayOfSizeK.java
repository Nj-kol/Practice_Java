package com.njkol.techniques.slidingwindow;

/**
 * Maximum Sum Subarray of Size K
 * 
 * References -
 * https://gist.github.com/kanahaiya/bdd3e87b06b7006ac7dc6d0149a8659a
 *
 */
public class MaxSumSubArrayOfSizeK {

	// brute force solution
	// time complexity - O(n*k)
	public int getMaxSumSubArrayOfSizeKM1(int[] A, int k) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i <= A.length - k; i++) {
			int windowSum = 0;
			for (int j = i; j < i + k; j++) {
				windowSum += A[j];
			}
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	// optimized solution using sliding window technique
	// time complexity - O(n)
	public int getMaxSumSubArrayOfSizeKM2(int[] A, int k) {

		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;

		// Calculate the first window which acts as a seed
		for (int i = 0; i < k; i++) {
			windowSum += A[i];
		}

		maxSum = Math.max(maxSum, windowSum);

		for (int windowEndIndex = k; windowEndIndex < A.length; windowEndIndex++) {
			windowSum += A[windowEndIndex] - A[windowEndIndex - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	/**
	 * Alternate approach. This is the best approach IMHO
	 * 
	 * @param k
	 * @param arr
	 * @return
	 */
	public  int findMaxSumSubArray(int k, int[] arr) {
		
		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int windowStart = 0;
		
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd]; // add the next element
			// slide the window, we don't need to slide if we've not hit the required window size of 'k'
			if (windowEnd >= k - 1) {
				maxSum = Math.max(maxSum, windowSum);
				windowSum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}

		return maxSum;
	}
}
