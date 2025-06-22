package design;
public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("User logged in");

        Logger logger2 = Logger.getInstance();
        logger2.log("User uploaded a file");

        System.out.println("Are both instances same? " + (logger1 == logger2));
    }
}

