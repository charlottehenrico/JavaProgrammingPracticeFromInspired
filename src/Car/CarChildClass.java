package Car;

public class CarChildClass {
	
	static void welcome() {
		System.out.println("Welcome to the car test");
	}
	
	static void Ending() {
		System.out.println("Thank you for attending");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of the car class
		welcome();
		Car2.carDrives();
		Car2.carBrakes();
		Car2 Polo = new Car2();
		Polo.colour ="white";
		Polo.drive = "4x4";
		Polo.speed = 180;
		Polo.carHoots();
		
		Car2 car2 = new Car2();
		System.out.println("The Polo is being tested. " + "It is " + car2.colour + ".");
		
		Ending();

	}

}
