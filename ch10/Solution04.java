package ch10;

public class Solution04 {
	//define the Listy class
	public class Listy{
		int[] listy;
		private int size;
		public Listy(int size){
			this.size = size;
			int[] listy = new int[size];
		}
		public int elementAt(int index){
			if (index >= size){
				return -1;
			}
			else{
			return this.elementAt(index);
			}
		}
	}
	
	int SearchNoSize(Listy list, int target){
	     if(list.elementAt(0) == target){
			return 0;
		}
		int pos = 1;
	  
	  // compute the size of list, start with 1, and double it until it return -1
	
	  while (list.elementAt(pos) != -1){
		  if (list.elementAt(pos) ==target){
			  return pos;
		  } 
	  }
	  //after determining the size, use binary search to find targer in list
	  return binarySearch (list, 0, pos-1, target);
	}
	  
	  public int binarySearch (Listy list, int low, int high, int target){
		  if (low > high){
			  return -1;
		  }
		  int mid = (low + high)/2;
		  
		  if(target <= list.elementAt(mid)){
			  return binarySearch (list, low, mid-1, target);
		  }
		  
		  if(target > list.elementAt(mid)){
			  return binarySearch (list, mid+1, high, target);
		  }
		  
		  else{
			  return list.elementAt(mid);
		  }
}
	  
}
