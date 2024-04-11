package lesson12.instruments;
//Интерфейс Инструмент
//        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//

public interface Instrument {
    public String key = "Do major";
    public void play();
}
