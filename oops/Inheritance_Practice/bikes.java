package Inheritance_Practice;

public class bikes extends ABCtransportService {
	
		//Object creation for parent class
		ABCtransportService ABCtrans = new ABCtransportService();		
		

		// Calling the non static  Methods and methods from the parent class
		public void TravellingActivities() {	
		ABCtrans.welcome();		
		}
		
		 //child class variable
		static String bikesafetyrating = "5Stars";
		
		
	public static void main(String args[]) {
		//Current class variable
		System.out.println("Welcome to ABCbikes! You are riding with safety level "+bikesafetyrating);
		

		// Calling the static variables and methods from the parent class
		System.out.println("Total number of employees in the company are "+employeecount);

		// Calling the static Methods and methods from the parent class
		goodbye();
	
	}

}
