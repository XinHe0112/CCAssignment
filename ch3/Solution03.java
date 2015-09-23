package ch3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

import javax.xml.soap.Node;

public class Solution03 {
	public class node{
		int val;
		node below;
		node above;
	}

	private int capacity;
	public node bottom, top;
	ArrayList<Stack> stacks = new ArrayList();
	
	public void push(int val){
		int size = stacks.size();
		if (stacks.get(size).size() < capacity){
			stacks.get(size).add(val);
		}
		if (stacks.get(size).size() == capacity){
			Stack newStack = new Stack();
			newStack.push(val);
			stacks.add(newStack);
		} 
	}
	
	public int  pop(){
		int size = stacks.size();
		if (size == 0) throw new EmptyStackException();
		int ret = (int) stacks.get(size).pop();
		if (stacks.get(size).size() == 0){
			stacks.remove(size-1);
		}
		return ret;
	}
	
	public int popAt(int index) {
		Stack substack = stacks.get(index);
		
		if (index == stacks.size() - 1) {
			int ret = (int) substack.pop();
			return ret;
		}	
		
		else {
			return shift(index);
		}
	}
	
	public int shift(int index){
		Stack substack = stacks.get(index);
		int ret = removeBottom(substack);
		int x = shift(index+1);
		substack.push(x);
        return ret; 
	}
        
    public int removeBottom(Stack stacks) {
    	node b = bottom;
    	bottom = bottom.above;
    	if (bottom != null) bottom.below = null;
    	return b.val;
    }
        
     
}

