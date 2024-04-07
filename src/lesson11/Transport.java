package lesson11;
//Cоздайте абстрактный класс Transport и переопределите метод printInfo() и go() в трех разных подклассах.
//        Например: Car, Truck, Plane ... extends Transport
//В этом классе перегрузите метод calculateDistance(), который может принимать либо сразу
//        дистанцию int dist, либо принимать (скорость, время) и результат будет dist = v * s
public abstract class Transport {
  public void printInfo(){
        System.out.println("My transport:");
    };
  public abstract    void go();

}
