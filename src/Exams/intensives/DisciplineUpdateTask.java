package Exams.intensives;

public class DisciplineUpdateTask implements Runnable {


    private Student student;
    private int delta;
    private String staffName;


    public DisciplineUpdateTask(Student student,int delta,String staffName) {
        this.student = student;
        this.delta = delta;
        this.staffName = staffName;
    }
    @Override
    public void run() {
        System.out.println(staffName + " is updating " + student.name);
        student.updateScore(delta);
        System.out.println(staffName + " updated marks for " + student.name + " New score" + student.getScore());
    }
}
