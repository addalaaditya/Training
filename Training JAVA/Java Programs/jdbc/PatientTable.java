package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PatientTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Hospital", "root", "12345678");

            System.out.println("Choose option:");
            System.out.println("1. Add patients");
            System.out.println("2. Delete a patient by name");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                
                String insertSql = "INSERT INTO patient1(NAME, AGE, DISEASE, ADM_DATE, DOCTOR_ASSI) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement insertStmt = con.prepareStatement(insertSql);

                System.out.print("How many patients do you want to add? ");
                int count = scanner.nextInt();
                scanner.nextLine(); 

                for (int i = 1; i <= count; i++) {
                    System.out.println("\nEnter details for patient" + i);

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Disease: ");
                    String disease = scanner.nextLine();

                    System.out.print("Admission Date (YYYY-MM-DD): ");
                    String dateStr = scanner.nextLine();
                    Date admissionDate = Date.valueOf(dateStr);

                    System.out.print("Doctor Assigned: ");
                    String doctor = scanner.nextLine();

                    insertStmt.setString(1, name);
                    insertStmt.setInt(2, age);
                    insertStmt.setString(3, disease);
                    insertStmt.setDate(4, admissionDate);
                    insertStmt.setString(5, doctor);

                    int rowsInserted = insertStmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Patient inserted successfully.");
                    }
                }
            } else if (choice == 2) {

                System.out.print("Enter the name of the patient to delete: ");
                String nameToDelete = scanner.nextLine();

                String deleteSql = "DELETE FROM patient1 WHERE NAME = ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteSql);
                deleteStmt.setString(1, nameToDelete);

                int rowsDeleted = deleteStmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Patient '" + nameToDelete + "' deleted successfully.");
                } else {
                    System.out.println("No patient found with the name '" + nameToDelete + "'.");
                }
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }          
            con.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
