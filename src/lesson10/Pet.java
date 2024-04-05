package lesson10;
/*Создайте класс Pet, который является child классом класса Animal. При вызове его конструктора на экран должно
выводиться “I am Pet” и переменной eyes должно придаться значение 2. Также в класс Pet добавить переменные name
и tail, tail должен равняться 1. Также создать поле paw, которое будет равно 4. Создать метод run, который выведет
на экран сообщение “Pet runs” и метод jump, который выведет “Pet jumps”.
 */
// Class Pet, inheriting from Animal class
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
