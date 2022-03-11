package inheritanceDemo;

public class Motorcycle extends Vehicle {
	private String type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of the class
		Motorcycle myBike = new Motorcycle();
		myBike.modelname = "SZ";
		myBike.wheels = 2;
		myBike.brand ="Honda";
		myBike.type = "Speed";
		
		//call the method from vehicle class
		myBike.honk();
		
		//Print line with both vehicles and car class attributes
		System.out.println( "My bike " + myBike.brand + " " +  myBike.modelname + "with number of wheels " +  myBike.wheels+"" + myBike.type +" is honking");
		
		

	}

}
