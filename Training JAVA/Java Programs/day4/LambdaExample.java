package day4;


interface Operation {
    int solve(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;

       
        Operation add = (x, y) -> x + y;
        Operation subtract = (x, y) -> x - y;
        Operation multiply = (x, y) -> x * y;
        Operation divide = (x, y) ->  x / y ;

        System.out.println("Addition: " + add.solve(a, b));
        System.out.println("Subtraction: " + subtract.solve(a, b));
        System.out.println("Multiplication: " + multiply.solve(a, b));
        System.out.println("Division: " + divide.solve(a, b));
    }
}
