package ch3;

import java.util.EmptyStackException;

public class Solution01 {
	public class ArrayStack {
		private int capacity;
		private int[] size;
		private int[] values;
	
	public ArrayStack (int StackNum, int capacity){
		this.capacity = capacity;
		//Create an array with 3 element, to store the size of the three stacks
		size = new int[3];
		values = new int[StackNum*capacity];
 	}
	
	//Push item into the tack
	public void push (int StackNum, int value){
		if (StackNum > 3) return ;
		size[StackNum]++;
		values[TopIndex(StackNum)] = value; 
	}
	
	//Pop item from the top stack
	public int[] pop(int StackNum){
		if (isEmpty(StackNum))  throw new EmptyStackException();
		
		values[TopIndex(StackNum)] = 0;
		size[StackNum]--;
		return values;
		}
	
	//return the top stack
	public int peek(int StackNum){
		if (isEmpty(StackNum))  throw new EmptyStackException();
		return values[TopIndex(StackNum)];
	}
	
	//return if a stack is empty
	public boolean isEmpty(int StackNum){
		return size[StackNum] == 0;
	}
	
	//return the index of the top item of the stack
	public int TopIndex(int StackNum){
		return size[StackNum] + StackNum*capacity;
	}
	}
}
