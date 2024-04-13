package ExamPractice.secondTask;

public class Aspirant extends Student{
    String individualWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark,String individualWork) {
        super(firstName, lastName, group, averageMark);
        this.individualWork = individualWork;
    }
    @Override
    public int getscholarship() {
        int scholarship;
        System.out.println("New Aspirant");
        if (averageMark ==5){
            scholarship = 1500;
        }
        else {
            scholarship = 1200;
        }
        System.out.println(scholarship);
        return scholarship;
    }
    }

