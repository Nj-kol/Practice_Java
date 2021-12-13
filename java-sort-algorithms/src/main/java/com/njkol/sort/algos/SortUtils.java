package com.njkol.sort.algos;

public class SortUtils {

	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void printArray(int[] intArray) {
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+ " ");
		}
	}
}
