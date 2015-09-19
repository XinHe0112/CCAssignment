package ch1;

public class Solution03 {
	public char[] URLify(char[] str, int len){
		int space =  0;
	
		//count how many space the original string contains
		for (int i = 0; i < len; i++){
			if (str[i] == ' ')
				space++;
		}
		//count the length of the new string
		int newLen = 2*space + len;
		//iterate the string, replace each space with "%20"
		str[newLen] = '\0';
		for (int i = len - 1; i >= 0; --i){
			if (str[i] == ' '){
				str[i + 2*space] = '0';
				str[i + 2*space -1] = '2';
				str[i + 2*space - 2] = '%';
				space -= 1;
			}
			
			else
				str[i + 2*space] = str[i];

		}
		
		return str;
	}
	
	public static void main (String[] args){
		Solution03 sol = new Solution03 ();
		String str = "Mr John Smith ";
		int len = str.length();
		char[] input = new char[128];
		for (int i = 0; i < len; i++){
			input[i] = str.charAt(i);
		}
		System.out.print (sol.URLify(input, 13));		
	}
} 
 