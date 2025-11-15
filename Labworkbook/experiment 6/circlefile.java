import java.util.Scanner;
class Circle implements GeometricObject {
    protected double radius = 1.0;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement interface methods
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
