package day7;
import java.util.ArrayList;
import java.util.Scanner;

public class SimplePatientManager {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    patients.add(name);
                    System.out.println("Patient added.");
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        for (int i = 0; i < patients.size(); i++) {
                            System.out.println("[" + i + "] " + patients.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < patients.size()) {
                        System.out.println("Patient: " + patients.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (updateIndex >= 0 && updateIndex < patients.size()) {
                        System.out.print("Enter new patient name: ");
                        String newName = scanner.nextLine();
                        patients.set(updateIndex, newName);
                        System.out.println("Updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < patients.size()) {
                        patients.remove(removeIndex);
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    if (patients.remove(removeName)) {
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String checkName = scanner.nextLine();
                    System.out.println(patients.contains(checkName) ? "Exists." : "Not found.");
                    break;

                case 8:
                    System.out.println("Total patients: " + patients.size());
                    break;

                case 9:
                    patients.clear();
                    System.out.println("All records cleared.");
                    break;

                case 10:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    int first = patients.indexOf(searchName);
                    int last = patients.lastIndexOf(searchName);
                    if (first != -1) {
                        System.out.println("First index: " + first);
                        System.out.println("Last index: " + last);
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;

                case 11:
                    System.out.println(patients.isEmpty() ? "List is empty." : "List is not empty.");
                    break;

                case 12:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
