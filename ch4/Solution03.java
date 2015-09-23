package ch4;

import java.util.ArrayList;
import ch2.Solution04.ListNode;

public class Solution03 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		
		public TreeNode (int val){
			this.val = val;
		}
	}
	
	public class ListNode<T> {
		T val;
		ListNode<T> next;
		ListNode (T x) {
			val = x; next = null; 
			}
	}
	
	public ArrayList<ListNode<TreeNode>>(TreeNode root){
		ArrayList<ListNode<TreeNode>> list = new ArrayList<ListNode<TreeNode>>();
		boolean[] isFirstElem = {true};
	    return CreatListLevel(root, list,0);
	}
    
	public ArrayList<ListNode<TreeNode>> CreatListLevel(TreeNode root, ArrayList<ListNode<TreeNode>>list int level){
		if (root == null) return;
		
		//Check if this node is the first node in its level, if so, create a new linked list to store it
		if (list.size() == level){
		ListNode<TreeNode> head = list[level];
		head = root;
		head = head.next;
		//Insert the node's children to the linked list in next level 
		CreatListLevel(root.left, lists, level+1);
		CreatListLevel(root.right, lists, level+1);
		}
		
		//If the node is not the first node in its level, just add this node in the existing linked list
		else{
		head = root;
		head = head.next();
		}
		
		//If all the nodes in this level has been add into the linked list,add the linked list to the array list 
		if (list[level].size() == level+1){
		list.add(list[level]);
		}
		return list;
	}
}
