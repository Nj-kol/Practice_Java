package com.njkol.techniques.slidingwindow.withhashmap;

import org.junit.jupiter.api.Test;

import com.njkol.techniques.slidingwindow.withhashmap.LongestSubstringKDistinct;

class LongestSubstringKDistinctTest {

	@Test
	void testCase1() {
		System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
	}

	// @Test
	void testCase2() {
		System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
	}
	
	// @Test
	void testCase3() {
		System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
	}


}
