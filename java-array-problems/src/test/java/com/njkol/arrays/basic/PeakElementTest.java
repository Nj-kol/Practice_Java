package com.njkol.arrays.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeakElementTest {

	private PeakElement prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new PeakElement();
	}

	@Test
	void test() {
		// int arr[] = { 1, 2, 3 };
		// int[] arr = {2, 3, 4, 7, 5};
		// int[] arr = {2, 2, 2, 2, 2};
		int[] arr = { 8, 7, 6, 5, 4 };
		System.out.println(prob.getPeakElement(arr));
	}
}
