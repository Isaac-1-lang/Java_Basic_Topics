package Exams.studies;


public class Main {
    // Default thread
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is the default thread");

        Thread t1 = new Thread(new Person("One")); //
        Thread t2 = new Thread(new Person("Two"));
        Thread t3 = new Thread(new Person("Three"));
        Thread t4 = new Thread(new Person("Four"));
        Thread t5 = new Thread(new Person("Five"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();


        counter.start();
        counter2.start();
        counter3.start();
        counter4.start();
        counter.join();
        counter2.join();
        counter3.join();
        counter4.join();




    }


    // We can create other custom threads with using Runnable interface or using Thread class




}
