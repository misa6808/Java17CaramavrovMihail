package lesson12.books;



//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.В цикле пройти по массиву и вызвать метод print()
//для каждого объекта.Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит
// на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия
// только книг. Используем оператор instanceof.
public class Magazine implements Printable {
    private String name;
    private String editors;
    private int popularity;

    public Magazine(String name, String editors, int popularity) {
        this.name = name;
        this.editors = editors;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditors() {
        return editors;
    }

    public void setEditors(String editors) {
        this.editors = editors;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void print() {
        System.out.print("Magazine name:" + name);
        System.out.print(" Editor:" + editors);
        System.out.println("  Popularity mark::" + popularity);
    }

    public static void printMagazines(Printable[] printable) {
        for(var prt : printable){
            if(prt instanceof Magazine){
                prt.print();
            }
        }
    }
}






