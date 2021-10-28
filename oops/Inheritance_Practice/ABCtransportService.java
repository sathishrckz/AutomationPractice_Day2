package Inheritance_Practice;

public class ABCtransportService {

	//Variables

	String welcomemsg = "Hi Welcome to ABC";
	static String Goodbyemsg = "Thanks for sharing your journey with us !";	
	static int employeecount = 50;

	//Methods
	
	public void welcome() {
		System.out.println(welcomemsg);	
	}

	public static void goodbye() {
		System.out.println(Goodbyemsg);	
	}
}
