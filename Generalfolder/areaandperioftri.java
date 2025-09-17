import java.util.Scanner;

class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    double getPerimeter() {
        return a + b + c;
    }

    double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    System.out.println("Divya:24csu357");
    }
}
