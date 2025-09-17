import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Pyramid
        System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }

        // Left Triangle
        System.out.println("\nLeft Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Right Triangle
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Rhombus
        System.out.println("\nRhombus:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= n; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("Divya:24csu357");
    }
}
