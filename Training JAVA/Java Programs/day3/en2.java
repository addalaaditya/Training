package day3;

public class en2 {
	
	    public static void main(String[] args) {
	    	
	        en1 emp = new en1(50000);

	        System.out.println("old Salary: " + emp.getSalary());

	        emp.setSalary(60000);
	        System.out.println("new Salary: " + emp.getSalary());
	        
	    }
}
