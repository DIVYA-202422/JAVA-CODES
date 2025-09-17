import java.util.Scanner;

class Point {
    private double x;
    private double y;
    Point() {
        x = 0.0;
        y = 0.0;
    }
    Point(double xValue, double yValue) {
        x = xValue;
        y = yValue;
    }
    public double getX() {
        return x;
    }
    public void setX(double xValue) {
        x = xValue;
    }
    public double getY() {
        return y;
    }
    public void setY(double yValue) {
        y = yValue;
    }
    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
 class Pointdis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p2 = new Point(x2, y2);
        System.out.println("First Point: ");
        p1.display();
        System.out.println("Second Point: ");
        p2.display();
        double dist = Point.distance(p1, p2);
        System.out.println("Distance between points = " + dist);
        sc.close();
        System.out.println("Divya:24csu357");
    }
}
