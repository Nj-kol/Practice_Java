package com.njkol.bitwise.masking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BitMaskingBasicTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	//@Test
	void testFindithBit() {
		int number = 8;
		System.out.println("Binary rep :" + Integer.toBinaryString(number));
		for (int i = 0; i <= 3; i++) {
			boolean isSet = BitMaskingBasic.findithBit(number, i);
			System.out.println(" Is bit at " + i + " position set: " + isSet);
		}

	}

	//@Test
	void testSetTheithBit() {
		int number = 8;
		System.out.println("Binary rep :" + Integer.toBinaryString(number));
		for (int i = 0; i <= 3; i++) {
			int res = BitMaskingBasic.setTheithBit(number, i);
			System.out.println(" Setting bit at " + i + " position : " + Integer.toBinaryString(res));
		}
	}

	@Test
	void testClearTheithBit() {
		int number = 8;
		System.out.println("Binary rep :" + Integer.toBinaryString(number));
		for (int i = 0; i <= 3; i++) {
			int res = BitMaskingBasic.clearTheithBit(number, i);
			System.out.println(" Clearing bit at " + i + " position : " + Integer.toBinaryString(res));
		}
	}

}
