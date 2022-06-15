package com.njkol.techniques.dfs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreePathSumTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	//@Test
	void testHasPath() {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		System.out.println("Tree has path: " + TreePathSum.hasPath(root, 23));
		System.out.println("Tree has path: " + TreePathSum.hasPath(root, 16));
	}
	
	@Test
	void testStack() {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	//@Test
	void testStackWithDeque() {
		
		Deque<Integer> stack = new LinkedList<>();
		
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
