import java.util.Scanner;

public class functions {

    // 1. Sum of two numbers
    static void sumOfTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    // 2. Check even or odd
    static void checkEvenOdd(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    // 3. Factorial
    static void factorial(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    // 4. Reverse a string
    static void reverseString(Scanner sc) {
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }

    // 5. Maximum in array
    static void maxInArray(Scanner sc) {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum value = " + max);
    }

    // 6. Check palindrome
    static void checkPalindrome(Scanner sc) {
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");
    }

    // 7. Check prime
    static void checkPrime(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not a Prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is NOT Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0; // initialized to avoid compile error

        do {
            System.out.println("\n1. sum of 2 numbers:");
            System.out.println("2. even or odd:");
            System.out.println("3. factorial:");
            System.out.println("4. reverse a string:");
            System.out.println("5. maximum in array:");
            System.out.println("6. check palindrome:");
            System.out.println("7. check prime:");
            System.out.println("8. exit:");
            System.out.print("Enter your choice: ");

            // Validate that the input is a number
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                sc.nextLine(); // clear wrong input
                continue;      // back to menu
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1: sumOfTwoNumbers(sc); break;
                case 2: checkEvenOdd(sc); break;
                case 3: factorial(sc); break;
                case 4: reverseString(sc); break;
                case 5: maxInArray(sc); break;
                case 6: checkPalindrome(sc); break;
                case 7: checkPrime(sc); break;
                case 8: System.out.println("Exiting... Goodbye!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}

