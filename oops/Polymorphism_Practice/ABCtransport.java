package Polymorphism_Practice;

public class ABCtransport {
	
	//variable
	static double discountrate = 10;
	
	//Method 1
	public static double calculatetransportcharge(double kms) {

		 double amount = 0;

		amount = kms*2;

		return amount;
		
	}

	//Method 2
	public static double calculatetransportcharge(double kms, String cartype) {

		double amount = 0;
		double fee = 0;

		switch(cartype) {

		case "small":
			fee=10;
			break;

		case "medium":
			fee = 15;
			break;

		case "large":
			fee = 20;
			break;
		default:
			System.out.println("Enter valid car type small/medium/large");
		}


		amount = (kms*fee);

		return amount;

	}
	
	public static void discountrate() {
		System.out.println(discountrate);
		
	}

}
