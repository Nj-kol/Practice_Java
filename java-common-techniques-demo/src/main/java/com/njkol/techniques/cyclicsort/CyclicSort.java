package com.njkol.techniques.cyclicsort;

public class CyclicSort {

	public static void sort(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			// Value at a particular position in the array = index + 1
			// Thus to get the "correct index" of the value we are subtracting 1
			int j = nums[i] - 1;
			// See whether the current value is at its correct location, if not swap
			if (nums[i] != nums[j])
				swap(nums, i, j);
			else
				i++;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
