package ch10;

public class Solution09 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for (int i = 0; i < row - 1 ; i ++){
            if (target >= matrix[i][0]  && target < matrix[i+1][0]) {
                return binarysearch(matrix[i],0, col-1 , target);
            }
        }
        
        return false;
    }
    
    public boolean binarysearch(int[] arr, int first, int last, int target){
        if (first < last){
            return false;
        }
        
        int mid = (first + last) / 2;
        
        if (target == arr[mid]){
            return true;
        }
        
        else{
        	if (target >arr[mid]){
        }
            return binarysearch(arr, mid+1, last, target);
       
        
        if (target < arr[mid]){
            return binarysearch(arr, first, mid-1, target);
        }
        }
      }
    }

