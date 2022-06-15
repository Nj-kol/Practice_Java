package com.njkol.rangequery.sqrtdecompose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SqrtDecompositionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		final SqrtDecomposition sqrtDecomposition = new SqrtDecomposition(new int[] { 1, 2, 6, 7, 9, 3, 1, 9 });
		System.out.println(sqrtDecomposition);
		System.out.println(sqrtDecomposition.query(2, 6));
		sqrtDecomposition.update(5, 7);
		System.out.println(sqrtDecomposition);
		System.out.println(sqrtDecomposition.query(2, 6));
	}
}
