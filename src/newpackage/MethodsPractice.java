package newpackage;

public class MethodsPractice {
	
	static void voidMethod() {
		System.out.println("This method does not return anything");
	}
	
	static int intMethod() {
		System.out.println("This method returns a value int");
		return 4;
	}
	
	//This method returns a int value and takes one string parameter
	static int intStringMethod(String fName) {
		System.out.println("This is the value" + fName);
		return 55;
	}

	//This method returns a string value and takes two string parameters and one int
		static String returnStringMethod(String s1, String s2, int i1) {
			System.out.println("This is the returnString method" + s1 + s2 + i1);
			return "This is the answer";
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voidMethod();
		intMethod();
		int returnValue = intStringMethod("Sarah");
		System.out.println( "This is the returnvalue from intStringMethod" + returnValue);
		String returnValue2 = returnStringMethod("apple", "pear", 7);
		System.out.println ("This is the returnvalue from returnStringMethod" + returnValue2);

	}

}
