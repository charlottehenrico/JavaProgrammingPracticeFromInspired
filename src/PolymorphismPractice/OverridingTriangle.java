package PolymorphismPractice;

public class OverridingTriangle extends ShapeParentClass {
	
	int height = 15;
	double base = 4.38;
	//double answ = height*base/2;
	
	public void area() {
		System.out.println("This is the area of the triangle: " + height*base/2 + " cm2" );
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingTriangle triangle = new OverridingTriangle();
		triangle.area();

	}

}
