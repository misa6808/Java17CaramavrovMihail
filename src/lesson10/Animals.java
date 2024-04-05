package lesson10;
/*Создайте класс Animal. При вызове его конструктора на экран должно выводиться «I am Animal».В классе создайте
переменную eyes и методы eat, который будет выводить “Animal eats" и drink, который будет выводить “Animal drinks”.*/
// Base class Animal, parent class that descript what can do our animal.
class Animal {
    public int eyes ;

    public Animal() {
        System.out.println("I am Animal");

    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

