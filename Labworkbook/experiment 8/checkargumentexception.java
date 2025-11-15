import java.util.Scanner;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

class CheckArgumentExceptionDemo {
    public static void main(String[] args) {
   System.out.println("Divya 24csu357");
        try {
                        if (args.length < 5) {
                throw new CheckArgumentException("Error: Please enter 5 integer command line arguments!");
            }

            int sum = 0;

                        for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

                       System.out.println("Sum of the five numbers: " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only integer values.");
        }
    }
}