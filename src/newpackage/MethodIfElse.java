package newpackage;

public class MethodIfElse {
	
	//Common to use if... else inside the method
	//Create a check age method with an integer variable called age
	static void checkAge(int Age) {
		//if the age is less than 18, print access denied
		if (Age < 18) {
			System.out.println("Access denied, you are not old enough");}
			else {
				System.out.println ("Access granted, you are old enough");
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge (34);

	}

}
