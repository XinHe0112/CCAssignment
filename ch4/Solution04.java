package ch4;

public class Solution04 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		
		public TreeNode (int val){
			this.val = val;
		}
	}
	
	boolean isBanlance(TreeNode root){
		if (CheckBalance(root) == -1) return false;
		else return true;
	}
	
	public int CheckBalance (TreeNode root){
		//check if the root is null 
		if (root == null) return 0;
		
		//check if the left subtree is balanced
		int leftHeight = CheckBalance(root.left);
		if (leftHeight == -1) return -1;
		
		//check if the right subtree is balanced
		int rightHeight = CheckBalance(root.right);
		if (rightHeight == -1) return -1;
		
		//check if the current node is balanced
		int hightDifference = Math.abs(leftHeight - rightHeight);
		if(hightDifference > 1) return -1;
		else return leftHeight > rightHeight? leftHeight + 1: rightHeight + 1;
	}
	}

}
