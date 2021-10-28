package Inheritance_Practice;

public class cars extends ABCtransportService {
	
	//Object creation for parent class
			ABCtransportService ABCtrans = new ABCtransportService();		
			

			// Calling the non static  Methods and methods from the parent class
			public void TravellingActivities() {	
			ABCtrans.welcome();		
			}
			
			 //child class variable
			static String carsafetyrating = "4Stars";
			
			
		public static void main(String args[]) {
			//Current class variable
			System.out.println("Welcome to ABCcars! You are riding with safety level "+carsafetyrating);
			

			// Calling the static variables and methods from the parent class
			System.out.println("Total number of employees in the company are "+employeecount);

			// Calling the static Methods and methods from the parent class
			goodbye();
		}

}
