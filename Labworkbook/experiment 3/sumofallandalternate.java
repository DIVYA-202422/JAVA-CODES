import java.util.Scanner;

class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sumall = 0;
        int sumalternate = 0;

        for (int i = 0; i < n; i++) {
            sumall += arr[i];
            if (i % 2 == 0) { // alternate elements (0th, 2nd, 4th...)
                sumalternate += arr[i];
            }
        }

        System.out.println("Sum of all elements: " + sumall);
        System.out.println("Sum of alternate elements: " + sumalternate);
        System.out.println("Divya:24csu357");
    }
}
