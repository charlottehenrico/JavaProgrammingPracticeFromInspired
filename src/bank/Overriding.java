package bank;

public class Overriding {
	//The initial value for the message attribute is set here
	public void message() {
		System.out.println ("Thank you for opening an acocunt with us");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding myAccount = new Overriding();
		Savings mySavings = new Savings();
		FixedDeposit myFixedDepo = new FixedDeposit();
		myAccount.message();
		mySavings.message();
		myFixedDepo.message();
		}
		}
	//The same method can be used in another class but then an override is added as message. It has to extend that initial parent class
	class Savings extends Overriding{
		public void message() {
		System.out.println("Thank you for opening a Savings account");
		}
		}
	
	//The same method can be used in another class but then an override is added as message. It has to extend that initial parent class	
	class FixedDeposit extends Overriding{
		public void message() {
		System.out.println("Thank you for opening a Fixed Deposit account");
		}
		}
