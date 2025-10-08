public class Problem24 {
    public static void main(String[] args) {
        // Implicit casting
        int i = 10;
        double d = i; // int to double
        System.out.println("Implicit casting: int " + i + " to double " + d);

        // Explicit casting
        double d2 = 10.5;
        int i2 = (int) d2; // double to int
        System.out.println("Explicit casting: double " + d2 + " to int " + i2);
    }
}
