package Interface_Practice;

public class cars implements ABCtransport, XYZtransport {
	@Override
	public void vehicleType() {
		String vehicleType = "Maruti Swift";
		System.out.println(vehicleType);
	}

	@Override
	public void vehicleRlseYear() {
		int vehicleRlseYear = 1999;
		System.out.println(vehicleRlseYear);
		
	}
}
