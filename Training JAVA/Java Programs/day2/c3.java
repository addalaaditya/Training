package day2;
import java.util.*;

public class c3 {

	    String title;
	    String author;
	    double price;

	    void inputDetails() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Book Title: ");
	        title = sc.nextLine();
	        System.out.print("Author Name: ");
	        author = sc.nextLine();
	        System.out.print("Book Price: ");
	        price = sc.nextDouble();
	    }

	    void displayDetails() {
	        System.out.println("Book Details");
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        c3 b = new c3();

	        b.inputDetails();
	        b.displayDetails();
	    }
	

}
