// Problem 39: Write a program to demonstrate the use of the super keyword to call a superclass constructor and a superclass method.

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    Child() {
        super(); // call parent constructor
        System.out.println("Child constructor");
    }

    void display() {
        super.display(); // call parent method
        System.out.println("Child display");
    }
}

public class Problem39 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
