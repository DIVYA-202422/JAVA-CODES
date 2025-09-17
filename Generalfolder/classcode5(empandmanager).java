import java.util.Scanner;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 101, "IT");
        m1.displayDetails();
        System.out.println("Divya, 24csu357");
    }
}
