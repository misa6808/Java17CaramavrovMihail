package lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//Создайте коллекцию Set с типом элементов String. Добавьте в неё  11 строк: арбуз, банан, вишня, груша,
// дыня, ежевика, женьшень, земляника, ирис, картофель, арбуз. После этого выведем содержимое коллекции
// на экран, параллельно наблюдая за порядком добавленных
//*Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
public class Homework15 {
    public static <String>Collection<String> validateSet(Collection<String> set){
        Set<String> set1 = new HashSet<>();
        set1.addAll(set);
        return set1;
    }

   public static void main(String[] args) {
        // Создание коллекции Set типа String
        Set<String> fruits = new HashSet<>();
        // Добавление 11 элементов в коллекцию
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("женьшень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");
        fruits.add("арбуз"); // Дубликат

        System.out.println(fruits);

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Allj");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Ravi");
        list.add("Allj");
        list.add("Rav");
        list.add("Ravi");
       System.out.println(validateSet(list));

    }

}

