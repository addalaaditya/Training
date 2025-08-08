package day11;

import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Serial {
    public static void main(String[] args) {
        Student s = new Student("aditya", 23); // object

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\98668\\OneDrive\\Desktop\\test.txt")
            );
            out.writeObject(s);
            out.close();
            System.out.println("Object serialized to given file.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
        }
    }
}
