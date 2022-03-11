package encapsulationDemo;

public class MainWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myObj = new Person();
		
		//Set the value of the name value to Charlotte
		myObj.setName("Charlotte");
		System.out.println(myObj.getName());
		
		//Why do we need Encapsulation?
		//Better control of class attributes and methods
		//Increased security of data
		//Class attributes can be made read-only (if you use the get method)
		//or write-only (if you only use the set method)

	}

}
