 package ch4;

public class Solution12 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int countPath(TreeNode root, int sum){
		if (root == null) return 0;
		
		//count the path starting form the root
		int PathFromTop = countSum(root, sum, 0);
		//try recursively each node on the left and right
		int PathLeft = countSum(root, sum, 0);
		int PathRight = countSum(root, sum, 0);
		
		int numPath = PathFromTop + PathLeft + PathRight;
		return numPath;
	}
	
	public int countSum (TreeNode root, int sum, int sumCurrent) {
		int numPath = 0;
		if(root == null) return 0;
		
		//when the current sum equals to the target num, increase the num or the path
		sumCurrent += root.val; 
		if (sumCurrent == sum){
			numPath ++;
		}
		
		numPath += countSum (root.left,sum,sumCurrent);
		numPath += countSum (root.right, sum, sumCurrent);
		return numPath;
	}
	

}
