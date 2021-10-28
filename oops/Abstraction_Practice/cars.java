package Abstraction_Practice;

public class cars extends ABCtransport {

	// constructor
	public cars() {
		System.out.println("cars class constructor");
	}

	//Parameterized constructor
	public cars(String companyName, int employeecount) {
		System.out.println("cars class parameterized constructor");
		this.companyName = companyName;
		this.employeecount = employeecount;
	}


	//Can not create object for abstract class
	//ABCtransport abctrans = new ABCtransport();

	private String companyName;
	private long employeecount;



	//implemented the pseudo methods from abstract class
	public void noofBranches() {
		System.out.println("noofBranches: 5");

	}

	@Override
	public void employeewelfarecalculation() {
		System.out.println("Employee welfare fund is calculated yearly");

	}


	public String getcompanyname() {
		return companyName;
	}

	public long employeecount() {
		return employeecount;
	}





}
