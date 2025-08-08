package day2;
import java.util.Scanner;

public class c1 {
	    int balance = 0;
	    void deposit(int amount) {
	        balance += amount;
	        System.out.println("Deposited:" + amount);
	        System.out.println("New Balance:" + balance);
	    }

	    void withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew:" + amount);
	            System.out.println("New Balance:" + balance);
	        } 
	        else {
	            System.out.println("Not enough balance!");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        c1 obj = new c1(); 

	        System.out.print("amount to deposit: ");
	        int dep = sc.nextInt();
	        obj.deposit(dep);

	        System.out.print("amount to withdraw: ");
	        int wd = sc.nextInt();
	        obj.withdraw(wd);

	    }
	

}
