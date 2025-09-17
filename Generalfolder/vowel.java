import java.util.Scanner;

class vowel{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System .out.println("enter letter: ");
char input = scan.next().toLowerCase().charAt(0);
if(input == 'a' || input =='e' || input == 'i' || input == 'o' || input == 'u'){
System.out.println("entered character is a vowel");
}
else{
System.out.println("a consonant");
}
}
}
