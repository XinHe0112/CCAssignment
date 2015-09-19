package assignment;

public class Solution08 {
	public void ZeroMatrix (int[][] matrix){
	int i, j;
	int rowNum = matrix.length;
	int colNum = matrix[i].length;
	boolean rowZero = false;
	boolean colZero = false;
	
	//check if there exist zero in the first row and column 
	for (i = 0; i < rowNum; i++){
		if (matrix[i][0] == 0){
			colZero = true;
			break;
		}
	}
	
	for (i = 0; j < colNum; i++){
		if (matrix[0][j] == 0){
			rowZero = true;
			break;
		}
	}
	
	//check if there exist zero in the rest matrix
	for (i = 1; i<rowNum; i++){
		for (j = 1; j < colNum; j++){
			if (matrix[i][j] == 0){
				matrix[i][0] = 0;
				matrix[0][j] = 0;
			}
		}
	}
	
	//set the element to zero according to the first row and column
	for(i = 1; i < rowNum; i++){
		if (matrix[i][0] == 0){
			for (j= 0; j < colNum; j++)
				matrix[i][j] = 0;
		}
	}
	
	for(j = 1; j < colNum; j++){
		if (matrix[0][j] == 0){
			for (i = 0; i < rowNum; i++)
				matrix[i][j] = 0;
		}
	}
	
	//set the first row and column to zero 
	if (rowZero){
		for (j= 0; j < colNum; j++)
			matrix[0][j] = 0;
	}
	
	if(colZero){
		for (i = 0; i < rowNum; i++)
			matrix[i][0] = 0;
		
	}
	}

}
