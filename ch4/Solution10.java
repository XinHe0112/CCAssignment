package ch4;

public class Solution10 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode parent;
		
		public TreeNode (int val){
			this.val = val;
		}
	}
	
	public boolean isSubtree(TreeNode node1, TreeNode node2){
		if (node2 == null) 
			return true;
		
		/*search through the entire tree, if the two noode matches, 
		call equal function to see if they are identical */
		if (node1.val == node2.val && equal(node1, node2)) 
			return true;
		if (equal(node1, node2)) 
			return true;
		
		;
		return isSubtree(node1.left, node2)||isSubtree(node1.left, node2);
	}
	
	public boolean equal(TreeNode node1, TreeNode node2){
		if (node1 == null || node2 == null) 
			return false;
		else if (node1 == null && node2 == null) 
			return true;
		else if (node1.val == node2.val)	{
	    	if(equal(node1.left, node2.left) && equal(node1.right,node2.right))
	    		return true;
	    	else
	    		return false;
	    }
	    else 
	    	return false;
	}
}
