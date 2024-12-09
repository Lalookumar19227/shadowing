package shadowing;

public class Driver {
	public static void main(String[] args) {
		Vehicle.start();
		Car.start();
		ElectricCar.start();
		System.out.println("=========");
		Vehicle v1=new ElectricCar();
		v1.start();
	}

}
