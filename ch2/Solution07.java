package ch2;

public class Solution07 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public ListNode intersection(ListNode headA, ListNode headB){
        if(headA == null || headB == null)
            return null;
            
        int len1 = 1, len2 = 1;
        ListNode head1 = headA, head2 = headB;
		
        //Calculate the length of two LinkedList 
		while (head1.next != null){
			len1 ++;
			head1 = head1.next;
			}
		
		while (head2.next != null){
			len2 ++;
			head2 = head2.next;
			}
		
		// Let headLong be the longer linkedlist, Let headshort be the shorter linkedlist
		ListNode headLong = (len1 >= len2)? headA: headB;
		ListNode headShort = (len2 <= len1)? headB: headA;
		
		//calculate the differences of length 
		int n = Math.abs(len1 - len2);
		
		//move the pointer forwards to nth node 
		while (n>0){
			headLong = headLong.next;
			n--;
		}
		// find the common node and return it
		while (headLong != headShort){
			headLong = headLong.next;
			headShort = headShort.next;
		}
		
		return headLong;
	}

	

}
