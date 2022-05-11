package com.njkol.techniques.twopointers;

/**
 *  Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.
 *  
 * @author Nilanjan
 *
 */
public class RemoveDuplicateKey {

	public int remove(int[] arr, int key) {
		
		int left = 0; // index of the next element which is not 'key'
		
		for (int right = 0; right < arr.length; right++) {
			
			// Keep shifting unique elements to the left
			if (arr[right] != key) {
				arr[left] = arr[right];
				left++;
			}
		}
		return left;
	}
	
}
