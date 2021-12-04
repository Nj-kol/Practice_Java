package com.njkol.search.algos;

public class LinearSearch implements SearchAlgorithm {

	public int doIntegerSearch(int[] input, int value) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
