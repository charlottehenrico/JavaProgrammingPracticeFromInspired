package Car;

public class BMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of the car class
		Car bmw = new Car();
		bmw.colour = "White";
		bmw.drive = "4x4";
		bmw.yearmodel = "2022";
		System.out.println( "For a BMW, The colour is "+ bmw.colour + ",the drive type is " + bmw.drive + " and the model is " + bmw.yearmodel);
		//System.out.println( "The colour is "+ bmw.colour + ",the drive type is" + bmw.drive + " and the model is " + bmw.yearmodel);

		
		Car ford = new Car();
		ford.colour = "Blue";
		ford.drive = "4x2";
		System.out.println( ford.colour + ","+ ford.drive);
	}

}
