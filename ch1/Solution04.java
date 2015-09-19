package ch1;
import java.util.Scanner;

public class Solution04 {
	public boolean isPalindrome(String str){
		//Create an array to count the number of every same character 
		int len = str.length();
		int[] nums = new int[128];
		//Count the number of characters that appears odd times;
		int countOdd = 0;
		for(int i = 0; i < len; i++){
			nums[str.charAt(i)] ++;
			if (nums[str.charAt(i)] % 2 == 1)
				countOdd++;
			if (nums[str.charAt(i)]%2 == 0)
				countOdd--;
	}
		//if there are more than one character appearing odd times, return false, otherwise return true
		return countOdd <= 1;
		
		
  }
	
public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	Solution04 sol = new Solution04();
	
	System.out.println(sol.isPalindrome(str));
}

}
