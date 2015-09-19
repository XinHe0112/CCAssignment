package ch1;

import java.util.Scanner;

public class Solution02 {
	public boolean isPermuation (String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;	
		}
		//create array nums to store every character in the two strings
		int[] nums = new int[256];
		
		//iterate the first string and count how many times each character appear 
		for(int i = 0; i < str1.length(); i++){
			nums[str1.charAt(i)] ++; 
		}
		
		//iterate the second string and compare it with the first string
		for(int i = 0; i < str1.length(); i++){
			nums[str2.charAt(i)] --; 
			if (nums[str2.charAt(i)] < 0)
				return false;
		}
		
		return true;
	}

public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		Solution02 sol = new Solution02 ();
			
		System.out.println (sol.isPermuation(str1, str2));
			
		}		
	

}


