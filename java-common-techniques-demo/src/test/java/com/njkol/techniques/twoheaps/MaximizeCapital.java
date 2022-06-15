package com.njkol.techniques.twoheaps;

import java.util.PriorityQueue;

/**
 * 
 * https://www.educative.io/courses/grokking-the-coding-interview/B6x69OLX4jY
 * 
 * https://www.youtube.com/watch?v=e7ZYZmGImSE
 */
public class MaximizeCapital {

	public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {

		PriorityQueue<Integer> minCapitalHeap = new PriorityQueue<>((i1, i2) -> capital[i1] - capital[i2]);
		PriorityQueue<Integer> maxProfitHeap = new PriorityQueue<>((i1, i2) -> profits[i2] - profits[i1]);

		// Add all project capitals to a min-heap, so that we can select a project with
		// the smallest capital requirement.( We are adding index an not the actual value )
		for (int i = 0; i < capital.length; i++)
			minCapitalHeap.offer(i);

		// let's try to find a total of 'numberOfProjects' best projects
		int availableCapital = initialCapital;

		// Repeat the following steps for the required number of projects.
		for (int i = 0; i < numberOfProjects; i++) {
			// Go through the top projects of the min-heap and filter the projects that can
			// be completed within our available capital.
			// Insert the profits of all these projects into a max-heap, so that we can
			// choose a project with the maximum
			// profit.
			while (!minCapitalHeap.isEmpty() && capital[minCapitalHeap.peek()] <= availableCapital) {
				maxProfitHeap.add(minCapitalHeap.poll());
			}

			// terminate if we are not able to find any project that can be completed within
			// the available capital
			if (maxProfitHeap.isEmpty())
				break;

			// Finally, select the top project of the max-heap for investment.
			availableCapital += profits[maxProfitHeap.poll()];
		}

		return availableCapital;
	}
}
