package com.njkol.techniques.twopointers;

import java.util.Arrays;

/**
 * Given an array of sorted numbers, separate all duplicates from it in-place.
 * 
 * You should not use any extra space; move all duplicates at the end of the
 * array and after moving return the length of the subarray that has no
 * duplicate in it.
 * 
 * https://www.youtube.com/watch?v=zIHe2V5Py3U
 * 
 * https://www.youtube.com/watch?v=DEJAZBq0FDA
 *
 * @author Nilanjan
 *
 */
public class RemoveDuplicates {

	/**
	 * In a sorted array if there is any duplicates - duplicate has to be the next
	 * element - the first number in the array is always unique, so we never want to
	 * place the next number that is unique at the zeroeth index, thus we want to
	 * always start the evaluation from index 1, because if the array is of size
	 * one, it will work properly
	 * 
	 * @param arr
	 * @return
	 */
	public int remove(int[] arr) {

		int left = 1; // index of the next non-duplicate element

		for (int right = 0; right < arr.length - 1; right++) {
			
			  // If the next element is unique, shift it to the position of the last unique element seem
			 // which is captured by the location of the left pointer
		      if (arr[right] != arr[right+1]) {
		        arr[left] = arr[right+1];
		        left++;
		      }
		}    

		System.out.println(Arrays.toString(arr));
		return left;
	}
	
}
