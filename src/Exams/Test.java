package Exams;

class Test1 {
    static int count = 0;
    Test1() {
        count++;
    }
    public static void main(String[] args) {

        Test1 t1 = new Test1();
        System.out.println(t1.count);
        Test1 t2 = new Test1();
        System.out.println(count);
    }
}
