import java.util.Scanner;
interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class Demo implements B {
    public void showA() {
        System.out.println("Interface A extended by B");
    }
    public void showB() {
        System.out.println("Interface B implemented in Demo class");
    }
}

class InterfaceExtend {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.showA();
        d.showB();
        System.out.println("Divya, 24csu357");
    }
}
