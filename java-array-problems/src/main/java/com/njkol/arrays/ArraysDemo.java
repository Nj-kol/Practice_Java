package com.njkol.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[] = { 3, 4 };
		int arr[] = { 3, 1, 5, 4, 2, 8 };

		scratchMethod(arr);
	}

	static public void scratchMethod(int[] arr) {

		System.out.println("Length of array : " + arr.length);

		int start = 0;
		int end = arr.length;
		int midpoint = start + (end - start) / 2;
		// int midpoint = (start + end) / 2;
		System.out.println("Midpoint of array : " + midpoint);
		System.out.println("Element at Midpoint of array : " + arr[midpoint]);
	}
}
