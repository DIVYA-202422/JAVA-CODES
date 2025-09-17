import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        long a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.println(a + (i == terms ? "" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Divya:24csu357");
    }
}
