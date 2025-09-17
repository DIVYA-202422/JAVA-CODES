/*import java.util.Scanner;

class HelloWorld{

public static void main(String[] args){
    System.out.println("HELLO WORLD!");
}
}*/


/*import java.util.Scanner;

class HelloWorld{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("enter first number: ");
int a= scan.nextInt();
System.out.println("enter second number: ");
int b= scan.nextInt();
int sum=a+b;
System.out.println("sum of a and b is: ");
System.out.println(sum);
}
}*/


import java.util.Scanner;

class percentage{

public static void main(String[] args){

Scanner scan=new.Scanner(System.in);
System.out.println("enter marks in subject 1:");
int a=scan.nextInt();
System.out.println("enter marks in subject 2:");
int b=scan.nextInt();
System.out.println("enter marks in subject 3:");
int c=scan.nextInt();
System.out.println("enter marks in subject 4:");
int d=scan.nextInt();
System.out.println("enter marks in subject 5:");
int e=scan.nextInt();
int sum=a+b+c+d+e;
System.out.print("Total marks in all 5 subjects:");
System.out.println(sum);
int percent=sum/5*100;
System.out.println("Your percentage is:");
System.out.println(percent);
}
}


