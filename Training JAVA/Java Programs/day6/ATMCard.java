package day6;
import java.util.Scanner;
class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

public class ATMCard {

    static final int CORRECT_PIN = 1234;

    static void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != CORRECT_PIN) {
            throw new InvalidPinException("Invalid PIN entered!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Insert ATM Card.....\n");
            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();

            validatePin(pin);
            System.out.println("PIN verified! Access granted");
            System.out.println("You can proceed with withdrawal or options.");
            
        }
        catch (InvalidPinException e) {
            System.out.println("Access Denied: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction session ended. Please remove your card.");
        }

        sc.close();
    }
}
