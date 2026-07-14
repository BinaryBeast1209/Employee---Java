abstract class Vehicle {

    abstract void displayType();

    public void start() {
        System.out.println("Vehicle is ready to start.");
    }
}

class Car extends Vehicle {

    @Override
    void displayType() {
        System.out.println("Vehicle type is Car.");
    }
}

class Bike extends Vehicle {

    @Override
    void displayType() {
        System.out.println("Vehicle type is Bike.");
    }
}

class Bus extends Vehicle {

    @Override
    void displayType() {
        System.out.println("Vehicle type is Bus.");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.displayType();

        vehicle = new Bike();
        vehicle.start();
        vehicle.displayType();

        vehicle = new Bus();
        vehicle.start();
        vehicle.displayType();
    }
}
