package newpackage;

public class Methods {

	static void demoMethodStringAge(String fName, int Age) {
		System.out.println(fName + "this is the first name" + "and" + Age + "is the age");
	}
	
	static void demoMethod() {
		System.out.println( "This method does not require any parameters");
	}
	
	static int returnInt (int x) {
		System.out.println("This is inside the returnInt method" + "and" + "This is the param value x" + x);
		return (6);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is me printing to the console");
		demoMethodStringAge("Parker",33);
		demoMethodStringAge( "Charlotte", 14);
		demoMethodStringAge ("Reuben",22);
		demoMethod();
		int returnValue = returnInt(99);
		System.out.println(returnValue + "This is the return value");

	}

}
