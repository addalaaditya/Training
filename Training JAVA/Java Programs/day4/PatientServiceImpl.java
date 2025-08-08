package day4;

class PatientServiceImpl implements PatientService {
    private Patient[] patients = new Patient[100];  
    private int count = 0;  
    
    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count] = patient;
            count++;
            System.out.println("Patient registered successfully.");
        } else {
            System.out.println("full.");
        }
    }
    public void showPatientDetails(int patientId) {
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == patientId) {
                patients[i].displayDetails();
                return;
            }
        }
        System.out.println("Patient not found with ID: " + patientId);
    }
}
