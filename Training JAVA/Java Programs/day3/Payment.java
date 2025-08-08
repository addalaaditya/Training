package day3;

	abstract class Payment {
	    abstract void makePayment();
	}

	class CreditCardPayment extends Payment {
	    
	    void makePayment() {
	        System.out.println("Payment made using Credit Card");
	    }
	}

	class UPIPayment extends Payment {
	    
	    void makePayment() {
	        System.out.println("Payment made using UPI");
	    }
	


}
