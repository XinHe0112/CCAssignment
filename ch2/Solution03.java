package ch2;

public class Solution03 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; next = null; 
			}
	}
	
	public boolean MiddleDelete(ListNode node){
		//If node is the last node in the linked list, it cannot be removed by this way
		if((node == null) || (node.next == null)){
			return false;
		}
		
		//remove the node
	    node.val = node.next.val;
	    node.next = node.next.next;	
	    return true;
	}

}
