package day9;
/*✅ Use Case: Manage Scheduled Appointments in Sorted Order
🎯 Scenario:
In a hospital system, patients book appointments. Each appointment has a date and time. The hospital wants to:
Maintain sorted appointments (by date/time).
Avoid duplicate appointment entries.
Display all appointments in chronological order.
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

class Appointment implements Comparable<Appointment> {
    String patientName;
    LocalDateTime dateTime;

    Appointment(String name, String dateTimeStr) {
        this.patientName = name;
        this.dateTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime); 
    }

    public String toString() {
        return dateTime + " - " + patientName;
    }
}

public class HospitalAppointments {
    public static void main(String[] args) {
        TreeSet<Appointment> appointments = new TreeSet<>();

        appointments.add(new Appointment("Alice", "2025-08-01 09:00"));
        appointments.add(new Appointment("Bob", "2025-08-01 10:00"));
        appointments.add(new Appointment("Charlie", "2025-08-01 11:00"));
        appointments.add(new Appointment("Alice", "2025-08-01 09:00")); 

        System.out.println("Appointments (Chronological Order):");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
