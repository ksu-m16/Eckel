package containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//Exercise 7: (4) Create both an ArrayList and a LinkedList, 
//and fill each using the Countries.names( ) generator. 
//Print each list using an ordinary Iterator, then insert 
//one list into the other by using a Listlterator, inserting 
//at every other location. Now perform the insertion starting 
//at the end of the first list and moving backward.

public class E7 {


	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Countries.names);
		LinkedList<String> ll = new LinkedList<String>(Countries.names);
		
		Iterator<String> iA = al.iterator();
//		while(iA.hasNext()) {
//			System.out.println(iA.next());
//		}
		
		System.out.println("---------------------------------------");
		
		Iterator<String> iL = ll.iterator();
//		while(iL.hasNext()) {
//			System.out.println(iL.next());
//		}
		
		System.out.println("---------------------------------------");
		
//		ListIterator<String> liA = al.listIterator();
//		ListIterator<String> liL = ll.listIterator();
//		while(liA.hasNext() && liL.hasNext()) {
//			liA.next();
//			liA.add(liL.next());
//		}
		
		System.out.println("---------------------------------------");
		

		
		ListIterator<String> liA = al.listIterator(al.size());
		ListIterator<String> liL = ll.listIterator(ll.size());
		while(liA.hasPrevious() && liL.hasPrevious()) {
			liA.previous();
			liA.add(liL.previous());
			liA.previous();
		}
		
		
		for (String s: al){
			System.out.println(s);
		}
		
	}

}
