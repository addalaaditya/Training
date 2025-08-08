package day11;
import java.io.*;

class Student implements Serializable {
    String name;
    int age;
}

public class DeSerial {
    public static void main(String[] args) {
        try {
            // Read object from file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\98668\\OneDrive\\Desktop\\test.txt"));
            Student s = (Student) in.readObject();
            in.close();

            System.out.println("Deserialized Student:");
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);

        } catch (IOException e) {
            System.out.println("An I/O error occurred during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found during deserialization.");
        }
    }
}
