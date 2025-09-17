import java.util.Scanner;
class shapedemo {
    public static void main(String[] args) {
        System.out.println("Divya, 24csu357");

        // Create object of Square
        Square s = new Square();

        // Call methods of parent classes using Square object
        s.printShape();
        s.printRectangle();
        s.printSquare();
    }
}

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}


