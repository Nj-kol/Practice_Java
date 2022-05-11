package com.njkol.techniques.misc.delta;

/**
 * Given an array of numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * 
 * This is a variation of a very popular problem - Pair with target sum. However, in this case the array is unsorted
 * 
 * @author Nilanjan
 *
 */

import java.util.HashMap;

public class PairWithTargetSum {

	public int[] search(int[] arr, int targetSum) {

		HashMap<Integer, Integer> deltaMap = new HashMap<>(); // to store numbers and their indices

		for (int i = 0; i <= arr.length; i++) {

			int delta = targetSum - arr[i];

			if (deltaMap.containsKey(delta)) {
				int indexOfDelta = deltaMap.get(delta);
				return new int[] { indexOfDelta, i };
			} else {
				deltaMap.put(arr[i], i); // put the number and its index in the map
			}
		}

		return new int[] { -1, -1 };
	}
}
