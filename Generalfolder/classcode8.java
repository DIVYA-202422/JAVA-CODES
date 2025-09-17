import java.util.Scanner;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
        System.out.println("Divya, 24csu357");
    }
}