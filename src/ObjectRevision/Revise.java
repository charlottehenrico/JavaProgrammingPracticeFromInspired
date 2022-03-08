package ObjectRevision;

public class Revise {
	int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Revise rv = new Revise();
		rv.x = 40;
		System.out.println(rv.x);
		
		//Create another instance with a different value x
		Revise rv2 = new Revise();
		rv2.x = 16;
		System.out.println( rv2.x);
		
		

	}

}
