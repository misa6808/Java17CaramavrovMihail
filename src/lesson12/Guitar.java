package lesson12;


    //Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
    public class Guitar implements Instrument{
        private int nrOfStrings;
        Guitar(){
            nrOfStrings = 6;
        }

        public int getNrOfStrings() {
            return nrOfStrings;
        }

        public void setNrOfStrings(int nrOfStrings) {
            this.nrOfStrings = nrOfStrings;
        }

        @Override
        public void play() {
            System.out.println("Play guitar with "+nrOfStrings+" strings!!!");

        }
    }

