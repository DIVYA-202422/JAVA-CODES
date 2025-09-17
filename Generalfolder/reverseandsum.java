/*import java.util.Scanner;

class reverseandsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reverse = 0;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            number = number / 10;  
        }

        System.out.println("Reverse of " + originalNumber + " is: " + reverse);
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}*/


import java.util.Scanner;

class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number;

        int reverse = digit1 * 100 + digit2 * 10 + digit3;

        int sum = digit1 + digit2 + digit3;

        System.out.println("Reverse of " + originalNumber + " is: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Divya:24csu357");
        scanner.close();
    }
}

