package com.njkol.techniques.subsets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubsetsTest {

	Subsets sub;

	@BeforeEach
	void setUp() throws Exception {
		sub = new Subsets();
	}

	@Test
	void test() {
		
		List<List<Integer>> result = sub.findSubsets(new int[] { 1, 3 });
		System.out.println("Here is the list of subsets: " + result);
		
		result = Subsets.findSubsets(new int[] { 1, 5, 3 });
		System.out.println("Here is the list of subsets: " + result);
	}

}
