package reviseConstructorInheritanceMethods;

public class Constructor {
	//create a class attribute
	String name;
	
	//Create a class constructor of the class called constructor
	public Constructor() {
		//set initial value for call attribute
		name = "Charlotte";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of the class
		Constructor myName = new Constructor();
		System.out.println(myName.name);

	}

}
