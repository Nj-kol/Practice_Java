package com.njkol.arrays.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * https://www.youtube.com/watch?v=BoHO04xVeU0
 * https://www.youtube.com/watch?v=TcsYEnMrnFo
 * 
 * @author Nilanjan
 *
 */
class TwoSum {

	public int[] twoSumBruteForce(int[] nums, int target) {

		System.out.println(nums.length);

		int[] sol = {};
		for (int i = 0; i <= nums.length; i++) {

			for (int j = i + 1; j <= i + 1; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					sol = new int[] { i, j };
					return sol;
				}
			}
		}
		return sol;
	}


	public int[] twoSumOptimal(int[] nums, int target) {

		Map<Integer, Integer> complementMap = new HashMap<>();

		for (int i = 0; i <= nums.length; i++) {
          
			int complement = target - nums[i];
			
			if(complementMap.containsKey(complement)) {
				return new int[] { complementMap.get(complement), i };
			}
	
			complementMap.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No match found");
	}
}