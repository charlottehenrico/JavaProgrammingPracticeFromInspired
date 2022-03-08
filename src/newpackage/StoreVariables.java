package newpackage;

public class StoreVariables {
	
	//This method returns the sum of the two parameters, here we store the answer of the method in a variable (recommended, as it is easier to read and maintain
			static int myMethod(int x, int y) {
				return x + y;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = myMethod(2,3);
		System.out.println("This is the returnvalue" + z);

	}

}
