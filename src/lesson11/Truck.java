package lesson11;

public class Truck extends Transport{
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("This is a truck");
    }
    @Override
    public void go(){
        super.go();
        System.out.println("This truck can go");

    }
    public void calculateDistance(){
        int speed = 60;
        int time = 60;  // second
        int distance = time*speed;
        System.out.println("Distance that bus can do in 60 seconds: "+distance);

    }
    public void calculateDistance(int time){
        int distance = time * 90;
        System.out.println("The max distance is: "+ distance);


    }
}
