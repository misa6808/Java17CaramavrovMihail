package lesson12.orchestra;
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
//Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента, который должен выводить
//строку "Играет такой-то инструмент, с такими-то характеристиками".
    public class Trumpet implements Instrument{
        private float diameter;
        public Trumpet(float diameter) {
            this.diameter = diameter;
        }
        public float getDiameter() {
            return diameter;
        }
        @Override
        public void play() {
            System.out.println("Play trumpet with dieameter "+diameter);
        }
    }


