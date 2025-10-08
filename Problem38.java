// Problem 38: Create a class Counter with a static variable count initialized to 0. Increment count in the constructor. Demonstrate that count keeps track of the number of objects created.

public class Problem38 {
    static int count = 0;

    Problem38() {
        count++;
    }

    public static void main(String[] args) {
        new Problem38();
        new Problem38();
        new Problem38();
        System.out.println("Number of objects created: " + count);
    }
}
