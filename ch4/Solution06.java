package ch4;

public class Solution06 {
	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode parent;
		
		public TreeNode (int val){
			this.val = val;
		}
	}
	
	public TreeNode findNext (TreeNode root) {
		if (root == null) return null;
		
		//if the current node has right subtree, return the most left node in its right subtree
		if (root.right != null){
			TreeNode leftmost = root.right;
			//find the most left tree
			while(leftmost.left != null) {
				leftmost = leftmost.left;
			}
			return leftmost;
		}
		/*if the current node has no right subtree, we should
		pick up where we left off with this node's parents and return its left node */
		else {
			TreeNode current = root;
			TreeNode Parent = current.parent;
			
			while (Parent != null && Parent.left != current) {
				current = Parent;
				Parent = Parent.parent;
			}

			return Parent;
			 
		}
	}

}
