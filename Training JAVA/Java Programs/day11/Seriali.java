package day11;
import java.io.*;
//Serializable 
class Person implements Serializable {
 private static final long serialVersionUID = 1L;
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}
public class Seriali {
 public static void main(String[] args) {
     
     Person person = new Person("Aditya", 23);

     // Serialize object
     try {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
         oos.writeObject(person);
         oos.close();
         System.out.println("Serialization done.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialize object
     try {
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
         Person deserializedPerson = (Person) ois.readObject();
         ois.close();
         System.out.println("Deserialization done.");
         System.out.println("Name: " + deserializedPerson.name);
         System.out.println("Age: " + deserializedPerson.age);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
