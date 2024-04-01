package lessonHM8.hw;

public class Cocktail {
    float alchool;
    String fruit;
    String anotherOne;
    float gramaj;
    Cocktail(){
        alchool= 42f;
        fruit="tomato";
        anotherOne="water";
        gramaj = 100f;

    }
    public  void tuffAlchool(){
        if(alchool>40){
            System.out.println("This cocktail is so tuff!!");}
            else{

                System.out.println("Easy!!!");
            }

    }
}
