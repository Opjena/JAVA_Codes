// Problem 41: Design an abstract class Employee with name, id, and an abstract method calculateSalary(). Create FullTimeEmployee and PartTimeEmployee subclasses, each with their own salary calculation logic.

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Problem41 {
    public static void main(String[] args) {
        Employee ft = new FullTimeEmployee("John", 1, 5000);
        Employee pt = new PartTimeEmployee("Jane", 2, 20, 160);

        System.out.println("Full time salary: " + ft.calculateSalary());
        System.out.println("Part time salary: " + pt.calculateSalary());
    }
}
