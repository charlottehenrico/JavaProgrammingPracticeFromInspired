package getterSetter;

public class Person {
	//You have to declare the getter class variables as private
	//Private variables can only be accessed in the same class, else it can be accessed with a getter/setter method
	private String personName;
	
	//Getter method is made public
	public String getName() {
		return personName;
	}
	
	//Setter method is made public
	public void setName(String newName) {
		personName = newName;
	}

}
