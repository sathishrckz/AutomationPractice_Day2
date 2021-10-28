package Exercise;
import java.util.Scanner;

public class bouquet_cost {
	
	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("/***********Bouquet Billing*************/");
		 System.out.println("Enter the Number of roses you need in the bouquet");
		 int rosescount = sc.nextInt();
		 
		 System.out.println("Enter the Number of jasmins you need in the bouquet");
		 int jasminecount = sc.nextInt();
		 
		 System.out.println("Enter the Number of lilies you need in the bouquet");
		 int liliescount = sc.nextInt();
		 
		 int sum = (rosescount*1)+(jasminecount*2)+(liliescount*3);
		 
		 System.out.println("The Bouquet Cost is "+sum+"$");
	}

}
