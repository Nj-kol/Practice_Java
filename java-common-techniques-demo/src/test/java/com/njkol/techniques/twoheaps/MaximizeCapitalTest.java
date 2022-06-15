package com.njkol.techniques.twoheaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximizeCapitalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindMaximumCapital() {
		int result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2 }, new int[] { 1, 2, 3 }, 2, 1);
		System.out.println("Maximum capital: " + result);
		result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2, 3 }, new int[] { 1, 2, 3, 5 }, 3, 0);
		System.out.println("Maximum capital: " + result);
	}

}
