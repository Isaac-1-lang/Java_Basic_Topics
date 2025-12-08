package multithreading.bankAccounting;
public class UnsafeCountExample {

    static int count = 0; // shared variable

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                count++;   // NOT ATOMIC — unsafe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + count);
    }
}
