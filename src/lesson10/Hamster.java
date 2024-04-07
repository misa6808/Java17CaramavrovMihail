package lesson10;
/*Создать класс Hamster, который является Child классом Pet. При вызове его конструктора с параметром с полем
 name должно выводиться сообщение “I am a hamster and my name is:” + name. Добавить метод sleep, который выводит
  на экран “Hamster is sleeping”*/
// Class Hamster, inheriting from Pet class

class Hamster extends Pet {
    public Hamster(String name) {

        super(name);

        System.out.println("I am a hamster and my name is: " + getName());
    }

    public void sleep() {
        System.out.println("Hamster is sleeping");
    }
}



