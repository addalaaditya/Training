package day7;

import java.util.Scanner;

public class FormValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();
        try {
            int age = Integer.parseInt(ageInput);
            if (age <= 0) {
                System.out.println("Age must be a positive number.");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
        }

        System.out.print("Enter your salary: ");
        String salaryInput = scanner.nextLine();
        try {
            double salary = Double.parseDouble(salaryInput);
            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
            } else {
                System.out.println("Valid salary: " + salary);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for salary. Please enter a valid decimal number.");
        }

    }
}
