package day3;

public class Main1 {
	
	    public static void main(String[] args) {
	        Payment p1 = new CreditCardPayment();
	        Payment p2 = new UPIPayment();

	        p1.makePayment();
	        p2.makePayment();
	    }
	}


