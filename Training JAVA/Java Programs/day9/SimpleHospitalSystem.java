package day9;
/*✅ Use Case: Unique Doctor Registration in a Hospital System
🎯 Scenario:
In a hospital, doctors from various departments are registered with the hospital system. Each doctor has a unique license number (just like a unique ID).

The goal is to ensure that no doctor is registered more than once, even if their name or department is the same.
 
✅ Operations in the System:
1.Add a new doctor.
2.Prevent duplicate registration.
3.Display all registered doctors.
 */
import java.util.HashSet;
import java.util.Scanner;

class Doctor {
    String name;
    String department;
    String licenseNumber;

    Doctor(String name, String department, String licenseNumber) {
        this.name = name;
        this.department = department;
        this.licenseNumber = licenseNumber;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor d = (Doctor) o;
        return licenseNumber.equalsIgnoreCase(d.licenseNumber);
    }

    public int hashCode() {
        return licenseNumber.hashCode(); 
    } 
    public String toString() {
        return name + " , " + department + " , " + licenseNumber;
    }
}
public class SimpleHospitalSystem {
    public static void main(String[] args) {
    	
        HashSet<Doctor> doctors = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Doctor");
            System.out.println("2. Show All Doctors");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Department: ");
                String dept = sc.nextLine();
                System.out.print("License Number: ");
                String license = sc.nextLine();

                Doctor newDoc = new Doctor(name, dept, license);

                if (doctors.contains(newDoc)) {
                    System.out.println("Doctor already registered!");
                } else {
                    doctors.add(newDoc);
                    System.out.println("Doctor added!");
                }
            } 
            else if (choice == 2) {
            	
                if (doctors.isEmpty()) {
                    System.out.println("No doctors registered.");
                } else {
                    System.out.println("\nRegistered Doctors:");
                    for (Doctor d : doctors) {
                        System.out.println(d);
                    }
                }
            }
        } 
        while (choice != 3);

        System.out.println("Goodbye");
    }
}
