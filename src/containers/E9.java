package containers;

import java.util.TreeSet;

//Exercise 9: (2) Use RandomGenerator.String to fill a TreeSet, 
//but use alphabetic ordering. Print the TreeSet to verify the sort order.

public class E9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomGenerator.String rgs = new RandomGenerator.String();
		
		TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		
		for (int i = 0; i < 20; i++ ) {
			ts.add(rgs.next());
			
		}
		
		System.out.println(ts);

	}

}
