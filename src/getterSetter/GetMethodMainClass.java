package getterSetter;

public class GetMethodMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call the class where you have the getter and setter method set up
		Person myPerson = new Person();
		//Set the name here to whatever you feel by calling the method
		myPerson.setName("Sarah");
		//Use the getmethod when doing something with the method
		System.out.println(myPerson.getName());

	}

}
