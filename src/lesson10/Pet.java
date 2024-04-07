package lesson10;
/*Создайте класс Pet, который является child классом класса Animal. При вызове его конструктора на экран должно
выводиться “I am Pet” и переменной eyes должно придаться значение 2. Также в класс Pet добавить переменные name
и tail, tail должен равняться 1. Также создать поле paw, которое будет равно 4. Создать метод run, который выведет
на экран сообщение “Pet runs” и метод jump, который выведет “Pet jumps”.
 */
// Class Pet, inheriting from Animal class
class Pet extends Animal {
    private String name;
    private int tail=1;

    private final int paw = 4;

    public Pet(String name) {
        super();

        this.name = name;
    }
    public Pet() {
        super(2);
        System.out.println("I am Pet");



    }

    public int getPaw() {
        return paw;
    }

    public int getTail() {
        return tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }


    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}
