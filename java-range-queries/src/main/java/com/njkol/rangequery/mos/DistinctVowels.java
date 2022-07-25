package com.njkol.rangequery.mos;

import java.util.Arrays;

public class DistinctVowels {

	public static int BLOCK_SIZE = 0;

	public static boolean isVowel(Character c) {
		final String vowels = "aeiou";
		return vowels.indexOf(c) >= 0;
	}

	static void queryResults(char array[], Query[] queries) {

		int n = array.length;
		int q = queries.length;
		int[] answers = new int[q];

		int i = 0;
		int j = 0;
		int vowelsCount = isVowel(array[i]) ? 1 : 0;

		BLOCK_SIZE = (int) Math.sqrt(n);

		// Index/ Enumerate the queries
		for (int index = 0; index < q; index++) {
			queries[index].setIndex(index);
			queries[index].setBlocksize(BLOCK_SIZE);
		}

		// Sort the queries
		Arrays.parallelSort(queries);
		
		// Printed  new sorted queries
		Arrays.asList(queries).forEach(System.out::println);

		for (Query query : queries) {
			int l = query.left;
			int r = query.right;

			// Left pointer movements
			while (i < l) {
				if (isVowel(array[i]))
					vowelsCount--;
				i++;
			}

			while (i > l) {
				i--;
				if (isVowel(array[i]))
					vowelsCount++;
			}

			// Right pointer movements
			while (j < r) {
				j++;
				if (isVowel(array[j]))
					vowelsCount++;
			}

			while (j > r) {
				if (isVowel(array[j]))
					vowelsCount--;
				j--;
			}

			// Store the answer for the particular query
			int queryIndex = query.getIndex();
			answers[queryIndex] = vowelsCount;
		}

		// Print results
		StringBuilder ans = new StringBuilder();
		for (int answer : answers) {
			ans.append(answer).append("\n");
		}
		System.out.println(ans.toString());
	}
}
