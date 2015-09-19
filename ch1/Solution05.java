package ch1;

import java.util.Scanner;

public class Solution05 {
	public boolean OneAway(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		
		//check if the length of two string
		if (Math.abs(len1 - len2) > 1)
				return false;
		
		//Let s1 be the short string and s2 be the long string
		if (Math.abs(len1 - len2) == 1){
			String s1 = str1.length() < str2.length()? str1:str2;
			String s2 = str2.length() < str1.length()? str2:str1;
			boolean difference = false;
			
		//check every charater in two string	
			for(int index1 = 0, index2 = 0; (index1 < str1.length()) && (index2 < str2.length());){
				if (s1.charAt(index1) != s2.charAt(index2)){
					//set difference to true when we found the difference in the first time
					if (difference) return false;
					difference = true;
				
				if (s1.length() == s2.length())
					index1 ++;
				}
				
				if (s1.charAt(index1) == s2.charAt(index2)){
					index1 ++;
				}
			index2 ++;
		  }
			

  }
		return true;
}


	
public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1 = s.next(); 
		String str2 = s.next();
		Solution05 sol = new Solution05();
		
		System.out.println(sol.OneAway(str1, str2));
	}
}
