import java.util.Scanner;

 class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();


        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        System.out.println("Index of " + num + ": " + index);
        sc.close();
         System.out.println("shaksham:2csu189");
    }
}

