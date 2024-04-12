package lesson12;
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.В цикле пройти по массиву и вызвать метод print()
//для каждого объекта.Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит
// на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия
// только книг. Используем оператор instanceof.
//------------------------------------
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
//Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента, который должен выводить
//строку "Играет такой-то инструмент, с такими-то характеристиками".
import lesson12.books.Book;
import lesson12.books.Magazine;
import lesson12.books.Printable;
import lesson12.orchestra.Drum;
import lesson12.orchestra.Guitar;
import lesson12.orchestra.Instrument;
import lesson12.orchestra.Trumpet;

public class Main {
    public static void main(String[] args) {
        Printable[] arr = new Printable[4];
        arr[0]= new Magazine("times","tom",5);
        arr[1]= new Book("Ion","Liviu Rebreanu",77);
        arr[2]= new Magazine("Alunelul","Adevar",9);
        arr[3]= new Book("Padurea spinzuratilor","Liviu Rebreanu",77);
        for (var prt:arr
             ) {
            prt.print();
        }
        System.out.println("Today for us will play greatest orchestra with instruments:");
        Instrument[] orchestra = new Instrument[6];
        orchestra[0]= new Drum("5");
        orchestra[1]= new Trumpet(5.5f);
        orchestra[2] = new Guitar(6);
        orchestra[3]= new Drum("6");
        orchestra[4]= new Trumpet(5.8f);
        orchestra[5] = new Guitar(12);
        for (var prt:orchestra
             ) {
            prt.play();
        }
    }
}
