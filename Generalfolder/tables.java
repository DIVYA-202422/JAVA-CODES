import java.util.Scanner;

class tables{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("enter number: ");
 int input = scan.nextInt();
 for(int i=1; i<=10; i++){
 int ans = i*input;
System.out.println(input+ "*" + i + "=" + ans);
}
}
}
