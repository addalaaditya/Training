package day3;

public class Main2 {
	    public static void main(String[] args) {
	        Notification n1 = new Email();
	        Notification n2 = new SMS();
	        Notification n3 = new Push();

	        n1.sendNotification();
	        n2.sendNotification();
	        n3.sendNotification();
	    }
	


}
