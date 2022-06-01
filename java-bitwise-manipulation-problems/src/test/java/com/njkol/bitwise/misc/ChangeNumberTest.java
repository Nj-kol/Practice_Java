package com.njkol.bitwise.misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChangeNumberTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		int a = 79;
		int b = 89;
		System.out.println("Number a: "+Integer.toBinaryString(a));
		System.out.println("Number b: "+Integer.toBinaryString(b));
		int bitsToChange= ChangeNumber.numBitsToChange(a, b);
		System.out.println(bitsToChange);
	}

}
