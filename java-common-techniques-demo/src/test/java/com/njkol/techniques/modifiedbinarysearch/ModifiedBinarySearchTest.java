package com.njkol.techniques.modifiedbinarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModifiedBinarySearchTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSearch() {
		System.out.println(ModifiedBinarySearch.search(new int[] { 4, 6, 10 }, 10));
		System.out.println(ModifiedBinarySearch.search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
		System.out.println(ModifiedBinarySearch.search(new int[] { 10, 6, 4 }, 10));
		System.out.println(ModifiedBinarySearch.search(new int[] { 10, 6, 4 }, 4));
	}
}
