package ExamPractice.secondTask;
//Наследование Student, Aspirant
// а. Создайте пример наследования, реализуйте класс student И
//класс Aspirant , аспирант отличается от студента наличием некой научной работы.
//b. Класс student содержит переменные: String firstName , LastName , group . A
//также, double averageMark , содержащую среднюю оценку.
//с. Создать метоД getscholarship() для класса student , который возвращает сумму стипендии.
//Если средняя оценка студента равна 5, то сумма 1000 леев, иначе 900. Переопределить этот метод
//в классе Aspirant . Если средняя оценка аспиранта равна 5, то сумма 1500 леев, иначе 1200.
//d. Создать массив типа student , содержащий объекты класса Student И Aspirant . Вызвать МетоД
//getscholarship() для каждого элемента массива.
public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getscholarship(){
        int scholarship;
        System.out.println("New Student");
        if (averageMark ==5){
            scholarship = 1000;
        }
        else {
            scholarship = 900;
        }
        System.out.println(scholarship);
        return scholarship;
    }

    public static void main(String[] args) {
        Student [] arr = new Student[4];
        arr[0]= new Student("Ion","Rebreanu","I2101",7);
        arr[1] = new Aspirant("Nick","Singereanu","I2101SE",6,"Sistem Informational");
        arr[2]= new Student("Petru","Chirica","I2101",5);
        arr[3] = new Aspirant("Vladimir","Croitor","I2101SE",5,"Baza de date");
        for (var element:arr) {
          element.getscholarship() ;
        }
    }


}
