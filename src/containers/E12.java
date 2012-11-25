package containers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class E12 {
//	(1) Create a List (try both ArrayList and LinkedList) 
//	and fill it using Countries. Sort the list and print it,
//	then apply Collections.shuffle( ) to the list repeatedly, 
//	printing it each time so that you can see how the shuffle( ) 
//	method randomizes the list differently each time
	
//	(2) Produce a Map and a Set containing all the countries that begin with ‘A’.

	public static void main(String[] args) {
		
//		ArrayList<String> names = new ArrayList<String>(Countries.names());
		LinkedList<String> names = new LinkedList<String>(Countries.names());
		
		Collections.sort(names);
		Collections.shuffle(names);
		
//		for (String s: names) {
//			System.out.println(s);
//		}
		
		//(2)
		
		TreeSet<String> s = new TreeSet<String>(Countries.names());

		TreeSet<String> sA = (TreeSet<String>) s.headSet("B");
//		for (String str: sA) {
//			System.out.println(str);
//		}
		
		TreeMap<String, String> m = new TreeMap<String, String>(Countries.capitals());

		Map<String, String> m2 = m.headMap("B");
		
		for (Map.Entry<String, String> e: m2.entrySet()) {
		System.out.println(e);
		}
		
	}

}
