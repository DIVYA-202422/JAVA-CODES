import java.util.Scanner;
class ResizableCircle extends Circle implements Resizable {

    // Constructor using super keyword to call parent constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Override resize method from Resizable interface
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    // Override methods from Circle (optional, just to show overriding)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
