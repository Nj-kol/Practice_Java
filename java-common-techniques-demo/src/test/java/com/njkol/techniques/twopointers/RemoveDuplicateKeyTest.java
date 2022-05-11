package com.njkol.techniques.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicateKeyTest {

	RemoveDuplicateKey prob;
	
	@BeforeEach
	void setUp() throws Exception {
		prob = new RemoveDuplicateKey();
	}


	@Test
	void testCase1() {
		int key = 3;
		int[] input = { 3, 2, 3, 6, 3, 10, 9, 3 };
		int output = prob.remove(input,key);
		System.out.println(output);
	}
	
	@Test
	void testCase2() {
		int key = 2;
		int[] input = { 2, 11, 2, 2, 1 };
		int output = prob.remove(input,key);
		System.out.println(output);
	}
}
