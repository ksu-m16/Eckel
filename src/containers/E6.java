package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//(2) Note that List has additional "optional" operations 
//that are not included in Collection. Write a version of 
//Unsupported.java that tests these additional optional operations.
public class E6 {

	static void test(String msg, List<String> list) {
		System.out.println("--- " + msg + " ---");
		List<String> c = list;
//		Collection<String> subList = list.subList(1, 8);
		// Copy of the sublist:
//		Collection<String> c2 = new ArrayList<String>(subList);
		
		try {
			c.indexOf("D");
		} catch (Exception e) {
			System.out.println("indexOf(): " + e);
		}
		
		try {
			c.get(3);
		} catch (Exception e) {
			System.out.println("get(): " + e);
		}
		
		try {
			c.add(3, "zzz");
		} catch (Exception e) {
			System.out.println("add(i, o): " + e);
		}
		
		try {
			c.lastIndexOf("B");
		} catch (Exception e) {
			System.out.println("lastIndexOf(): " + e);
		}
		
		try {
			c.listIterator();
		} catch (Exception e) {
			System.out.println("listIterator(): " + e);
		}
		
		try {
			c.remove(4);
		} catch (Exception e) {
			System.out.println("remove(): " + e);
		}
		
		try {
			c.set(4, "YYY");
		} catch (Exception e) {
			System.out.println("set(): " + e);
		}
		
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiable Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableList()",
				Collections.unmodifiableList(new ArrayList<String>(list)));
	}

}
