package Exams;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = Thread.currentThread();
//        Thread t2 = Thread.currentThread();
//        System.out.println("Current Thread: " + t1);
//        t1.setName("Main Thread");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Changed name to :" + t1);
//        Person p1 = new Person();
//        p1.start();
//        p1.run();
//        try {
//
//            for(int i=0;i<10;i++) {
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//        } catch(InterruptedException e){
//            System.out.println("Interrupted");
//        }
//        Counter counter1 = new Counter();
//        counter1.setName("Counter 1: ");
//        counter1.start();
//        Counter counter2 = new Counter();
//        counter2.setName("Counter 2: ");
//        counter2.start();
//        Printer p1 = new Printer("Printer-1: ");
//        Printer p2 = new Printer("Printer-2: ");
//        Thread t1 = new Thread(new Printer("Printer-1: "));
//        Thread t2 = new Thread(new Printer("Printer-2: "));
//        t1.start();
//        t2.start();
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(100);
        t1.join();
        t1.interrupt();

    }
}


//class Person extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Hello From thread!");
//    }
//
//}


class Counter extends  Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(getName() + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + "Interrupted");
            }
        }
    }
}


class Printer implements Runnable {
    private String name;

    Printer(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(name + "printing " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name + "Interrupted");
            }
        }
    }
}


class MyThread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(getName() + "printing " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + "Interrupted");
            }
        }
    }
}
