package com.njkol.hashtable.algos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSubsequenceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindLongestConseqSubseq() {
		
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int n = arr.length;

		System.out.println("Length of the Longest " + "contiguous subsequence is " + LongestConsecutiveSubsequence.findLongestConseqSubseq(arr, n));
	}

}
