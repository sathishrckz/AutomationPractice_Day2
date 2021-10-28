package Abstraction_Practice;

public abstract class ABCtransport {

	// constructor
	public ABCtransport() {
		System.out.println("abstract class constructor");
	}

	//Parameterized constructor
//	public ABCtransport(String companyName, int employeecount) {
//		System.out.println("abstract class parameterized constructor");
//		this.companyName = companyName;
//		this.employeecount = employeecount;
//	}

	//class variables
	String Location = "Bangalore";
	int yearofstart = 1955;
	private String companyName;
	private long employeecount;
	
	

	//abstract methods
	public abstract void noofBranches();

	public abstract void employeewelfarecalculation();

	//concrete methods
	public void employeePortal() {
		System.out.println("Welcome to employee portal");
		System.out.println("Location "+Location);
		System.out.println("yearofstart "+yearofstart);
	}

	public String getcompanyname() {
		return companyName;
	}

	public long employeecount() {
		return employeecount;
	}
}
