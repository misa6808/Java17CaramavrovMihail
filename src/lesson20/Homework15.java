package lesson20;

import java.util.HashSet;
import java.util.Set;

//Создайте коллекцию Set с типом элементов String. Добавьте в неё  11 строк: арбуз, банан, вишня, груша,
// дыня, ежевика, женьшень, земляника, ирис, картофель, арбуз. После этого выведем содержимое коллекции
// на экран, параллельно наблюдая за порядком добавленных
//*Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
public class Homework15 {



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

        // Вывод содержимого коллекции на экран
        System.out.println("Содержимое коллекции:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

