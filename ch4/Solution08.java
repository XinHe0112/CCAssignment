package ch4;

public class Solution08 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode parent;
		
		public TreeNode (int val){
			this.val = val;
		}
	
	public TreeNode FirstCommonAncetor (TreeNode root, TreeNode a, TreeNode b) {	
		//check if the root is null
		if (root == null) return null;
		//check if the root is a or b
		if (root == a && root == b) return root;
		
		//use recursion to check the left subtree 
		TreeNode leftnode = FirstCommonAncetor (root.left, a, b);
		//use recursion to check the  subtree 
		TreeNode rightnode = FirstCommonAncetor (root.right, a, b);
		
		return leftnode==null? rightnode: leftnode;
	    
	}
		
	}

	

}         
