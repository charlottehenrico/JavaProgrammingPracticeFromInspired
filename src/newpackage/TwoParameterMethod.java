package newpackage;

public class TwoParameterMethod {
	
	//This method returns the sum of the two parameters
		static int myMethod(int x, int y) {
			return x + y;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int returnValue = myMethod(4, 5);
		System.out.println("The returnvalue is" + returnValue);
		System.out.println("The sum of the total 12+2 is" + myMethod(12,2));

	}

}
