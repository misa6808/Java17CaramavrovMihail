package lesson12.instruments;
// Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
public class Drum implements Instrument{
    private String size ;

    Drum(){
        size = "medium";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play drums and size of this drums is " +size);
    }
}
