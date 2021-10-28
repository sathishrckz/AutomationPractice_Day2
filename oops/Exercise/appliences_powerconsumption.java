package Exercise;

import java.util.Scanner;

public class appliences_powerconsumption {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("/*********** EB Bill Calculation*************/");
		 System.out.println("Enter the Number of Fan in your Home");
		 int fancount = sc.nextInt();
		 
		 System.out.println("Enter the Number of Lights in your Home");
		 int lightcount = sc.nextInt();
		 
		 System.out.println("Enter the Number of tv in your Home");
		 int tvcount = sc.nextInt();
		 
		
		 
		 int electricityUnitSum = (fancount*1)+(lightcount*2)+(tvcount*3);
		 
		 int EBUnitprice = 15;
		 
		 System.out.println("The Power Consumption Cost is "+(electricityUnitSum*EBUnitprice)+"$");
		 
		 // sorting the device based on consumption is yet to do

	}

}
