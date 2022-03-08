package Car;

public class CarChildClass {
	
	static void welcome() {
		System.out.println("Welcome to the car test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of the car class
		welcome();
		Car2.carDrives();
		Car2.carBrakes();
		Car2 caractions = new Car2();
		caractions.carHoots();
		
		Car2 car2 = new Car2();
		System.out.println("The car being tested is " + car2.colour);

	}

}
