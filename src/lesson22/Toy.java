package lesson22;

import java.util.HashMap;
import java.util.Map;

public class Toy {
     int weight;
     String color;
     double price;
    @Override
    public String toString() {
        return "Toy{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public Toy(int weight, String color, double price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }
    public static void printEntries(Map<String,Toy> map){
        System.out.println("--------entries-------");
        for(Map.Entry<String,Toy> entry : map.entrySet()){
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
    }
    public static void printValues(Map<String,Toy> map){
        System.out.println("--------values-------");
        for(Toy toy : map.values()){
            System.out.println(toy);
        }
    }
    public static void printKeys(Map<String,Toy> map){
        System.out.println("--------keys-------");
        for(String key : map.keySet()){
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        Map<String,Toy> map = new HashMap<>();
        map.put("Barbie",new Toy(100,"red",100));
        map.put("Cinderella",new Toy(90,"green",90));
        map.put("Alice",new Toy(60,"blue",95));
        map.put("Aprile",new Toy(85,"red",80));
        printEntries(map);
        printValues(map);
        printKeys(map);
    }


}
