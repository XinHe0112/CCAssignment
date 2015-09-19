package ch2;

public class Solution05 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public ListNode SumList_reverse(ListNode head1, ListNode head2){
	    ListNode sum = new ListNode(0);
	    ListNode sumReturn = sum;
	    boolean carry = false;
		while ((head1!= null)||(head2 != null))
		{
			if (carry){
				sum.val ++;
			}
			sum.val = head1.val + head2.val;
			//
			if (sum.val > 9){
				sum.val -= 10;
				carry = true;
			}
			
			head1 = head1.next;
			head2 = head2.next;
			sum = sum.next;
		}
		// 
	    ListNode rest = (head1 == null)? head2: head1;
		while (rest != null){
			sum = rest;
			sum = sum.next;
			rest = rest.next;
		}
		
		return sumReturn;
	}
	
	public ListNode SumList(ListNode head1, ListNode head2){
	    ListNode sum = new ListNode(0);
	    ListNode sumReturn = sum;
	    boolean carry = false;
		while ((head1!= null)||(head2 != null))
		{
			// pass the carry  mkk
			if (carry){
				sum.val = 1;
				carry = false;
			}
			sum.val += head1.val + head2.val; 
			if (sum.val > 9){
				sum.val -= 10;
				carry = true;
			}
			
			head1 = head1.next;
			head2 = head2.next;
			sum = sum.next;
		}
		
		if (carry = true){
			sum.next.val = 1;
			carry = false;
		}
		//Add the rest part of the longer list to sum
	    ListNode rest = (head1 == null)? head2: head1;
		while (rest != null){
			if (carry = true){
				
			}
			sum = rest;
			sum = sum.next;
			rest = rest.next;
		}
		
		return sumReturn;
	}

}
