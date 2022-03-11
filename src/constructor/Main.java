package constructor;

public class Main {
	//Create a class attribute
	int x;

	
	//Create a class constructor for the Main class
	
	public Main() {
		//set the initial value for the class attribute x
		x =5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of class Main (this will call the constructor
		Main myObj = new Main();
		
		//print the value of x
		System.out.println(myObj.x);
		
		//Note
		//that the constructor name must match the class name
		//and cannot have a return type (void String or int)
		//also note that the constructor is called when the object is created
		//All classes have in fact a constructor by default; if you don't create a class constructor, Java creates it for you
		//However, then you are not able to set initial values for the object

	}

}
