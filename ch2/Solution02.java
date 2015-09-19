package ch2;

public class Solution02 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public ListNode ReturnKth(ListNode head, int k){
		if (head == null)
			return null;
					
		ListNode node = head;
		//using variable i to order the element in linked list
		int i = 1;
		while(node.next != null){
			if (i == k){
				break;
			}
			else{
			node = node.next;
			i++;
			}
		}
		
		return node;
	}
}
