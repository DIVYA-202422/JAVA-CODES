import java.util.Scanner;
//ques 2
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary(); 
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 101, 30000);
        Employee e2 = new PartTimeEmployee("Bob", 102, 40, 500);

        System.out.println(e1.name + "'s Salary: " + e1.calculateSalary());
        System.out.println(e2.name + "'s Salary: " + e2.calculateSalary());
        System.out.println("Divya, 24csu357");
    }
}
