package com.njkol.sort.algos;

/**
 * A Shell Sort implementation with gap value equal to middle of the array
 * 
 * @author Nilanjan Sarkar
 *
 */
public class ShellSort implements SortAlgorithm {

	@Override
	public int[] doSortIntger(int[] intArray) {


		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < intArray.length; i++) {
				
				int newElement = intArray[i];

				int j = i;

				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}

				intArray[j] = newElement;

			}
		}

		return intArray;
	}
}
