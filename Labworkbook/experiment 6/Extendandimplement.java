import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class Dog extends Animal implements Pet, Wild {
    public void play() {
        System.out.println("Dog loves to play!");
    }

    public void hunt() {
        System.out.println("Dog hunts when needed!");
    }
}

class ExtendAndImplement {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.hunt();
        System.out.println("Divya, 24csu357");
    }
}
