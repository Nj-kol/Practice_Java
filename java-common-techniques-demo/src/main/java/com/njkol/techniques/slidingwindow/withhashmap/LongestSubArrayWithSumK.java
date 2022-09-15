package com.njkol.techniques.slidingwindow.withhashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest sub-array having sum k :
 * 
 * - https://www.geeksforgeeks.org/longest-sub-array-sum-k/
 * 
 *
 */
public class LongestSubArrayWithSumK {

	// function to find the length of longest sub-array having sum k
	public static int lenOfLongSubarr(int[] arr, int n, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
	
		 // traverse the given array
        for (int i = 0; i < n; i++) {
            
             // accumulate sum
             sum += arr[i];
            
             // when subarray starts from index '0'
             if (sum == k)
                 maxLen = i + 1;

             // make an entry for 'sum' if it is
             // not present in 'map'
             if (!map.containsKey(sum)) {
                 map.put(sum, i);
             }

             // check if 'sum-k' is present in 'map'
             // or not
             if (map.containsKey(sum - k)) {
                  
                 // update maxLength
                 if (maxLen < (i - map.get(sum - k))) {
                	 maxLen = i - map.get(sum - k);
                 }
             }
        }
		
		return maxLen;
	}
}
