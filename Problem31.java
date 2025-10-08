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

public class Problem31 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "S12345", "Computer Science");
        student.displayInfo();
    }
}
