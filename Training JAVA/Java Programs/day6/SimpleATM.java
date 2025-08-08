package day6;
import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}
public class SimpleATM {
    static String[] accountNumbers = {"1001", "1002", "1003"};
    static int[] pins = {1234, 1111, 2222};
    static int[] balances = {5000, 3000, 7000};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account number: ");
            String acc = sc.nextLine();

            int index = findIndex(acc);
            if (index == -1) {
                System.out.println("Account not found.");
                return;
            }
            boolean valid = false;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter PIN: ");
                int pin = sc.nextInt();
                if (pin == pins[index]) {
                    valid = true;
                    break;
                } else {
                    System.out.println("Wrong PIN. Attempt " + i + "/3");
                }
            }
            if (!valid) {
                throw new InvalidPinException("3 wrong PIN attempts. Card blocked.");
            }
            int choice;
            do {
                System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
                System.out.print("Choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + balances[index]);
                        break;
                    case 2:
                        System.out.print("Amount to deposit: ");
                        balances[index] += sc.nextInt();
                        break;
                    case 3:
                        System.out.print("Amount to withdraw: ");
                        int amount = sc.nextInt();
                        if (amount <= balances[index]) {
                            balances[index] -= amount;
                        } else {
                            System.out.println("Not enough balance.");
                        }
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);

        } catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error.");
        } finally {
            System.out.println("Session ended.");
            sc.close();
        }
    }
    static int findIndex(String acc) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i].equals(acc)) return i;
        }
        return -1;
    }
}
