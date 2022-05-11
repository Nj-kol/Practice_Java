package com.njkol.techniques.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

	RemoveDuplicates prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new RemoveDuplicates();
	}

	//@Test
	void testCase1() {
		int[] input = { 2, 3, 3, 3, 6, 9, 9 };
		int output = prob.remove(input);
		System.out.println(output);
	}

	// @Test
	void testCase2() {
		int[] input = { 2, 2, 2, 11 };
		int output = prob.remove(input);
		System.out.println(output);
	}

}
