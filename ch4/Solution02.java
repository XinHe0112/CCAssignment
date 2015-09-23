package ch4;

public class Solution02 {
	public class TreeNode{
	int val;
	TreeNode right;
	TreeNode left;
	
	public TreeNode (int val){
		this.val = val;
	}
}
	public TreeNode MinimalBST(int[] arr){
		return MinimalBST(arr, 0, arr.length-1);
	}
	
	public TreeNode MinimalBST(int[] arr, int start, int last){
		//insert the middle element of the array into the BSF
		int mid = (0+last)/2;
		TreeNode node = new TreeNode(arr[mid]);
		//insert the middle element of the left part of array
		node.left = MinimalBST(arr, start, mid-1);
		////insert the middle element of the right part of array
		node.right = MinimalBST(arr, mid+1, last);
		return node;
	}
		
}

