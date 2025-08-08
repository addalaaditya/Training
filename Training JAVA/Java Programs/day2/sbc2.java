package day2;

public class sbc2 {
	

	    public static void main(String[] args) {
	        StringBuffer profile = new StringBuffer();

	        profile.append("Employee Profile Report\n");
	        profile.append("Name: aditya\n");
	        profile.append("ID: 1024\n");
	        profile.append("Department: IT\n");
	        profile.append("Designation: Software Engineer\n");
	        profile.append("Salary: 75000\n");
	        profile.append("Status: Active\n");

	        profile.insert(0, "*****XYZ  Company  *****\n\n");

	        int nameStart = profile.indexOf("aditya");
	        int nameEnd = nameStart + "aditya".length();
	        profile.replace(nameStart, nameEnd, "ADITYA");
	        
	        int statusStart = profile.indexOf("Status:");
	        int statusEnd = profile.indexOf("\n", statusStart);
	        profile.delete(statusStart, statusEnd + 1);
	        
	        System.out.println(profile.toString());
	    }
	


}
