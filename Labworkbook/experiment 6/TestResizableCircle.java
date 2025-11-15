import java.util.Scanner;
class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10.0);

        System.out.println("Original radius area: " + rc.getArea());
        System.out.println("Original perimeter: " + rc.getPerimeter());

        rc.resize(50); // reduce size to 50%
        System.out.println("After resize (50%):");
        System.out.println("New radius area: " + rc.getArea());
        System.out.println("New perimeter: " + rc.getPerimeter());
        System.out.println("Divya, 24csu357");
    }
}
