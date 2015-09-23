package ch3;

import java.util.Stack;

public class Solution02 extends Stack<Integer> {
	//create a new stack s_min to store the minimum element
	Stack<Integer> s_min = new Stack<Integer>();
	
	//When we push an element, compare it with the minimum element to check if this new element is minimum
	public void push (int val) {
		if (val < this.min()){
			s_min.push(val);
		}
		super.push(val);
		}
	
	//When we pop an element, check if it is the minimum element
	public Integer pop() {
		if (super.pop() == this.min()){
			s_min.pop();
		}
		return super.pop();
	}
	
	//Return the top element in s_min, which is the minimum element 
	public int min() {
		return s_min.peek();
	}

}
 