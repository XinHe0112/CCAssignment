package ch10;

import java.util.BitSet;

public class Solution08 {
	void findDuplicates (int[] array) {
		int len = array.length;
		//create a bit vector  and use bits to represent integer.
		BitSet b = new BitSet (3200);
		//iterate through the array, set each bit to 1
		for (int i = 0; i < len; i++){
			//when find a duplicate element, print it
			if (b.get(array[i] - 1)) {
				System.out.println(array[i]);
			}
			else {
				b.set(array[i] - 1);
			}
		}
	}
}
