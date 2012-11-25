package containers;

//Exercise 8: (7) Create a generic, singly linked list class 
//called SList, which, to keep things simple, does not implement 
//the List interface. Each Link object in the list should contain 
//a reference to the next element in the list, but not the 
//previous one (LinkedList, in contrast, is a doubly linked 
//list, which means it maintains links in both directions). 
//Create your own SListIterator which, again for simplicity, 
//does not implement ListIterator. The only method in SList 
//other than toString( ) should be iterator( ), which produces 
//an SListIterator. The only way to insert and remove elements 
//from an SList is through SListIterator. Write code to demonstrate SList.

public class E8SList<T> {
	
	E8SList() {
		iterator = new SListIterator<T>();
	}
	
	private SListIterator<T> iterator;
	
	public SListIterator<T> iterator(){
		return iterator;
	}
	
	@Override
	public String toString(){
		iterator.head();
		StringBuilder sb = new StringBuilder();
		while (iterator.hasNext()) {
			sb.append(iterator.next().toString() + (iterator.hasNext()? ", " : ""));
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		
		E8SList<String> list = new E8SList<String>();
		SListIterator<String> it = list.iterator();
		it.add("uiiii");
		it.head();
		it.add("uiiiiaaa");
		it.next();
		it.add("uiiiiiuuu");
		
//		it.removeAll();
		
//		it.next();
//		it.remove();

		System.out.println(list.toString());
	}

}

class SListIterator<T>  {
	
	SListIterator() {
		head = new SListElement();
		currentElement = head;
	}
	
	private SListElement currentElement;
	private SListElement head;

	public boolean hasNext() {
		return currentElement.next != null;
	}
	
	public void head() {
		currentElement = head;
	}

	public T next(){
		currentElement = currentElement.next;
		return currentElement.obj;
	}
	public void add(T o){
		
		SListElement added = new SListElement(o, currentElement.next);

		currentElement.next = added;
	}
	
	public void addFirst(T o){
		head();
		
		SListElement added = new SListElement(o, currentElement.next);

		head.next = added;
		
		currentElement.next = added;
		
		currentElement = added;
	}
	
public void removeAll(){
	head.next = null;
}

public void remove(){
	currentElement.next = currentElement.next.next;
}
	
	
	private class SListElement {
		SListElement (T obj, SListElement next){
			this.obj = obj;
			this.next = next;
		}
		SListElement (){}
		
		private T obj;
		private SListElement next;
		
	}
	
}

