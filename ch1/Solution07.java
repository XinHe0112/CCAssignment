package ch1;

public class Solution07 {
	public void rotate (int[][] matrix, int n) {
		//rotate the matrix layer by layer, we begin with the outermost layer
		int layer = 0;
		for(layer = 0; layer < n/2; layer++) {
		//calculate the begin and end pixels of this layer
		int begin = layer;
		int end = n-1-layer; 
		
		for (int i = layer; i<end; i++) {
			// store the right 
			int temp = matrix[i][end];
			// rotate top to the right
			matrix[i][end] = matrix[begin][i];
			//rotate left to the top
			matrix[begin][i] = matrix[n-1-i][begin];
			//rotate bottom to the left
			matrix[n-1-i][begin] = matrix[end][n-1-i] ;
			//right to bottom
			matrix[end][n-1-i] = temp;
		}	
	}
  }
}
