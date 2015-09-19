package ch1;

import java.util.Scanner;

public class Solution06 {
	public String Compression (String str) {
		//use the resize array StringBuilder to store new string
		StringBuilder newStr = new StringBuilder();
		int len = str.length();
		//count the repeatable character
		int count = 1;
		
		/*iterate through the string 
		and check if every element is same to the next one*/
		for (int i = 0; i < len; i++) {
			if ((i + 1) >= len ||str.charAt(i) != str.charAt(i+1)) {
				newStr.append(str.charAt(i));
	    		newStr.append(count);
	    		count = 1;
	    	}
	    	else {
	    		count ++;
	    	}
	      }
	    //return the loner one between new and original string
		return str.length() > newStr.length() ? newStr.toString(): str;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next(); 
		Solution06 sol = new Solution06();
		
		System.out.println(sol.Compression(str));
	}

}
