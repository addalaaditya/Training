package day6;

import java.util.Scanner;

public class LoginSystem {

    static final String user = "admin";
    static final String pass = "123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("username: ");
            String inputUser = sc.nextLine();

            System.out.print("password: ");
            String inputPass = sc.nextLine();

            if (!inputUser.equals(user) || !inputPass.equals(pass))
            {
                throw new Exception("Incorrect username or password");
            }

            System.out.println("Login successful");

        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        } finally {
            System.out.println("ended");
            sc.close();
        }
    }
}
