package day3;

	abstract class Shape {
	    abstract void area();
	}

	class Circle extends Shape {
	    void area() {
	        System.out.println("Area of Circle = π × r²");
	    }
	}

	class Rectangle extends Shape {
	    void area() {
	        System.out.println("Area of Rectangle = length × width");
	    }
	


}
