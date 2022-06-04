package com.njkol.techniques.modifiedbinarysearch;

public class CeilingOfANumber {

	public static int searchCeilingOfANumber(int[] arr, int key) {
		
		if (key > arr[arr.length - 1]) // if the 'key' is bigger than the biggest element
			return -1;

		int start = 0, end = arr.length - 1;
		
		int finalMid = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			finalMid = mid;
			if (key < arr[mid]) {
				end = mid - 1;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else { // found the key
				return mid;
			}
		}
		
		// since the loop is running until 'start <= end', so at the end of the while loop, 'start == end+1'
		// we are not able to find the element in the given array, so the next big number will be arr[start]
		System.out.println("Start is :"+start+" End is : "+end+" Mid is : "+finalMid);
		return start;
	}
}