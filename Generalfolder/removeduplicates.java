import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < n; i++) {
            boolean isduplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isduplicate = true;
                    break;
                }
            }
            if (!isduplicate) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Divya:24csu357");
    }
}
