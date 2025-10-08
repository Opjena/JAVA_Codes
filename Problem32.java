// Problem 32: Demonstrate polymorphism by creating an array of Person references, where some refer to Person objects and others to Student objects. Call displayInfo() on each.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    String major;

    Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }
}

public class Problem32 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 30);
        people[1] = new Student("Bob", 20, "S123", "Math");
        people[2] = new Person("Charlie", 25);

        for (Person p : people) {
            p.displayInfo();
            System.out.println();
        }
    }
}
