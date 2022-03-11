package inheritanceDemo;

public class Car extends Vehicle {
	private String shape;
	private boolean isPowerSteered = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of the class
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		//call the method from vehicle class
		myCar.brand = "Mercedes";
		myCar.modelname = "CLA";
		myCar.colour = "white";
		myCar.shape = "SUV";
		//myCar.powersteering;
		myCar.honk();
		
		//Print line with both vehicles and car class attributes
		System.out.println( "The car " + myCar.brand + " " +  myCar.modelname + " " +  myCar.drive + " " +  myCar.colour + "" + myCar.shape + " is honking");
		
		myCar2.brand = "Mercedes";
		myCar2.modelname = "AClass";
		myCar2.colour = "Blue";
		myCar2.wheels = 4;
		myCar.honk();
		
		System.out.println( "The car, " + myCar2.brand + " ," +  myCar2.modelname + " is powersteered" + myCar2.isPowerSteered + " is a" +  myCar2.drive + "and has the number of wheels " +  myCar2.wheels + "and is of colour " +  myCar2.colour + " is honking");


	}

}
