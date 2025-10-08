// Problem 35: Create an interface Flyable with a method fly(). Make a Bird class implement Flyable and a Plane class implement Flyable. Demonstrate interface usage.

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

public class Problem35 {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable plane = new Plane();

        bird.fly();
        plane.fly();
    }
}
