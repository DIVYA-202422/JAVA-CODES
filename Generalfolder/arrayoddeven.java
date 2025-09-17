import java.util.Scanner;  
class array_oddeven {  
    public static void main(String[] args) {  

        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter length of array: ");  
        int n = scan.nextInt();  

        int arr[] = new int[n];  

        for (int i = 0; i < n; i++) {  
            System.out.print("Enter element: ");  
            arr[i] = scan.nextInt();  
        }  

        System.out.print("Original array: ");  
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  

        int p = 0; // count even  
        int q = 0; // count odd  

        for (int i = 0; i < n; i++) {  
            if (arr[i] % 2 == 0) {  
                p++;  
            } else {  
                q++;  
            }  
        }  

        System.out.println("Number of even elements: " + p);  
        System.out.println("Number of odd elements: " + q);  

        int arr_even[] = new int[p];  
        int arr_odd[] = new int[q];  

        int a = 0, b = 0;  

        for (int i = 0; i < n; i++) {  
            if (arr[i] % 2 == 0) {  
                arr_even[a] = arr[i];  
                a++;  
            } else {  
                arr_odd[b] = arr[i];  
                b++;  
            }  
        }  
        System.out.println("Even array: ");  
        for (int j = 0; j < p; j++) {  
            System.out.print(arr_even[j] + " ");  
        }  
        System.out.println();  

        System.out.println("Odd array: ");  
        for (int j = 0; j < q; j++) {  
            System.out.print(arr_odd[j] + " ");  
        }  
        System.out.println();  
        scan.close(); 
        System.out.println("Divya:24csu357"); 
    }  
}  
