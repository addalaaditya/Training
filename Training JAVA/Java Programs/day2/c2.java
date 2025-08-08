package day2;
import java.util.*;

public class c2 {
	    String name;
	    int age;
	    String department;

	    void inputdetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        age = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Department: ");
	        department = sc.nextLine();
	    }

	    void displaydetails() {
	    	System.out.println("details are:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Department: " + department);
	    }

	    public static void main(String[] args) {
	        c2 emp = new c2();

	        emp.inputdetails();
	        emp.displaydetails();
	    }
	


}
