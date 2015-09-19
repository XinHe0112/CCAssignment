package ch1;

public class Solution09 {
	public boolean isRotation(String str1, String str2) {
		//check if strings are empty 
		if (str1.length() ==0 || str2.length() == 0)
			return false;
		//check if the length of  two string are equal 
		if (str1.length() != str2.length())
			return false;
		
	    //merge the two string
		String str = str1 + str2;
	    
		//check if str2 is a substring of str
		//if so, str2 is a rotation of str1
	    return isSubstring(str, str2);	
	}

}
