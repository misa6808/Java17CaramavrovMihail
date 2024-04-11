package lesson12.instruments;
//      Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//      Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
//      Создать массив типа Инструмент, содержащий инструменты разного типа.
//      В цикле вызвать метод play() для каждого инструмента, который должен выводить
//      строку "Играет такой-то инструмент, с такими-то характеристиками".
public class Trumpet implements Instrument{
    private final float diameter;
    Trumpet(){

        diameter = 5.5f;
    }

    public float getDiameter() {
        return diameter;
    }



    @Override
    public void play() {
        System.out.println("Play trumpet with dieameter "+diameter);

    }
    public static void main(String [] args){
        System.out.println("Today for us will play greatest orchestra with instruments:");
        Instrument [] orchestra = new Instrument[9];
        for (int i =0;i<orchestra.length;i+=3){
            (orchestra[i] = new Trumpet()).play();
            (orchestra[i+1]= new Drum()).play();
            (orchestra[i+2] = new Guitar()).play();
        }
        System.out.println("Thanks!!!");
    }
}
