package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution07 {
	long numbers =((long) Integer.MAX_VALUE) + 1;
	byte[]  bitfield = new byte [(int)(numbers / 8)];
	String filename;
	
	public void MissingInt() throws FileNotFoundException{
		Scanner s = new Scanner(new FileReader(filename));
		
		while(s.hasNextInt()) {
			int n = s.nextInt();
			bitfield[n / 8] |= 1 << (n % 8);
		}
		
		for (int i = 0; i < bitfield.length; i++){
			for (int j = 0; j < 8; j++){
				
				if ((bitfield[i] & (i << j)) == 0){
					System.out.println(i * 8 + j);
					return ;
				}
			}
		}
	}

}
