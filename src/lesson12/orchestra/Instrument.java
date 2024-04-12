package lesson12.orchestra;
//Интерфейс Инструмент
//        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//
    public interface Instrument {
        final String key = "Do major";
        void play();
    }

