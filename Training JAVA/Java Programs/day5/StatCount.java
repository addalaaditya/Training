package day5;

public class StatCount {


	    static int count = 0;

	    void increment() {
	        count++;  
	    }

	    static void displayCount() {
	        System.out.println("Count is: " + count);
	    }

	    public static void main(String[] args) {
	    	StatCount c1 = new StatCount();
	    	StatCount c2 = new StatCount();

	        c1.increment();
	        c2.increment();
	        c1.increment();

	        StatCount.displayCount();
	    }
	

}
