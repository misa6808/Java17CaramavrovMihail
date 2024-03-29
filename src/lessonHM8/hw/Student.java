package lessonHM8.hw;

public class Student {
    String name;
    int age;
    float averageMark;
    Student(){
        name = "Misa";
        age = 23;
        averageMark = 8.6F;
    }
    Student(String nume, int virsta, float media){
        this.name = nume;
        this.age = virsta;
        this.averageMark = media;
    }
    Student(Student clon){
        name = clon.name;
        age = clon.age;
        averageMark = clon.averageMark;
    }
    public static void printStudent(Student object){
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.averageMark);

    }
    public static void checkMark(Student newStudent){
        if(newStudent.averageMark>5){
            System.out.println("You are great student!!!");
        }
        else{
            System.out.println("Wasted!");
        }
    }
 public static void main(String[] args) {
        Student Misa = new Student();
        Student badStudent= new Student("Vasea",23,4);
        Cocktail cocktail = new Cocktail();
printStudent(Misa);
checkMark(badStudent);
Cocktail.tuffAlchool(cocktail);


}
}
