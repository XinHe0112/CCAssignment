 package ch3;

import java.util.Stack;

public class Solution05 {
	public Stack<Integer> sort(Stack<Integer> originalStack) {
		Stack<Integer> sortedStack = new Stack<Integer>();
		
		while (!sortedStack.isEmpty()) {
			int val = originalStack.pop();
			
			while(val < sortedStack.peek() && !sortedStack.isEmpty()) {
				sortedStack.pop();
				int tmp = sortedStack.peek();
			    originalStack.push(tmp);
			}
			sortedStack.push(val);
		}
		
		return sortedStack;
		
	}

}
   