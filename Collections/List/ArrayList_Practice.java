package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Practice {
	
	
	public static void main(String args []) {
		
		//Declaring Array list
		List<String> AL = new ArrayList<String>();
		
		//Add values to Array list
		AL.add("Cricket");
		AL.add("Afghan");
		AL.add("Baseball");
		
		
		boolean result = AL.contains("AFGHAN");
		System.out.println(result);
		
		
		//Add values with position
		AL.add(0, "Football");
		
		//Declaring anothe arraylist
		List<String> AL2 = new ArrayList<String>();
		
		AL2.addAll(AL);
		
		
		//Iteration initiation
		Iterator itr = AL.iterator(); 
		
		//Print the values in arraylist
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//print the 2nd Array List using for each
		System.out.println("Printing the second Array List");
		for(String name:AL2) {
			System.out.println(name);
		}
		
		boolean result2 = AL.containsAll(AL2);
		System.out.println(result2);
		
		boolean result3 = AL.equals(AL2);
		System.out.println(result3);
		
		//retreiving from arraylist
		System.out.println(AL.get(0));
		
		//removing from Array list
		//
		System.out.println("remove by insertion order");
		AL.remove(0);
		System.out.println(AL);

		
		//Arraylist size
		System.out.println(AL2.size());
		System.out.println("Array List 2 sorting");
		//Sort Arraylist
		Collections.sort(AL2);
		System.out.println(AL2);
		
		System.out.println("Array List 2 Reverse sorting");
		//Sort Arraylist
		Collections.sort(AL2, Collections.reverseOrder());
		System.out.println(AL2);
	}

}
