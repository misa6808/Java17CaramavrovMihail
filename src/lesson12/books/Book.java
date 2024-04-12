package lesson12.books;
//Определить класс Book, реализующий интерфейс Printable.
public class Book implements Printable {
    private String name;
    private String author ;
    private int nrOfPage;

    public Book(String name, String author, int nrOfPage) {
        this.name = name;
        this.author = author;
        this.nrOfPage = nrOfPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrOfPage() {
        return nrOfPage;
    }

    public void setNrOfPage(int nrOfPage) {
        this.nrOfPage = nrOfPage;
    }

    public void print() {
        System.out.print("Name:"+name);
        System.out.print(" Author:"+author);
        System.out.println(" Pages:"+nrOfPage);
    }

    public static void printBooks(Printable[] printable) {
            for(var prt : printable){
                if(prt instanceof Book){
                    prt.print();
                }
            }
        }
}

