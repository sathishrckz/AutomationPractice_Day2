package Polymorphism_Practice;

public class bikes extends ABCtransport {
	
	//child class variable 
	static double discountrate = 20;
	
	//child class method
	public static void discountrate() {
		System.out.println(discountrate);
	}
	
	//parent class object creation
	ABCtransport ABCtrans = new ABCtransport();
	

	
	public static void main(String args[]) {
		
		//Method overloading example		
		System.out.println("Transport charge is "+ calculatetransportcharge(15));
		System.out.println("Transport charge is "+ calculatetransportcharge(15,"small"));
		
		
		//Method overriding example
		discountrate();
	}

}
