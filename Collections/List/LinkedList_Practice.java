package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Practice {

	public static void main(String[] args) {
		
		//Initiation of Linkedlists
		List<String> ll = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>();
		
		//add
		ll.add("One");
		ll.add("Two");
		ll.add("Three");

		ll.add(0, "zero");
		System.out.println(ll);

		ll2.add("Eight");
		ll2.add("Nine");
		ll2.add("Ten");
		
		ll.addAll(ll2);
		
		System.out.println(ll);
		
		ll.remove(6);
		ll.remove(5);
		ll.remove(4);
		
		
		System.out.println(ll);
		
		boolean re = ll.contains("Two");
		System.out.println(re);
		ll2.clear();
		System.out.println(ll2);
		System.out.println(ll);
		System.out.println(ll.indexOf("Three"));
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
