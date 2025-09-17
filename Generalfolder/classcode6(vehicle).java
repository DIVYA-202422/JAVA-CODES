import java.util.Scanner;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called. Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
        System.out.println("Car constructor called. Model: " + model);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla");
        System.out.println("Divya, 24csu357");
    }
}
