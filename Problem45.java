// Problem 45: Implement a singleton design pattern for a Logger class, ensuring only one instance of the class can be created.

class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class Problem45 {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message");
        System.out.println("Same instance: " + (logger1 == logger2));
    }
}
