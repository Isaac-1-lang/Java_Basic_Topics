package counters;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {
            int taskNumber = i;
            pool.submit(() -> {
                System.out.println("Task " + taskNumber + " started by " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println("Task " + taskNumber + " finished by " + Thread.currentThread().getName());
            });
        }

        // Shutdown the pool
        pool.shutdown();
    }
}

