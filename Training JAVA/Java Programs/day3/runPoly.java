
package day3;

//overriding run time
	class MessageSender {
	    void sendMessage() {
	        System.out.println("message");
	    }
	}
	class EmailSender extends MessageSender {
	    
	    void sendMessage() {
	        System.out.println("Email");
	    }
	}
	class SMSSender extends MessageSender {
	    
	    void sendMessage() {
	        System.out.println("SMS");
	    }
	}
	public class runPoly {
	    public static void main(String[] args) {     
	        MessageSender sender1 = new EmailSender();   
	        sender1.sendMessage(); 
	        
	        MessageSender sender2 = new SMSSender();     
	        sender2.sendMessage();         
	    }
}

