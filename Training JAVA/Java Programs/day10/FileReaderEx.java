package day10;
import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        String fileName = "test.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\98668\\OneDrive\\Desktop\\test.txt"))) {
            String line;

            System.out.println("Contents of the file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
