package com.njkol.techniques.bfs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZigzagTraversalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTraverse() {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		root.right.left.left = new TreeNode(20);
		root.right.left.right = new TreeNode(17);
		List<List<Integer>> result = ZigzagTraversal.traverse(root);
		System.out.println("Zigzag traversal: " + result);
	}

}
