import java.util.Scanner;

class AddNumbers
{
   public static void main(String args[])
   {
    int a, b, sum;
    System.out.println("Enter two numbers");
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    b = scan.nextInt();
    sum = a + b;
    System.out.println("sum of a and b is " + sum + "program end");
}
}