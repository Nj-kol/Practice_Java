package com.njkol.techniques.topk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthSmallestNumberTest {

	@BeforeEach
	void setUp() throws Exception {
	}


	@Test
	void testFindKthSmallestNumber() {

		int result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
		System.out.println("Kth smallest number is: " + result);
		assertEquals(5, result);

		// since there are two 5s in the input array, our 3rd and 4th smallest numbers
		// should be a '5'
		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
		assertEquals(5, result);
		System.out.println("Kth smallest number is: " + result);

		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3);
		assertEquals(11, result);
		System.out.println("Kth smallest number is: " + result);
	}

	@Test
	void testFindKthSmallestNumberAlter() {

		int result = KthSmallestNumber.findKthSmallestNumberAlter(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
		System.out.println("Kth smallest number is: " + result);
		assertEquals(5, result);

		// since there are two 5s in the input array, our 3rd and 4th smallest numbers
		// should be a '5'
		result = KthSmallestNumber.findKthSmallestNumberAlter(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
		assertEquals(5, result);
		System.out.println("Kth smallest number is: " + result);

		result = KthSmallestNumber.findKthSmallestNumberAlter(new int[] { 5, 12, 11, -1, 12 }, 3);
		assertEquals(11, result);
		System.out.println("Kth smallest number is: " + result);
	}

}
