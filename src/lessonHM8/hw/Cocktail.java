package lessonHM8.hw;

public class Cocktail {
    float alchool;
    String fruit;
    String anotherOne;
    float gramaj;
    Cocktail(){
        alchool= 39f;
        fruit="tomato";
        anotherOne="water";
        gramaj = 100f;

    }
    public static void tuffAlchool(Cocktail cocktail){
        if(cocktail.alchool>40){
            System.out.println("This cocktail is so tuff!!");}
            else{
                System.out.println("Easy!!!");
            }

    }
}
