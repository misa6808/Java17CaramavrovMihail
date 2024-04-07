package lesson11.inner_package;
import lesson11.Bus;
import lesson11.Car;
import lesson11.Transport;

public class ManageTransport {
    public static void main(String[] args){
        Transport myTransport = new Car();

        myTransport.printInfo();
        myTransport.go();
        ((Car) myTransport).calculateDistance();
    }
}
