package rca.ac.rw.mis;
public class Person {
    protected int age;
    protected String firstName;
    protected String lastName;

    public Person() {}
    public Person(int age,String firstName, String lastName) {
        this.age=age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return this.firstName+" "
                + this.lastName+ " is "+ this.age+ " Years old";
    }

}


