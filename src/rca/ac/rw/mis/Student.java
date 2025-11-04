package rca.ac.rw.mis;
public class Student  extends Person{
    private String grade;
    private String school;
    private String combination;
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return combination;
    }
    public void setCombination(String combination) {
        this.combination = combination;
    }
    @Override
    public String toString() {
        return "Student [grade=" + grade + ", school=" + school + ", combination=" + combination + ", age=" + age
                + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}



