package com.njkol.techniques.modifiedbinarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FloorOfANumberTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		System.out.println(FloorOfANumber.searchFloorOfANumber(new int[] { 4, 6, 10 }, 6));
		System.out.println(FloorOfANumber.searchFloorOfANumber(new int[] { 1, 3, 8, 10, 15 }, 12));
		System.out.println(FloorOfANumber.searchFloorOfANumber(new int[] { 4, 6, 10 }, 17));
		System.out.println(FloorOfANumber.searchFloorOfANumber(new int[] { 4, 6, 10 }, -1));
	}
}
