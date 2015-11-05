package ch6;

public class Solution08 {
	private int breakPoint = 100;
	int count = 0;
// we can write a function to simulate the approach
	public boolean drop (int floor) {
		count++;
		return floor >= breakPoint;
	}
	public int EggDrop(int floor) {
		int interval = 14;
		int previous = 0;
		int egg1 = interval;
		
		while(!drop(egg1) && egg1 <= floor) {
			interval -= 1;
			previous = egg1;
			egg1 += interval;
		}
		
		int egg2 = previous + 1;
		while(egg2 < egg1 && egg2 <= floor && !drop(egg2)) {
			egg2 += 1;
		}
		
		return egg2 > floor ? -1: egg2;
	}
}
