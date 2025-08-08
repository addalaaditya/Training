package day3;
//single
class Employee {
    String name;
    String role;

    void setEmployeeDetails(String n, String r) {
        name = n;
        role = r;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}

class Developer extends Employee {
    String language;

    void setDeveloperDetails(String n, String r, String lang) {
        setEmployeeDetails(n, r);
        language = lang;
    }

    void displayDeveloperInfo() {
        displayInfo();
        System.out.println("Language: " + language);
    }
}

public class Employ {
    public static void main(String[] args) {
        Developer person = new Developer();
        person.setDeveloperDetails("Alice", "Developer", "Java");
        person.displayDeveloperInfo();
    }
}
