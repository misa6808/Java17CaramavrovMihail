package lesson10;
// Main class
/*Создать класс Main, в методе main вывести количество лап объекта Dog и вызвать метод sleep класса Hamste*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Saric");
        System.out.println("Number of paws of the dog: " + dog.paw);

        Hamster hamster = new Hamster("Bob");
        hamster.sleep();
    }
}