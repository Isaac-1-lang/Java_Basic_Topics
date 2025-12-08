package Exams;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class CounterWithLock implements Runnable {
    int count = 0;
    Lock lock = new ReentrantLock(); // Create a lock
    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock(); // release lock in finally to avoid deadlocks
        }
    }


    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            increment();
        }
    }
}





class Counter11 implements Runnable {
    int count = 0; // shared variable

    // synchronized increment to prevent interference
    public synchronized void increment() {
        count++;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            increment();
        }
    }
}

public class Interference {
    public static void main(String[] args) throws InterruptedException {
        Counter11 counter = new Counter11(); // shared counter

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t1.start();
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish

        System.out.println("Final count: " + counter.count);


        CounterWithLock counter12 = new CounterWithLock();


        Thread t4 =  new Thread(counter12,"Thread-1: ");
        Thread t5 = new Thread(counter12,"Thread-2: ");

        t4.start();
        t5.start();
        t4.join();
        t5.join();
        System.out.println("Final count: " + counter12.count);
    }
}
