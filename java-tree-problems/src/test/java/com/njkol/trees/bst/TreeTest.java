package com.njkol.trees.bst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

	Tree intTree = new Tree();

	@BeforeEach
	void setUp() throws Exception {

		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
	}

	@Test
	void testTraverseInOrder() {
		intTree.traverseInOrder();
	}

	@Test
	void testMin() {
		int expected = 15;
		int actual = intTree.min();
		assertEquals(expected, actual);
	}
	
	@Test
	void testMax() {
		int expected = 32;
		int actual = intTree.max();
		assertEquals(expected, actual);
	}

}
