package day4;

class GeneralPhysician extends Doctor {
    public GeneralPhysician(String name) {
        super(name, "General Physician");
    }

   
    public void diagnose(Patient patient) {
        System.out.println("Dr. " + name + " (General): Diagnosing " + patient.getName() + " for " + patient.getIllness());
    }
}

class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name, "Cardiologist");
    }

   
    public void diagnose(Patient patient) {
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Dr. " + name + " (Cardiologist): Specialized treatment for " + patient.getIllness());
        } else {
            System.out.println("Dr. " + name + " (Cardiologist): Illness not heart-related. Recommending general physician.");
        }
    }
}
