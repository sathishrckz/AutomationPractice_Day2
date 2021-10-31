package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class appliences_powerconsumption {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("/*********** Power consumption*************/");
		 String Appliance;
		 int count;
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 System.out.println("Enter the total number of Appliances");
		 int appliancecount = sc.nextInt();
		 
		 for(int i =0; i<appliancecount; i++) {
			 System.out.println("Enter the Appliance name and its power units"); 
			 
			 String appname = sc.next();
			 int powerunit = sc.nextInt();
			 
			 hm.put(appname, powerunit);
		 }
		 
		 System.out.println("Before Sorting"); 
		 
		 for(Map.Entry<String, Integer> m: hm.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		 	 
		
		 System.out.println("After Sorting"); 
		 
		 List<Integer> powerunit = new ArrayList<Integer>(hm.values());
		
		 Collections.sort(powerunit);
		 
		 for(Map.Entry<String, Integer> m: hm.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue()); 
		 }
	}

}
