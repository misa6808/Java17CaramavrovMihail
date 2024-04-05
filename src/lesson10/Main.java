package lesson10;
class Animal {
    int eyes;

    public Animal() {
        System.out.println("I am Animal");
        eyes = 2;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail;
    final int paw = 4;

    public Pet(String name) {
        super();
        System.out.println("I am Pet");
        this.name = name;
        this.tail = 1;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
        System.out.println("I am a hamster and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Hamster is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Saric");
        System.out.println("Number of paws of the dog: " + dog.paw);

        Hamster hamster = new Hamster("Bob");
        hamster.sleep();
    }
}
