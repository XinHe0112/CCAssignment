package ch6;

import java.util.Random;

public class Solution07 {
/* we can write a function to simulate the approach
 *
 */
	public double families(int n){
		int boys = 0;
		int girls = 0;
		for (int i =0; i < n; i++) {
			boys = 0;
			girls = 0;
			Random r = new Random();
			while (girls == 0) {
				if(r.nextBoolean()){
					girls += 1;
				}else {
					boys += 1;
				}
			}
			int[] genders = {girls, boys};
			girls += genders[0];
			boys +=genders[1];
		}
		return girls / (double) (boys + girls);
	}
}
