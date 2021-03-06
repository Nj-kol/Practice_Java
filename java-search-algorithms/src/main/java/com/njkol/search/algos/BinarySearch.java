package com.njkol.search.algos;

public class BinarySearch implements SearchAlgorithm {

	private String mode;

	public BinarySearch(String mode) {
		this.mode = mode;
	}

	@Override
	public int doIntegerSearch(int[] input, int value) {

		if ("I".equalsIgnoreCase(mode)) {
			return iterativeBinarySearch(input, value);
		} else {
			return recursiveBinarySearch(input, value);
		}
	}

	public static int iterativeBinarySearch(int[] input, int value) {

		int start = 0;
		int end = input.length;

		while (start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("midpoint = " + midpoint);
			if (input[midpoint] == value) {
				return midpoint;
			} else if (input[midpoint] < value) {
				start = midpoint + 1;
			} else {
				end = midpoint;
			}
		}
		return -1;
	}

	public static int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input, 0, input.length, value);
	}

	public static int recursiveBinarySearch(int[] input, int start, int end, int value) {

		if (start >= end) {
			return -1;
		}

		int midpoint = (start + end) / 2;
		System.out.println("midpoint = " + midpoint);

		if (input[midpoint] == value) {
			return midpoint;
		} else if (input[midpoint] < value) {
			return recursiveBinarySearch(input, midpoint + 1, end, value);
		} else {
			return recursiveBinarySearch(input, start, midpoint, value);
		}
	}
}
