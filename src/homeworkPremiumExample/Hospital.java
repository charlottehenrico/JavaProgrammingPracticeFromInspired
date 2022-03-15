package homeworkPremiumExample;

public class Hospital extends Premium {
	int numberOfBeds;
	int numberOfWards;
	boolean hasAdmissionWard;
	String patientName;
	int patientAge;

	public void completeHospitalForms() {
		System.out.println("Please complete all required forms");
	}
	
		//Create a constructor for patient details
		public Hospital (int ageOfPatient, String nameOfPatient) {
		patientAge = ageOfPatient;
		patientName = nameOfPatient;
		}

		public Hospital() {
			// TODO Auto-generated constructor stub
		}
		
//		//private = restricted access
//		private String patientIllness;
//		
//		//Getter
//		public String getIllness() {
//			return patientIllness;
//		}
//		
//		//Setter
//		public void setIllness(String newIllness) {
//			this.patientIllness = newIllness;
//		}
		

	}

