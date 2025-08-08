package day3;


	abstract class Notification {
	    abstract void sendNotification();
	}

	class Email extends Notification {
	    void sendNotification() {
	        System.out.println("Email sent");
	    }
	}

	class SMS extends Notification {
	    void sendNotification() {
	        System.out.println("SMS sent");
	    }
	}

	class Push extends Notification {
	    void sendNotification() {
	        System.out.println("Notification sent");
	    }
	

}
