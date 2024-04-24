package lesson17;
//Создайте 2 исключения. Первое будет являтся дочерним классом класса RuntimeException и в нем создайте конструктор,
// который принимает 1 параметр int и передает его в конструктор super класса. Первое исключение называется
// NotFuelException.
class NotFuelException extends RuntimeException {
    public NotFuelException(int fuelLevel) {
        super("Not enough fuel: " + fuelLevel);

    }
}