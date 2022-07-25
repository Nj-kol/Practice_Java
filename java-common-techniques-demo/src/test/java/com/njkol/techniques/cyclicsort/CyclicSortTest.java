package com.njkol.techniques.cyclicsort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CyclicSortTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		int[] arr = new int[] { 3, 1, 5, 4, 2 };
		CyclicSort.sort(arr);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();

		arr = new int[] { 2, 6, 4, 3, 1, 5 };
		CyclicSort.sort(arr);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();

		arr = new int[] { 1, 5, 6, 4, 3, 2 };
		CyclicSort.sort(arr);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

}
