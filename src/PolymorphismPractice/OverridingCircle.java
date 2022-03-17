package PolymorphismPractice;

public class OverridingCircle extends ShapeParentClass {
	int circleRadiusInCm = 25;
	double pisquared = 3.14*3.14;
	
	
	public void area() {
		System.out.println("This is the area of the circle: " + circleRadiusInCm*pisquared + "cm2");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingCircle circle = new OverridingCircle();
		circle.area();

		
		

	}

}
