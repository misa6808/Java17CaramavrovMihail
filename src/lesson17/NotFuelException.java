package lesson17;

class NotFuelException extends RuntimeException {
    public NotFuelException(int fuelLevel) {
        super("Not enough fuel: " + fuelLevel);
    }
}
