package lesson17;

class Car {
    private String name;
    private String color;
    private int fuelLevel;

    public Car(String name, String color, int fuelLevel) {
        this.name = name;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public void drive(int distance) throws NotFuelException {
        if (fuelLevel == 0) {
            throw new NotFuelException(fuelLevel);
        }
        System.out.println("Driving " + distance + " km...");
        fuelLevel -= distance;
    }

    public void safetyBelt(String beltStatus) throws NotBeltException {
        if (beltStatus.equals("Not Belt")) {
            throw new NotBeltException("Please fasten your seatbelt!");
        }
        System.out.println("Car is running safely...");
    }
    public int getFuelLevel() {
        return fuelLevel;
    }

    public static void main(String[]args){
        Car car = new Car("Lada", "red", 50);
        try {
            car.drive(100); // Едем 100 км
            car.safetyBelt("Not Belt"); // Не пристегнули ремень
        } catch (NotFuelException e) {
            System.out.println("Не хватает топлива: " + e.getMessage());
        } catch (NotBeltException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Уровень топлива: " + car.getFuelLevel());
        }
    }
}