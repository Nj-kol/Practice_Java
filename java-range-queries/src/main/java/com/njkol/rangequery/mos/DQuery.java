package com.njkol.rangequery.mos;

import java.util.Arrays;

public class DQuery {


	public static int BLOCK_SIZE = 0;
	
	static void queryResults(int array[], Query[] queries) {
		
		int n = array.length;
		int q = queries.length;
		int[] answers = new int[q];

		int i = 0;
		int j = 0;
		int[] frequencies = new int[1000001];

		BLOCK_SIZE = (int) Math.sqrt(n);

		// Index/ Enumerate the queries
		for (int index = 0; index < q; index++) {
			queries[index].setIndex(index);
			queries[index].setBlocksize(BLOCK_SIZE);
		}
		
		Arrays.parallelSort(queries);
		
		// Printed  new sorted queries
		Arrays.asList(queries).forEach(System.out::println);
		
		frequencies[array[i]]++;
		int count = 1;

		for (Query query : queries) {

			int l = query.left;
			int r = query.right;

			// Left pointer movements
			while (i < l) {
				frequencies[array[i]]--;
				if (frequencies[array[i]] == 0)
					count--;
				i++;
			}

			while (i > l) {
				i--;
				frequencies[array[i]]++;
				if (frequencies[array[i]] == 1)
					count++;
			}

			// Right pointer movements
			while (j < r) {
				j++;
				frequencies[array[j]]++;
				if (frequencies[array[j]] == 1)
					count++;
			}

			while (j > r) {
				frequencies[array[j]]--;
				if (frequencies[array[j]] == 0)
					count--;
				j--;
			}

			// Store the answer for the particular query
			int queryIndex = query.getIndex();
			answers[queryIndex] = count;
		}

		StringBuilder ans = new StringBuilder();
		for (int answer : answers) {
			ans.append(answer).append("\n");
		}

		System.out.println(ans.toString());
	}
}
