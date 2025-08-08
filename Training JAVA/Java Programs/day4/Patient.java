package day4;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getIllness() { return illness; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setIllness(String illness) { this.illness = illness; }

    public void displayDetails() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Illness   : " + illness);
    }
}

