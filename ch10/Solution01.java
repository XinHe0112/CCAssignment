package ch10;

public class Solution01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //if the first array is null, return the second array
    	if (m == 0){
            for (int index = 0; index < n; index++) {
            	nums1[index] = nums2[index];
            }
        }
        
		//calculate the new length of array1
    	int newLen = m+n;
    	
    	//begin with the last item and iterate through the two array,compare each item
		int pos= newLen - 1, i = m-1, j = n-1;
		while(i>=0 && j>=0){
	    	//put the larger item between nums1[i] and nums2[j] in the nums1[pos]
			if (nums1[i] >= nums2[j]){
	    		nums1[pos] = nums1[i];
	    		i--;
	    		pos--;
	    	}
	    	else{
	    		nums1[pos] = nums2[j];
	    		j--;
	    		pos--;
	    	}
	    	
	    	//put the rest items in nums1 in sorted array
			if (i < 0 && j >= 0) {
	    		    while(pos>=0){
	    		     nums1[pos] = nums2[j];
	    		     pos--; j--;
	    		    }
	    	}
	    	
			//put the rest items in nums2 in sorted array
	    	if (j < 0 && i >= 0) {
	    		    while(pos>=0){
	    		     nums1[pos] = nums1[i];
	    		     pos--; i--;
	    		    }
	    	}
	      }
	    }
	}


}
