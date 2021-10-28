package Interface_Practice;

public class Test {

	public static void main(String[] args) {
		ABCtransport ABC1 = new bikes();
		ABCtransport ABC2 = new cars();
		XYZtransport XYZ2 = new cars();
		ABC1.vehicleType();
		ABC2.vehicleType();
		//multiple inheritance
		XYZ2.vehicleRlseYear();

	}

}
