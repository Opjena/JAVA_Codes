class Car {
    String make;
    String model;
    int year;

    // Default constructor
    Car() {}

    // Parameterized constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

public class Problem27 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;
        System.out.println("Car1 - Make: " + car1.make + ", Model: " + car1.model + ", Year: " + car1.year);

        Car car2 = new Car("Honda", "Civic", 2019);
        System.out.println("Car2 - Make: " + car2.make + ", Model: " + car2.model + ", Year: " + car2.year);
    }
}
