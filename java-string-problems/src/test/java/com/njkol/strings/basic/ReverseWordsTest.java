package com.njkol.strings.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseWordsTest {

	ReverseWords prob;
	
	@BeforeEach
	void setUp() throws Exception {
		prob = new ReverseWords();
	}

	@Test
	void testReverseWordsNaive() {
		String S = "i.like.this.program.very.much";
		String result = prob.reverseWordsNaive(S);
		System.out.println(result);
	}
	
	@Test
	void testReverseWordsOptimal() {
		String S = "i.like.this.program.very.much";
		String result = prob.reverseWordsOptimal(S);
		System.out.println(result);
	}

}
