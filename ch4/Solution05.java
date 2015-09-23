package ch4;

public class Solution05 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		
		public TreeNode (int val){
			this.val = val;
		}
	}
	
	public boolean isBST(TreeNode root){
		TreeNode lastCheckNode = null;
		//check if the root is null
		if (root == null) return false;
		
		//check if the left subtree is BST
		if(!isBST(root.left)) return false;
		
		//check the current node
		if((lastCheckNode != null)&&(root.val <= lastCheckNode.val)) return false;
		root = lastCheckNode;
		
		//check the right subtree is BST
		if (!isBST(root.right)) return false;
		
		return true;
	}
}
