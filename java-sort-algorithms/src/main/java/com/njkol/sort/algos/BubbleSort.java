package com.njkol.sort.algos;

public class BubbleSort implements SortAlgorithm {

	@Override
	public int[] doSortIntger(int[] intArray) {

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					SortUtils.swap(intArray, i, i + 1);
				}
			}
		}

		return intArray;
	}
}
