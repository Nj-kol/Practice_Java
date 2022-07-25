package com.njkol.rangequery.mos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DistinctVowelsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testQueryResults() {
		
		char[] array = new char[] {'m', 'e', 'd', 'i', 'u', 'm', 'i', 's', 'g', 'o', 'o', 'd'};
		 
        Query[] queries = new Query[] {
                new Query(4, 9),
                new Query(3, 7),
                new Query(2, 8),
                new Query(0, 5),
                new Query(7, 10),
                new Query(1, 11),
        };
        
        DistinctVowels.queryResults(array,queries);
	}

}
