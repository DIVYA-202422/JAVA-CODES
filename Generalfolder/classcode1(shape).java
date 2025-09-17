import java.util.Scanner;
// ques 1
abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

class widthcircle extends Shape {
    double radius;

    widthcircle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Main{
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 10);
        Shape s2 = new widthcircle(7);

        System.out.println("Area of Rectangle: " + s1.getArea());
        System.out.println("Area of Circle: " + s2.getArea());
        System.out.println("Divya, 24csu357");
    }
}
