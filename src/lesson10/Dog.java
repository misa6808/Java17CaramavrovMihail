package lesson10;
/*Создайте класс Dog, который является Child классом Pet. При вызове конструктора с параметром name, должно
выводиться сообщение “I am dog and my name is: ” + name. Добавить метод play, который будет выводить на экран
сообщение “Dog plays”*/
// Class Dog, inheriting from Pet class
class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + getName());
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
