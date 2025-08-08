package day8;
import java.util.*;
class Patient {
    int id;
    String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class PatientRegistration {
    public static void main(String[] args) {
        LinkedList<Patient> patientList = new LinkedList<>();
        HashSet<Integer> registeredIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHospital Registration Menu");
            System.out.println("1. Register New Patient");
            System.out.println("2. View Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
           
            
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Patient ID (integer): ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("Enter Patient Name: ");
                        String name = sc.nextLine().trim();

                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }

                        if (registeredIds.contains(id)) {
                            System.out.println("Patient with ID " + id + " is already registered.");
                        } else {
                            Patient newPatient = new Patient(id, name);
                            patientList.add(newPatient);
                            registeredIds.add(id);
                            System.out.println("Patient registered successfully.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid integer.");
                    }
                    break;

                case 2:
                    if (patientList.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Patient p : patientList) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exit registration system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
