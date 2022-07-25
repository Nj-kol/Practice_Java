package com.njkol.strings.advanced;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerSetTest {

	PowerSet p;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new PowerSet();
	}

	@Test
	void testPowerSet() {
		String curr = "";
		String input = "abc";
		
		p.powerSet(input, 0, curr);
	}

}
