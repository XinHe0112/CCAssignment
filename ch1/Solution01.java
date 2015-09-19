package ch1;

import java.util.Scanner;

public class Solution01 {
	public boolean isUnique(String str) {
		int len = str.length();
		if (len > 128) return false;
		
		// there are 256 in ASCII characters, so the size of array is 128.
		boolean[] arr = new boolean[256];
		int val;
		
		//iterate the array, and change the value of the array element arr[str.charAt(i)]
		for (int i = 0; i< len; ++i){
		val = str.charAt(i);
		// if the arr[str.charAt(i)] is true, the element must be changed before, that means the array index appeared before
		if (arr[val]) return false;
		arr[val] = true;
		}
		
	return true;
	
	}


public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String str = s.next();
	Solution01 sol = new Solution01 ();
	
	System.out.println (sol.isUnique(str));
	
}
}