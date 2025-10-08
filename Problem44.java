// Problem 44: Write a program to demonstrate final keywords with variables, methods, and classes. Explain their purpose.

final class FinalClass {
    final int finalVar = 10;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

// The following class would cause a compile error because FinalClass is final and cannot be extended.
// class SubClass extends FinalClass {}

public class Problem44 {
    public static void main(String[] args) {
        final int finalVariable = 100;
        System.out.println("Final variable value: " + finalVariable);

        FinalClass fc = new FinalClass();
        fc.finalMethod();
    }
}
