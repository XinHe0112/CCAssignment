package ch2;

public class Solution01 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public void RemoveDups(ListNode head){
		ListNode node = head;
		ListNode tail = head.next;
		
		/*use two pointers, the first one is used to iterate the linked list
		the the second one is used to check all the following element */
		while(node != null){
			for (tail = node; tail.next !=null; tail = tail.next ){
			if (node.val == tail.val){
				tail.next = tail.next.next;
			}
			else{
				tail = tail.next;
			}
		  }
			node = node.next;
		}
	}

}
