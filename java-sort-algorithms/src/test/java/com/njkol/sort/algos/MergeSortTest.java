package com.njkol.sort.algos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for Merge Sort
 * 
 * @author Nilanjan Sarkar
 *
 */
class MergeSortTest {

	private SortAlgorithm sa;

	@BeforeEach
	void setUp() throws Exception {
		sa = new MergeSort();
	}

	@Test
	void testDoSortIntger() {
		int[] expected = { -22, -15, 1, 7, 20, 35, 55 };
		int[] input = { 20, 35, -15, 7, 55, 1, -22 };
		int[] actual = sa.doSortIntger(input);
		assertArrayEquals(expected, actual);
		SortUtils.printArray(actual);
	}
}
