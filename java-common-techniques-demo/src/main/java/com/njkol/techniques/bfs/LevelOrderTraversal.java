package com.njkol.techniques.bfs;

import java.util.*;

public class LevelOrderTraversal {

	public static List<List<Integer>> traverse(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if (root == null)
			return result;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			System.out.println("levelSize is : "+levelSize);
			List<Integer> currentLevel = new ArrayList<>(levelSize);
			for (int i = 0; i < levelSize; i++) {
				TreeNode currentNode = queue.poll();
				// add the node to the current level
				currentLevel.add(currentNode.val);
				// insert the children of current node in the queue
				if (currentNode.left != null)
					queue.offer(currentNode.left);
				if (currentNode.right != null)
					queue.offer(currentNode.right);
			}
			result.add(currentLevel);
		}

		return result;
	}
}
