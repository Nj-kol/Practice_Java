package com.njkol.techniques.subsets;

import java.util.List;
import java.util.ArrayList;

public class Subsets {

	public static List<List<Integer>> findSubsets(int[] nums) {
		
		List<List<Integer>> subsets = new ArrayList<>();
		// start by adding the empty subset
		subsets.add(new ArrayList<>());
		
		for (int currentNumber : nums) {
			// we will take all existing subsets and insert the current number in them to
			// create new subsets
			int n = subsets.size();
			for (int i = 0; i < n; i++) {
				// create a new subset from the existing subset and insert the current element to it
				List<Integer> set = new ArrayList<>(subsets.get(i));
				set.add(currentNumber);
				subsets.add(set);
			}
		}
		return subsets;
	}

}
