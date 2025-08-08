package day7;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientSystem {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Show All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter patient name: ");
                String name = scanner.nextLine();
                patients.add(name);
                System.out.println("Patient added.");
            } else if (choice == 2) {
                System.out.println("Patient List:");
                for (String name : patients) {
                    System.out.println("- " + name);
                }
            } else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String name = scanner.nextLine();
                if (patients.contains(name)) {
                    System.out.println("Patient found: " + name);
                } else {
                    System.out.println("Patient not found.");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
