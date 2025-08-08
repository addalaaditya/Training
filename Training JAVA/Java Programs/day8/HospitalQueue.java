package day8;
import java.util.LinkedList;
import java.util.Scanner;

public class HospitalQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Hospital Queue Menu ===");
            System.out.println("1. Add Patient (Normal)");
            System.out.println("2. Add Patient (Emergency)");
            System.out.println("3. Remove Patient (Treated)");
            System.out.println("4. View All Patients");
            System.out.println("5. View First and Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine().trim();
                    if (!name.isEmpty()) {
                        queue.addLast(name);
                        System.out.println("Patient added normally.");
                    } else {
                        System.out.println("Name cannot be empty.");
                    }
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergency = sc.nextLine().trim();
                    if (!emergency.isEmpty()) {
                        queue.addFirst(emergency);
                        System.out.println("Emergency patient added to front.");
                    } else {
                        System.out.println("Name cannot be empty.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        String removed = queue.removeFirst();
                        System.out.println("Patient removed: " + removed);
                    } else {
                        System.out.println("No patients in the queue.");
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("All Patients in Queue:");
                        for (String patient : queue) {
                            System.out.println("- " + patient);
                        }
                    }
                    break;

                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("First Patient: " + queue.getFirst());
                        System.out.println("Last Patient: " + queue.getLast());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }

        } while (choice != 6);

        sc.close();
    }
}
