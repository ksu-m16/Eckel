package containers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E3 {

//	Exercise 3: (1) Using Countries, fill a Set multiple times 
//	with the same data and verify that the Set ends up with only 
//	one of each instance. Try this with HashSet, LinkedHashSet, and TreeSet.
	
	public static void main(String[] args) {
		
		TreeSet<String> s = new TreeSet<String>(Countries.names());
		
//		HashSet<String> hs = new HashSet<String>(Countries.names());

		int n = 10;
			
		TreeSet<String> target = new TreeSet<String>();
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet <String> lhs = new LinkedHashSet<String>();
		
		for (int i = 0; i < n; i++) {
			target.addAll(s.headSet("B"));
			hs.addAll(s.headSet("B"));
			lhs.addAll(s.headSet("B"));
		}
		
//		for (String str: target) {
//		System.out.println(str);
//		}
		
		for (String str: lhs) {
		System.out.println(str);
		}
		
		
	}

}
