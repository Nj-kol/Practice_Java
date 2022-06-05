package com.njkol.techniques.bfs;

import java.util.*;

public class ZigzagTraversal {
	
	public static List<List<Integer>> traverse(TreeNode root) {
		
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    if (root == null)
	      return result;

	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.offer(root);
	    boolean leftToRight = true;
	    while (!queue.isEmpty()) {
	      int levelSize = queue.size();
	      List<Integer> currentLevel = new LinkedList<>();
	      for (int i = 0; i < levelSize; i++) {
	        TreeNode currentNode = queue.poll();

	        // add the node to the current level based on the traverse direction
	        if (leftToRight)
	          currentLevel.add(currentNode.val);
	        else
	          currentLevel.add(0, currentNode.val);

	        // insert the children of current node in the queue
	        if (currentNode.left != null)
	          queue.offer(currentNode.left);
	        if (currentNode.right != null)
	          queue.offer(currentNode.right);
	      }
	      result.add(currentLevel);
	      // reverse the traversal direction
	      leftToRight = !leftToRight;
	    }
	    return result;
	  }
}