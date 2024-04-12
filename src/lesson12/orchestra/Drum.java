package lesson12.orchestra;
// Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
    public class Drum implements Instrument{
        private String size ;
        public Drum(String size) {
            this.size = size;
        }
        public String getSize() {
            return size;
        }
        @Override
        public void play() {
            System.out.println("Play drums and size of this drums is " +size);
        }
    }


