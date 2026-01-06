package Exams;

import org.w3c.dom.ls.LSOutput;

public class ExamCollection {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
    }

}

class A {
    int x=10;
}

class B extends A {
    int x=20;
}
