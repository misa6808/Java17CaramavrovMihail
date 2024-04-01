package lesson9;

public class Person {
    private String name;
    private int age;
    private float height;
    Person(){
        name = "Misa";
        age = 23;
        height = 80;
    }
    Person(String name,int age,float height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public void setHeight(float height) {
        if(height>120&&height<220)

        {this.height = height;
        };
    }

    public float getHeight() {
        return height;
    }

    public void setAge(int age) {
        if (age<100&&age>0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        if(name.length()>3&&name.length()<15){
            this.name = name;
        }
    }
    public void printInfo(){
        System.out.println("Your name is "+ getName());
        System.out.println("Your age is "+ getAge());
        System.out.println("Your height is "+ getHeight());
    }
    public static void main(String[] args) {
        Person person = new Person("Vasea",22,55);
        person.printInfo();
    }
}
