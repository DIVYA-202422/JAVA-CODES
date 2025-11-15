import java.util.Scanner;
class ExceptionHandlingDemo {
    public static void main(String[] args) {
    System.out.println("DIVYA 24CSU357");
        try {
                throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
        } finally {
                 System.out.println("Finally block executed successfully.");
        }
    }
}