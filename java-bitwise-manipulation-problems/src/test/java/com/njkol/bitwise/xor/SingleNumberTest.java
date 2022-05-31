package com.njkol.bitwise.xor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println(SingleNumber.findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
	}

}
