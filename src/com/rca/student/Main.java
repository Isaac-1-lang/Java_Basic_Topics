package com.rca.student;

import com.rca.student.model.StudentModel;

public class Main {
    public static void main(String[] args) {
        StudentModel s1 = new StudentModel("Isaac","Precieux", 20,1);
        StudentModel s2 = new StudentModel("Niyobyose","Isei", 21,2);
        System.out.println(s1);
        System.out.println(s2);
        s1.getFirstName();
        s1.getId();
        s1.getAge();
        s2.getLastName();
        s2.setLastName("Newton");
    }
}
