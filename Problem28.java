class Car {
    String make;
    String model;
    int year;

    Car() {}

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class Problem28 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;
        car1.displayInfo();

        Car car2 = new Car("Honda", "Civic", 2019);
        car2.displayInfo();
    }
}
