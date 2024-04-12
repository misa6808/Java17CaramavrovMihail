package lesson12.orchestra;
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
    public class Guitar implements Instrument{
        private int nrOfStrings;
        public Guitar(int nrOfStrings) {
            this.nrOfStrings = nrOfStrings;
        }
        public int getNrOfStrings() {
            return nrOfStrings;
        }
        @Override
        public void play() {
            System.out.println("Play guitar with "+nrOfStrings+" strings!!!");
        }
    }

