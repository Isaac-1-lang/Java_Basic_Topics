package Exams.intensives;


class T1 {
    public void one() {
        int x;
        x=10;
        System.out.println(x);
    }
}
public class Tries extends T1 {
    public void one() {
        int x;
        x=20;
        System.out.println(x);
    }
    public static void main(String[] args) {
        T1 t = new Tries();
        t.one();
    }

}



class Hi<T extends Number> {
    T t;
}
