package containers;

import java.util.PriorityQueue;
import java.util.Random;

//Exercise 11: (2) Create a class that contains an Integer 
//that is initialized to a value between o and 100 using java.util.Random. 
//Implement Comparable using this Integer field. Fill a PriorityQueue with 
//objects of your class, and extract the values using poll( ) 
//to show that it produces the expected order.

public class E11 implements Comparable<E11>{

	public E11(Integer n) {
		val = n;
	}
	
	private Integer val;
	
	@Override
	public int compareTo(E11 o) {
		
		return (val > o.val) ? 1 : ((val < o.val)? -1 : 0);
	}
	
	public String toString() {
		return val.toString();
		
	}
	
	
	public static void main(String[] args) {
		PriorityQueue<E11> queue = new PriorityQueue<E11>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			queue.add(new E11(rand.nextInt(100)));
			
		}
		
		while(! queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}




}
