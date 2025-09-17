import java.util.Scanner;

class Circle {
    double radius;
    double findArea() {
        return 3.14 * radius * radius;
    }

    void displayArea() {
        double area = findArea();
        System.out.println("Area of Circle with radius " + radius + " = " + area);
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2;
        c.displayArea();
    }
}
