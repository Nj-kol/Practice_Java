package com.njkol.techniques.dfs;

public class TreePathSum {

	public static boolean hasPath(TreeNode root, int sum) {
		System.out.println(sum);
	    if (root == null)
	        return false;

	      // if the current node is a leaf and its value is equal to the sum, we've found a path
	      if (root.val == sum && root.left == null && root.right == null)
	        return true;

	      // recursively call to traverse the left and right sub-tree
	      // return true if any of the two recursive call return true
	      return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
	}
}
