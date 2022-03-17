package PolymorphismPractice;

public class OverridingRectangle {
	int length = 20;
	int width = 23;
	
	public void area() {
		System.out.println("This is the area of the rectangle: " + length*width + "cm2");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingRectangle rectangle = new OverridingRectangle();
		rectangle.area();

	}

}
