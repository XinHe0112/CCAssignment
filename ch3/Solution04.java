package ch3;

import java.util.Stack;

public class Solution04 {
	//Create two stacks, the first is used for storing element
	//The second is used for storing the reverse stack
	public Stack<Integer> stacks = new Stack<Integer>();
	public Stack<Integer> reverse_stacks = new Stack<Integer>();
	private Integer ret;
	
	 // Push element x to the back of queue.
    public void push(int x) {
    	int n = stacks.size();
    	//Reverse the stack and store it in reverse_stacks, and clean the original stack
    	for(int i =0; i < n; i++){
    		reverse_stacks.push(stacks.peek());
    		stacks.pop();
    	}
    	
    	//Use add method to push the element to the original stacks
    	stacks.add(x);
    	//Reverse the reverse_stacks and store it in the original stack
    	for(int i =0; i < n; i++) {
    		stacks.push(reverse_stacks.peek());
    		reverse_stacks.pop();
    	}
    	
    }
 

    // Removes the element from in front of queue.
    public void pop() {
    	if (stacks != null)
    		stacks.pop(); 
    }

    // Get the front element.
    public int peek() {
    	if (stacks!= null)
    		ret = (Integer)stacks.peek();
    		return ret;
    }
        
    // Return whether the queue is empty.
    public boolean empty() {
    	return stacks.empty();
}
}
