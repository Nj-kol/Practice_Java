package com.njkol.bitwise.xor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		int[] arr = new int[] { 1, 5, 2, 6, 4 };
		System.out.print("Missing number is: " + MissingNumber.findMissingNumber(arr));
	}

}
