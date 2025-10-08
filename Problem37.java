// Problem 37: Discuss method overriding. Provide an example where a subclass overrides a method from its superclass.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Problem37 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
