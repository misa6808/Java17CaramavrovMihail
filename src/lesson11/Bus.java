package lesson11;

public class Bus extends Transport {
    @Override
    public void printInfo() {
    public void printInfo(){

        super.printInfo();

        System.out.println("This is a bus");
    }
    @Override
    public void go() {
        System.out.println("This bus can go");

    }

    public void calculateDistance() {
        int speed = 60;
        int time = 60;  // second
        int distance = time * speed;
        System.out.println("Distance that bus can do in 60 seconds: " + distance);
    }

    public void calculateDistance(int time) {
        int distance = time * 90;
        System.out.println("The max distance, if speed is 90km/h is: " + distance);
    }

    public static void main(String[] arg) {
        Transport myTransport = new Car();
        myTransport.printInfo();

      myTransport.calculateDistance(90);
      myTransport.calculateDistance();
        myTransport.calculateDistance(90);
        myTransport.calculateDistance();
        myTransport.go();

        ((Car) myTransport).calculateDistance(90);
        ((Car) myTransport).calculateDistance();



    }
}
