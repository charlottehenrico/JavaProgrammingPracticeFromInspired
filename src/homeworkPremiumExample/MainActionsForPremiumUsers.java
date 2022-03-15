package homeworkPremiumExample;

public class MainActionsForPremiumUsers extends Premium{
	String patientName = "Calvin";
	int patientAge = 35;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Instantiate the private methods class
		PracticalMethods actions = new PracticalMethods();
		//call static method
		PracticalMethods.welcome();
		
		//create an object of the class
		Premium newUser = new Premium();
		newUser.name = "Netcare Midrand";
		newUser.practiceNumber = "0NC123";
		newUser.type = "HospitalGroup";
		newUser.location = "Gauteng";
	
		//Print line with both premium user and hospital attributes
		System.out.println( "You are now visiting " + newUser.name + " with practice number " +  newUser.practiceNumber + "." + "Netcare is part of a " + newUser.type + " based in "+ newUser.location +".");
		
		//Add if else statement for Admission ward true
			boolean hasAdmissionWard = true;
			if (hasAdmissionWard = true) {
				System.out.println("Please note the facility has an Admission Ward");}
				else {
					System.out.println ("Please note that you would need to visit Netcare Admissions Facility if an Admission is required");
				}
		
			//Add if else statement for Admission ward true
			boolean isVerified = false;
			if (isVerified = false) {
				System.out.println("Your Medical Practice Number has not been verified yet.Please contact the admin staff.");}
				else {
					System.out.println ("Thank you for updating your verification details");
				}
		//call the method from hospital class
		Hospital newHospital = new Hospital();
		newHospital.completeHospitalForms();
		newHospital.VerifyEmail();
				
		//Build patient info from the patient constructor class
		Hospital patientDetails = new Hospital(30, "Mary");
		System.out.println( "Patient receiving treatment is " + patientDetails.patientName+  " and is "+ patientDetails.patientAge + " years old");

		//Set the value of the patient illness
//		Hospital patientIllness = new Hospital();
//		patientIllness.setIllness(" Covid");
//		System.out.println("You have been diagnosed with" + patientIllness.getIllness());
		
		//call public method
		actions.thankyou();
		
		

}}
