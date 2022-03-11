package encapsulationDemo;

public class Person {
	
	//private = restricted access
	private String pname;
	
	//Getter
	public String getName() {
		return pname;
	}
	
	//Setter
	public void setName(String newName) {
		this.pname = newName;
	}

}
