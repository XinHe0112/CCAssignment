 package ch2;

public class Solution04 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public ListNode Partition (ListNode head, int x){
		ListNode largeBegin = null;
		ListNode largeEnd = null;
		ListNode smallBegin = null;
		ListNode smallEnd = null;
		
		
		while (head.next != null) {
			//iterate trough the list, put the element with larger value in one linked list
			if (head.val >= x) {
				if(largeBegin == null) {
					largeBegin = head;
					largeEnd = head;
				}
				else {
					largeEnd.next = head;
					largeEnd = head; 
				}
				
			}
			
			//iterate trough the list, put the element with smaller value in one linked list
			if (head.val < x) {
				if(smallBegin == null) {
					smallBegin = head;
					smallEnd = head;
				}
				else {
					smallEnd.next = head;
					smallEnd = head; 
				}
				
			}
			head = head.next;
		}
		
		
		//merge the two linked list 
		if (smallBegin == null ) return largeBegin;
		
	    smallEnd.next = largeBegin;
	    return smallBegin;		
	}
}
