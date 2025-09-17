import java.util.Scanner;
//ques 3
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow says: Moo Moo!");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal a : animals) {
            a.makeSound();
        }
    System.out.println("Divya, 24csu357");
    }
}
