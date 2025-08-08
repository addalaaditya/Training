package day9;
import java.util.HashMap;
import java.util.Scanner;

public class PatientSystem {
    public static void main(String[] args) {
        HashMap<Integer, String> patients = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Patient Management ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Update Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Count Patients");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    if (patients.containsKey(id)) {
                        System.out.println("Patient ID already exists.");
                    } else {
                        System.out.print("Enter Patient Name: ");
                        String name = sc.nextLine();
                        patients.put(id, name); // Add using put()
                        System.out.println("Patient added.");
                    }
                    break;

                case 2: 
                    System.out.print("Enter Patient ID to remove: ");
                    int removeId = sc.nextInt();
                    if (patients.remove(removeId) != null) { 
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter Patient ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 
                    if (patients.containsKey(updateId)) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        patients.put(updateId, newName); 
                        System.out.println("Patient updated.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4: 
                    System.out.println("\n--- Patient List ---");
                    for (Integer key : patients.keySet()) { 
                        System.out.println("ID: " + key + ", Name: " + patients.get(key));
                    }
                    break;

                case 5: 
                    System.out.println("Total Patients: " + patients.size());
                    break;

                case 6: 
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } 
        while (choice != 6);

        sc.close();
    }
}
