package day5;
//cons overloading changes in para ,same cons name
public class Student {
    String name;
    int age;

    Student() {
        name = "Aditya";
        age = 23;
    }

    Student(String n, int a) {
       this. name = n;
       this.age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student();                  
        Student s2 = new Student("Deva", 20);       

        s1.display();  
        s2.display();  
    }
}

