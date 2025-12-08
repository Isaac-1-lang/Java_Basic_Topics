package multithreading.bankAccounting;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static final int TOTAL_TRANSACTIONS =100;
    private static final int MAX_BALANCE = 500;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        BankAccount account = new BankAccount(MAX_BALANCE,counter,TOTAL_TRANSACTIONS);


        Depositor d1 = new Depositor(account,"NIYOBYOSE Isaac Precieux");
        Depositor d2 = new Depositor(account,"GIKUNDIRO Anitha");

        Withdrawer w1 = new Withdrawer(account,"NIYOBYOSE Isaac Precieux");
        Withdrawer w2 = new Withdrawer(account,"GIKUNDIRO Anitha");

        d1.start();d2.start();
        w1.start();w2.start();


        while(counter.get() < TOTAL_TRANSACTIONS) {
            Thread.sleep(50);
        }

        // Stop threads

        d1.interrupt();d2.interrupt();
        w1.interrupt();w2.interrupt();


        d1.join();d2.join();
        w1.join();w2.join();


        System.out.println("\n===== Finished "+ counter.get() + " Transactions ===\n");
    }
}
