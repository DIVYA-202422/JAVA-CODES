import java.util.Scanner;

class array_sum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n= scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
               System.out.print("enter element: ");
               arr[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
               sum = sum+ arr[i];
        }
System.out.println("sum of input array:"+sum);
}
}