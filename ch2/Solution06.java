package ch2;

public class Solution06 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public boolean isPalindrome(ListNode head){
		ListNode head1 = reverse(head);
		return equals(head, head1);	
	}
	
	//compare the two linkedlist and determine whether they are equal
	public boolean equals(ListNode head1,ListNode head2){
		while ((head1 != null) && (head2 != null)){
			if (head1.val == head2.val){
				head1 = head1.next;
				head2 = head2.next;
			}
			
			else{
				return false;
			}
			
		}
		
		if ((head1 == null) && (head2 == null)){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	//reverse the linkedlist 
	public ListNode reverse(ListNode current){
		ListNode nextNode = null;
		ListNode previousNode = null;
		while (current != null){
			nextNode = current.next;
			current.next = previousNode;
			previousNode = current;
			current = nextNode;
		}
		
		return previousNode;
	}

}
