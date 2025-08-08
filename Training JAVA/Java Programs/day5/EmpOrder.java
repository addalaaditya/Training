package day5;

import java.util.Arrays;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name +" "+ salary;
    }
}

public class EmpOrder {
    public static void main(String[] args) {

    	Employee[] employees = {
            new Employee("A", 70000),
            new Employee("B", 50000),
            new Employee("C", 60000)
        };

        
        Arrays.sort(employees, (a, b) -> Double.compare(a.salary, b.salary));

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
