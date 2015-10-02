package ch10;

public class Solution03 {
	public int searchinRotated(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
             /* The first situation, the search range is a
            	continuous ascending range */
            if (arr[start] < arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } 
            /* The second situation, the search range is a
            	rotated ascending range */      
            else {      
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        } 
        
        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }

}
