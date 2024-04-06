package lesson10;
// Main class
/*Создать класс Main, в методе main вывести количество лап объекта Dog и вызвать метод sleep класса Hamste*/
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------");
        Dog dog = new Dog("Saric");
        System.out.println("Number of paws of the dog: " + dog.getPaw());

        Hamster hamster = new Hamster("Bob");
        hamster.sleep();

    }
}