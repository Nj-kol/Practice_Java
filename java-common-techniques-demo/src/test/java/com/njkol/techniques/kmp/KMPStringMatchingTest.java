package com.njkol.techniques.kmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KMPStringMatchingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testKMPSearch() {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		KMPStringMatching.KMPSearch(pat, txt);
	}

}
