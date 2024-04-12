package lesson12.books;



//Определить класс Book, реализующий интерфейс Printable.
public class Book implements Printable {
    private String name;
    private String author ;
    private int nrOfPage;
    Book(){
        author = "Sherlock Holmes";
        name = "Sir Arthur Conan-Doyle";
        nrOfPage = 500;
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
        System.out.println("Name:"+name);
        System.out.println("Author:"+author);
        System.out.println("Pages:"+nrOfPage);
    }
    public static void printBooks(Printable[] printable){
        Book book = new Book();
        System.out.println("Magazine name:"+book.name);
        System.out.println("Editor:"+book.author);
        System.out.println("Popularity mark::"+book.nrOfPage);
    }
}

