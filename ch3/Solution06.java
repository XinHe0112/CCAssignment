package ch3;

import java.util.LinkedList;

public class Solution06 {
	//Define class Animal 
	class Animal{
		protected String name;
		private int priority;
		public void setPriority(int pri) {
			priority = pri;
		}
		
		public Animal(String name){
			this.name = name;
		}
		public int getPriority() {
			return priority;
		}
		public boolean comparePriority(Animal a) {
			return this.priority < a.priority ;
		}
	}
	
	public class AnimalShelter{
		private int priority = 0;
		LinkedList<Dog> dog = new LinkedList<Dog>();
		LinkedList<Cat> cat = new LinkedList<Cat>();
		
		//add an animal to the animal queue and set the priority
		public void enqueue(Animal a) {
			a.setPriority(priority++);
		}
		
		public Animal dequequeAny() {
			//if there are no dog in dog queue, poll the cat queue
			if (dog.isEmpty()){
				return dequeueCat();
			}
			//if there are no dog in dog queue, poll the cat queue
			else if (cat.isEmpty()) {
				return dequeueDog();
			}
			
			//compare the top element in the two queue, and poll the element with smaller priority
			if (dog.peek().comparePriority(cat.peek())) {
				return dequeueDog();
			}
			else{
				return dequeueCat();
			}
		}
		
		//poll the dog queue
		public Dog dequeueDog(){
			return dog.poll();
		}
		
		//poll the cat queue
		public Cat dequeueCat(){
			return cat.poll();
		}
		
		public class Dog extends Animal {
			public Dog(String n){
				super(n);
			}
		}
		
		public class Cat extends Animal {
			public Cat(String n){
				super(n);
			}
		}
	}

}
