package day2;

public class sbuc1 {
	

	    public static void main(String[] args) {
	        StringBuilder receipt = new StringBuilder();  

	        receipt.append("Receipt\n");                 
	        receipt.append("Customer: aditya\n");        
	        receipt.append("Items:\n");                  
	        receipt.append("1. bread = 55\n");           
	        receipt.append("2. coffee = 655\n");
	        receipt.append("3. apples = 155\n");
	        receipt.append("Total = 865\n");            
	        receipt.append("Thank you for shopping\n");  

	        receipt.insert(0, "****** Welcome to Our Store ******\n\n");

	        int startIndex = receipt.indexOf("aditya");
	        int endIndex = startIndex + "aditya".length();
	        receipt.replace(startIndex, endIndex, "ADITYA");

	        

	        System.out.println(receipt.toString());
	    }
	


}
