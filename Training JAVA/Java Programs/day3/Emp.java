package day3;

class Main {
	
		    private String name;
		    private int id;
		    private double salary;

		    
		    public void setName(String n) {
		        name = n;
		    }

		    public void setId(int i) {
		        id = i;
		    }

		    public void setSalary(double s) {
		        salary = s;
		    }

		    
		    public String getName() {
		        return name;
		    }

		    public int getId() {
		        return id;
		    }

		    public double getSalary() {
		        return salary;
		    }
		}

		 class Emp {
		    public static void main(String[] args) {
		        Main obj = new Main();

		        obj.setName("rahul");
		        obj.setId(102);
		        obj.setSalary(45000.0);

		        System.out.println("Employee Details:");
		        System.out.println("Name: " + obj.getName());
		        System.out.println("ID: " + obj.getId());
		        System.out.println("Salary: " + obj.getSalary());
		    }
}
