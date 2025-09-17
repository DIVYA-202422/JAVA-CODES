import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        Box b = new Box();
        b.setDim(w, h, d);

        System.out.println("Volume of Box = " + b.volume());

        sc.close();
    }
}

//hw make a class recurssion.. take no. and strin input ,make methos : factorial, febonaci, reverse a string, id palandrome, 

