package day10;
import java.util.*;

public class Appointment {

    public static void main(String[] args) {
        TreeMap<Integer, String> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Appointment Scheduler ---");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. View Last Appointment");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Appointment ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    appointments.put(id, name);
                    System.out.println("Appointment added.");
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("📭 No appointments found.");
                    } else {
                        System.out.println("All Appointments:");
                        for (Map.Entry<Integer, String> entry : appointments.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Appointment ID to remove: ");
                    int removeId = sc.nextInt();
                    if (appointments.remove(removeId) != null) {
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("Appointment not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Old Appointment ID: ");
                    int oldId = sc.nextInt();
                    if (!appointments.containsKey(oldId)) {
                        System.out.println("Appointment ID not found.");
                        break;
                    }
                    System.out.print("Enter New Appointment ID: ");
                    int newId = sc.nextInt();
                    sc.nextLine();
                    String patient = appointments.remove(oldId);
                    appointments.put(newId, patient);
                    System.out.println("Appointment rescheduled.");
                    break;

                case 5:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        int lastId = appointments.lastKey();
                        System.out.println("Last Appointment: ID " + lastId + " -> " + appointments.get(lastId));
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
