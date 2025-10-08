// Problem 33: Design an Animal abstract class with an abstract method makeSound(). Create concrete Dog and Cat classes that extend Animal and implement makeSound(). Demonstrate polymorphism.

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Problem33 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
