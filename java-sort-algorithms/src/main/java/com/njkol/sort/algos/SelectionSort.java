package com.njkol.sort.algos;

public class SelectionSort implements SortAlgorithm {

	@Override
	public int[] doSortIntger(int[] intArray) {

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}

			SortUtils.swap(intArray, largest, lastUnsortedIndex);
		}

		return intArray;
	}
}
