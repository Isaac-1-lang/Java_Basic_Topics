package rca.ac.rw.mis;
public class Employee  extends Person{
    private String institution;
    private String position;
    private long salary;

    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [institution=" + institution + ", position=" + position + ", salary=" + salary + ", age=" + age+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}





