package day4;

public class Main {
    public static void main(String[] args) {
        PatientService service = new PatientServiceImpl();

        Patient p1 = new Patient(1, "ABC", 28, " Cold");
        Patient p2 = new Patient(2, "XYZ", 60, "Heart Disease");

        service.registerPatient(p1);
        service.registerPatient(p2);

        service.showPatientDetails(1);
        service.showPatientDetails(2);

        Doctor generalDoc = new GeneralPhysician("Dr. Smith");
        Doctor cardioDoc = new Cardiologist("Dr. Warner");

        generalDoc.diagnose(p1);
        generalDoc.diagnose(p2);
        cardioDoc.diagnose(p1);
        cardioDoc.diagnose(p2);
        
        
    }
}
