package com.njkol.hashtable.algos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisiblepairTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCanPairs() {
        int arr[] = { 92, 75, 65, 48, 45, 35 };
        int k = 10;
 
        // Function call
        boolean ans = Divisiblepair.canPairs(arr, k);
        
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
	}

}
