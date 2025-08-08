package day3;
//overloading compile time
public class comPoly {

    public void print(String text) {
        System.out.println("String: " + text);
    }

    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    public void print(double number) {
        System.out.println("Double: " + number);
    }

    public static void main(String[] args) {
        comPoly p = new comPoly();

        p.print("Hello");
        p.print(100);
        p.print(3.14);
    }
}
