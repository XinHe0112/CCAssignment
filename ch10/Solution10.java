package ch10;

import java.util.Scanner;

public class Solution10 {
	/*Create Binary Search Tree to store numbers, which can optimize 
	  the time complexity form O(n) to O(log n) */
	
	public class TreeNode {
		int val = 0;
		TreeNode left, right;
		int left_count = 0;
		
		public TreeNode(int value) {
			val = value;
		}
	
	//insert an item to the binary search tree
	public void insert(int value){
		if (value <= val) {
			if (left != null) {
				left.insert(value);
			} else left = new TreeNode(value);
			left_count++;
		} else {
			if (right != null) {
				right.insert(value);
			} else right = new TreeNode(value);
		}
	}
	
	public int getRank(int value) {
		//Because all nodes in left subtree is less than value, return all nodes
		if (value == val) {
			return left_count;
		} else if (value < val) {
			if (left == null) return -1;
			else return left.getRank(value);
		} else {
			if (right == null) {
				return -1; //max
			} else {
				return left.getRank(value) + right.getRank(value) + 1;
			}
		}
		
	}
		
	}
	
	public void track(TreeNode root, int value) {	
		if (root == null) {
		    TreeNode newroot = new TreeNode(value);
		    root = newroot;
		} else {
			root.insert(value);
		}
	}

}
