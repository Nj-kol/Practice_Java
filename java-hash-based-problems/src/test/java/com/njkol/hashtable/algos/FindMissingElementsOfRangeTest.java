package com.njkol.hashtable.algos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMissingElementsOfRangeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrintMissing() {
		int arr[] = { 1, 3, 5, 4 };
		int low = 1, high = 10;
		FindMissingElementsOfRange.printMissing(arr, low, high);
	}

}
