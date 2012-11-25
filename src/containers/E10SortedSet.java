package containers;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


//Exercise 10: (7) Using a LinkedList as your underlying 
//implementation, define your own SortedSet.

public class E10SortedSet<E> implements Set<E>{
	public E10SortedSet(){
		data = new LinkedList<E>();
		iterator = new SetIterator<E>();
	}
	

	private LinkedList<E> data;
	private SetIterator<E> iterator;
	
	@Override
	public Iterator<E> iterator() {
		return iterator;
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean add(E obj) {
		
		if (! data.contains(obj)) {
			
			SetIterator<E> it = (SetIterator<E>) this.iterator();
			int index = 0;
			while(it.hasNext()) {
				if(compare(it.next(), obj) > 0)  {
					it.add(obj);
					return true;
				}
					
			}
//			add(index, e);
			return true;
//			for (E elt: data) {
//				if (compare(elt, obj) > 0 ) {
//					data.add(data.indexOf(elt), obj);
//					return true;
//				}
//				
//			}
//			data.add(obj);
//			return true;
		}

		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> collection) {
		int oldSize = data.size();
		for (E elt : collection) {
			add(elt);
		}
		return data.size() != oldSize;
	}

	@Override
	public void clear() {
		data.clear();
	}

	@Override
	public boolean contains(Object o) {
		return data.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> collection) {
		
		for (Object o: collection) {
			if (! data.contains(o)) {
				return false;
			}
			
		}
		return true;
	}

	@Override
	public boolean isEmpty() {
		return data.size() == 0;
	}

	@Override
	public boolean remove(Object o) {
		return data.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> collection) {
		int oldSize = data.size();
		for (Object o : collection) {
			remove(o);
		}
		return data.size() != oldSize;
	}

	@Override
	public boolean retainAll(Collection<?> collection) {
		int oldSize = data.size();
		for (Object o : data) {
			if ( ! data.contains(o)) {
				data.remove(o);
			}
		}
		return data.size() != oldSize;
	}

	@Override
	public Object[] toArray() {
		return data.toArray();
	}

	@Override
	public <E> E[] toArray(E[] a) {
		return data.toArray(a);
	
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (E elt: data) {
			sb.append(elt + ", ");
		}
		return sb.toString();
	}
	
	int compare(E e1, E e2) {
		return e1.toString().toLowerCase().compareTo(e2.toString().toLowerCase());
	}
	
	class SetIterator<E> implements Iterator<E> {
		private E next;

		@Override
		public boolean hasNext() {
			return next != null;
		}

		@Override
		public E next() {
			return next;
		}

		@Override
		public void remove() {
			data.remove(next);
		}
		
		public void add(E obj) {
			
			next = obj;
		}
		
	}
	

	
	public static void main(String[] args) {
		
		E10SortedSet<String> set = new E10SortedSet<String>();
		
		RandomGenerator.String rgs = new RandomGenerator.String();
		
		
//		for (int i = 0; i < 20; i++ ) {
//			set.add(rgs.next());
//	
//		}
		
		set.add("aaa");
		set.add("aab");
		set.add("aac");
		set.add("baa");
		set.add("aaf");
		set.add("zzz");
		set.add("aad");
		set.add("Aaa");
		set.add("aaa");
		
		System.out.println(set);
		
		for (String s: set) {
			System.out.println(s);
			
		}
		
	}
	
}


