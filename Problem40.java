// Problem 40: Implement a class hierarchy: Vehicle -> TwoWheeler -> Motorcycle. Add appropriate methods and fields to each, demonstrating inheritance.

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle started");
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String brand) {
        super(brand);
    }

    void balance() {
        System.out.println("Two wheeler balanced");
    }
}

class Motorcycle extends TwoWheeler {
    Motorcycle(String brand) {
        super(brand);
    }

    void accelerate() {
        System.out.println("Motorcycle accelerating");
    }
}

public class Problem40 {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle("Honda");
        m.start();
        m.balance();
        m.accelerate();
    }
}
