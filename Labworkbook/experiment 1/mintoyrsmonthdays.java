import java.util.Scanner;

class MinutesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        long minutes = scanner.nextLong();

        long Days = minutes / 1440;

        long years = Days / 365;
        long remainingDays = Days % 365;

        long months = remainingDays / 30;
        long days = remainingDays % 30;

        System.out.println("Equivalent time:");
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
        System.out.println("Divya:24csu357");
        scanner.close();
    }
}
