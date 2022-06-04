package com.njkol.techniques.modifiedbinarysearch;

/**
 * Given a sorted array of numbers, find if a given number ‘key’ is present in the array. 
 * 
 * Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. 
 * 
 * You should assume that the array can have duplicates.
 * 
 *
 */
public class ModifiedBinarySearch {

	/**
	 * Since, we are reducing the search range by half at every step, this means that the time complexity of our algorithm 
	 * will be O(logN) where ‘N’ is the total elements in the given array.
	 * 
	 * The algorithm runs in constant space O(1)
     *
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int search(int[] arr, int key) {
		int start = 0, end = arr.length - 1;
		boolean isAscending = arr[start] < arr[end];
		while (start <= end) {
			// calculate the middle of the current range
			int mid = start + (end - start) / 2;

			if (key == arr[mid])
				return mid;

			if (isAscending) { // ascending order
				if (key < arr[mid]) {
					end = mid - 1; // the 'key' can be in the first half
				} else { // key > arr[mid]
					start = mid + 1; // the 'key' can be in the second half
				}
			} else { // descending order
				if (key > arr[mid]) {
					end = mid - 1; // the 'key' can be in the first half
				} else { // key < arr[mid]
					start = mid + 1; // the 'key' can be in the second half
				}
			}
		}
		return -1; // element not found
	}

}
