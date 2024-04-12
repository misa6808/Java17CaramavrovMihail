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

    Magazine() {
        name = "The Times";
        editors = "Oliver Moody";
        popularity = 9;
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
        System.out.println("Magazine name:" + name);
        System.out.println("Editor:" + editors);
        System.out.println("Popularity mark::" + popularity);
    }

    public static void printMagazines(Printable[] printable) {
        Magazine magazine = new Magazine();
        System.out.println("Magazine name:" + magazine.name);
        System.out.println("Editor:" + magazine.editors);
        System.out.println("Popularity mark::" + magazine.popularity);
    }

    public static void main(String[] args) {
        Printable[] arr = new Printable[6];
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = new Book();
            arr[i + 1] = new Magazine();
            // arr[i].print();
            // arr[i+1].print();
        }


        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] instanceof Magazine) {
                System.out.println("This is a book");
                Magazine.printMagazines(arr);

            } else {
                System.out.println("This is a book");
                Book.printBooks(arr);

            }
        }

    }
}






