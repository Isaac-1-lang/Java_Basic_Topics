package rca.ac.rw.mis;
public class Main {
    public static void main(String[] args) {
        // Create a Person
        Person peter=new Person(12, "NIYOBYOSE","Isaac");
        System.out.println(peter);
        // Create a Person of type Employee with a Default Constructor
        //Not Possible to set additional information of employee
        Person p1=new Employee();
        p1.setFirstName("Ntwali");
        p1.setLastName("Sasha");
        p1.setAge(18);
        System.out.println(p1);
        System.out.println(p1.getFirstName());
        //Create Employee, Now you can set all properties of employee
        Employee p2=new Employee();
        p2.setAge(18);
        p2.setFirstName("Mahoro");
        p2.setLastName("Dan");
        p2.setInstitution("RCA");
        p2.setSalary(120);
        p2.setPosition("Instructor");
        System.out.println(p2);
        System.out.println(p2.getFirstName());
        System.out.println(p2.getInstitution());
    }
}
