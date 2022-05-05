package com.njkol.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[] = { 3, 4 };
		int arr[] = { 1, 2, 3 };

		System.out.println(peakElement(arr,arr.length));
	}

	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	static public int peakElement(int[] arr, int n) {

		int x = 0;
		boolean isLeftSmaller = false;
		boolean isRightSmaller = false;

		for (int i = 0; i < n; i++) {

			int b = arr[i];
		
			if (i != 0 ) {
				int a = arr[i - 1];
				if(b > a)
				isLeftSmaller = true;
			}
			if (i + 1 < n) {
				int c = arr[i + 1];
				if(b > c)
				isRightSmaller = true;
			}
			if (isLeftSmaller && isRightSmaller) {
				x = i;
			}
		}

		return x;
	}
}
