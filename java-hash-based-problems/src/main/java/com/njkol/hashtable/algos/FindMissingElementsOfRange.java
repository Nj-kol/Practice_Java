package com.njkol.hashtable.algos;

/**
 * https://www.geeksforgeeks.org/find-missing-elements-of-a-range/
 * 
 *
 */

import java.util.Arrays;
import java.util.HashSet;


public class FindMissingElementsOfRange {

	// Print all elements of range [low, high] that
	// are not present in arr[0..n-1]
	static void printMissing(int ar[], int low, int high) {
		
		HashSet<Integer> hs = new HashSet<>();

		// Insert all elements of arr[] in set
		for (int i = 0; i < ar.length; i++)
			hs.add(ar[i]);

		// Traverse through the range an print all
		// missing elements
		for (int i = low; i <= high; i++) {
			if (!hs.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
