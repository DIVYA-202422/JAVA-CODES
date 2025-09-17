import java.util.Scanner;

class Grandfather {
    void show() {
        System.out.println("I am Grandfather");
    }
}

class Father extends Grandfather {
    void display() {
        System.out.println("I am Father");
    }
}

class Son extends Father {
    void print() {
        System.out.println("I am Son");
    }
}

class FamilyTest {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.show();
        s1.display();
        s1.print();
        System.out.println("Divya, 24csu357");
    }
}
