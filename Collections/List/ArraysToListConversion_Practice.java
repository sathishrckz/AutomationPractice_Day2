package List;

import java.util.ArrayList;
import java.util.List;

public class ArraysToListConversion_Practice {

	public static void main(String[] args) {
		
		//array declaration
		String [] names = {"ball","zebra","cat","tiger","dog"};
		
		// printing the array
		for(String s:names) {
			System.out.println(s);
		}
		
		//Array->List conversion
		
		//List declaration
		List<String> animals = new ArrayList<String>();
		
		//adding the elements from array to the arrylist
		for(String n: names) {
			animals.add(n);
		}
		
		//printing the arraylist
		System.out.println(animals);
		
		

	}

}
