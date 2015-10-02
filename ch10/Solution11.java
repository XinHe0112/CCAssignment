 package ch10;

import java.util.Arrays;

public class Solution11 {
	public void PeakandValleys (int[] arr) {
		int len = arr.length;
		
		for (int i = 1; i < len-1; i += 2) {
			if (arr[i] > arr[i - 1] && arr[i] < arr[i + 1]) {
				swap(arr, i, i + 1);
			} else if(arr[i] < arr[i-1] && arr[i] > arr[i + 1]){
				swap(arr, i, i - 1);
			} 
		}
		
	}
	
	public void swap(int[]arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;	
	}

	
	public static void main(String[] args){
		int[] arr = {5, 3, 1, 2, 3};
		Solution11 s = new Solution11();
		s.PeakandValleys(arr);
		System.out.println(Arrays.toString(arr));
	}
}
