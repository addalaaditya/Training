package day10;
import java.io.*;
import java.util.Scanner;

class Patient {
    String id;
    String name;
    String disease;
    int age;

    public Patient(String id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + disease + "," + age;
    }

    public static Patient fromString(String data) {
        String[] parts = data.split(",");
        if (parts.length != 4) return null;
        return new Patient(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
    }
}

public class PatientApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        Patient patient = new Patient(id, name, disease, age);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\98668\\OneDrive\\Desktop\\test.txt", true))) {
            bw.write(patient.toString());
            bw.newLine();
            System.out.println("Patient saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }

        System.out.println("\nAll Patient Records:");
        try (BufferedReader br = new BufferedReader(new FileReader("patients.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Patient p = Patient.fromString(line);
                if (p != null) {
                    System.out.println("ID: " + p.id + ", Name: " + p.name +
                            ", Disease: " + p.disease + ", Age: " + p.age);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        sc.close();
    }
}
