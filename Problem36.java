// Problem 36: Discuss method overloading. Write a class with overloaded methods (e.g., add(int a, int b) and add(double a, double b)).

// Method overloading allows multiple methods with the same name but different parameters.

public class Problem36 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Int add: " + add(5, 3));
        System.out.println("Double add: " + add(5.5, 3.2));
    }
}
