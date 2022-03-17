package PolymorphismPractice;

public class ShapeParentClass {
	int length;
	int width;
	
	//If you wanted to overload instead of override, you would add the same "area" method in here, each one containing different
	//parameters as required. This means that you would call this class in all cases for circle, triangle and rectangle and then just use the parameters
	//that you require in each
	//eg public void area(int r) and public void area (int h, int l) etc
	public void area() {
		System.out.println ("This is the area of the shape: " + length*width);
	}

}
