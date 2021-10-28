package Abstraction_Practice;

public class Test {


		public static void main(String args[]) {
			
			ABCtransport ABC1 = new cars();
			ABCtransport ABC2 = new cars("ABCcarsPVTLtd",555);
			
			System.out.println("Company Name "+ABC2.getcompanyname());
			System.out.println("Employee Count "+ABC2.employeecount());
			
			ABC2.noofBranches();
			ABC2.employeewelfarecalculation();
		}

	

}
