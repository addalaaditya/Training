package day3;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck is starting...");
    }

    public void stop() {
        System.out.println("Truck has stopped.");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();
        v.stop();

        System.out.println();

        v = new Bike();
        v.start();
        v.stop();

        System.out.println();

        v = new Truck();
        v.start();
        v.stop();
    }
}
