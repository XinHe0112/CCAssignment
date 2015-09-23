package ch4;

import java.util.ArrayList;
import java.util.LinkedList;

import ch4.Solution06.TreeNode;

public class Solution09 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode parent;
		
		public TreeNode (int val){
			this.val = val;
		}
	}

	private static final ArrayList<LinkedList<Integer>> array = null;
	
	ArrayList<LinkedList<Integer>> BSTsequence (TreeNode root) {
		ArrayList<LinkedList<Integer>> array = new ArrayList<LinkedList<Integer>>();
		LinkedList<Integer> pre = new LinkedList<Integer>();
		pre.add(root.val);
		
		//use recursion to check the left subtree
		ArrayList<LinkedList<Integer>> leftSeq = BSTsequence(root.left);
		//use recursion to check the right subtree
		ArrayList<LinkedList<Integer>> rightSeq = BSTsequence(root.right);
		
		//merge the right and left array in the any possible way
		for (LinkedList<Integer>l: leftSeq) {
			for (LinkedList<Integer>r: rightSeq) {
				ArrayList<LinkedList<Integer>> merged = new ArrayList<LinkedList<Integer>>();
				merge(l, r, merged, pre);
				
				array.addAll(merged);
		  }
		}
		
		return array;
	}
	
	void merge(LinkedList<Integer> left, LinkedList<Integer> right, ArrayList<LinkedList<Integer>> mixed, LinkedList<Integer> pre ){
		int first = left.removeFirst();
		pre.add(first);
		//push the prefixed element down the recursion
		merge(left, right, array, pre);
		pre.remove();
		left.addFirst(first);
		
		int second = right.removeFirst();
		pre.addLast(second);
		merge(left, right, array, pre);
		pre.removeLast();
		right.addFirst(second);
	}
}
                                  