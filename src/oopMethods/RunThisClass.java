package oopMethods;

public class RunThisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call the class and method from the main class. Because it is a static class, you can call without instantiating
		DemoOopMethod.myMethod();
		//Call the class by instantiating because it is a public method
		DemoOopMethod demoOopMethod = new DemoOopMethod();
		demoOopMethod.myPublicMethod();
		
		
		

	}

}
