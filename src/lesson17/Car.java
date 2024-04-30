package lesson17;
//Создать класс Car. Создать аттрибуты name, color и fuelLevel. Первый метод drive будет иметь тип данных void
// и параметр int. Если данный  параметр равен нулю, то пусть выбрасывается исключение NotFuelException.
// Второй метод safetyBelt пусть принимает String и если в строке будет значение "Not Belt", то пусть
// выбрасывается NotBeltException. Если нет, то пусть выводит сообщение "Car is running".
class Car  {
    private String name;
    private String color;
    private int fuelLevel;

    public Car(String name, String color, int fuelLevel) {
        this.name = name;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public void drive(int distance) throws NotFuelException {
        for (int i = 0; i <distance ; i++) {
            fuelLevel--;
        if (fuelLevel == 0) {
            throw new NotFuelException(fuelLevel);
        }
    }
        System.out.println("Driving " + distance + " km...");
        }
    public void safetyBelt(String beltStatus) throws NotBeltException {
        if (beltStatus.equals("Not Belt")) {
            throw new NotBeltException("Please fasten your seatbelt!");
        }
        System.out.println("Car is running safely...");
    }

    // Added function to get current fuel level
    public int getFuelLevel() {
        return fuelLevel;
    }

    public static void main(String[] args) {
        Car car = new Car("Lada", "red", 50);

        try {
            car.drive(49); // Едем 100 км
            car.safetyBelt("Not Belt"); // Едем 100 км
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Final fuel level: " + car.getFuelLevel());
        }
    }
}