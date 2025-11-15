import java.util.Scanner;

interface X {
    void showX();
}

interface Y {
    void showY();
}

interface Z extends X, Y {
    void showZ();
}

class Example implements Z {
    public void showX() {
        System.out.println("From Interface X");
    }
    public void showY() {
        System.out.println("From Interface Y");
    }
    public void showZ() {
        System.out.println("From Interface Z");
    }
}

class MultiInterfaceExtend {
    public static void main(String[] args) {
        Example e = new Example();
        e.showX();
        e.showY();
        e.showZ();
        System.out.println("Divya, 24csu357");
    }
}
