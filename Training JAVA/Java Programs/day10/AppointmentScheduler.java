package day10;

import java.util.*;

public class AppointmentScheduler {
    public static void main(String[] args) {
        TreeMap<Integer, String> appointments = new TreeMap<>();

        appointments.put(1000, "a - 10:00 AM");
        appointments.put(1003, "b - 1:00 PM");
        appointments.put(1001, "c - 11:00 AM");
        appointments.put(1004, "d - 2:00 PM");
        appointments.put(1002, "e - 12:00 PM");

        System.out.println("All Scheduled Appointments:");
        for (Map.Entry<Integer, String> entry : appointments.entrySet()) 
        {
            System.out.println("ID " + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nRemoving appointment ");
        appointments.remove(1002);

        System.out.println("Rescheduling appointment 1001 to 1005...");
        String rescheduledPatient = appointments.remove(1001);
        appointments.put(1005, rescheduledPatient.replace("11:00 AM", "3:00 PM"));

        System.out.println("\nNext Appointment ID: " + appointments.firstKey() +
                           " → " + appointments.get(appointments.firstKey()));
        System.out.println("Last Appointment ID: " + appointments.lastKey() +
                           " → " + appointments.get(appointments.lastKey()));

        System.out.println("\nUpdated Appointment List:");
        for (Map.Entry<Integer, String> entry : appointments.entrySet()) {
            System.out.println("ID " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
