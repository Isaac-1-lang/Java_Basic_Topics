package multithreading.bankAccounting;


import  java.util.concurrent.atomic.AtomicInteger;
public class BankAccount {
    private int balance = 0;
    private final int MAX_BALANCE;
    private final AtomicInteger totalTransactions;
    private final int LIMIT;

    public BankAccount(int maxBalance,AtomicInteger counter,int limit) {
        this.MAX_BALANCE=maxBalance;
        this.totalTransactions=counter;
        this.LIMIT=limit;
    }
    public synchronized void deposit(int amount) {
        while(balance+amount> MAX_BALANCE && totalTransactions.get() < LIMIT) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
            if (totalTransactions.get() == LIMIT) return;

            balance += amount;

            totalTransactions.incrementAndGet();
            System.out.println(Thread.currentThread().getName() + " | Deposit | +" + amount + " | Balance = " + balance);

            notifyAll();
    }
    public synchronized void withdraw(int amount){
            while(balance-amount < 0 && totalTransactions.get() < LIMIT) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }


                if(totalTransactions.get()>=LIMIT) return;

                balance -=amount;
                totalTransactions.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " Withdraw | -" + amount + " | Balance = " + balance);



                notifyAll();
            }
        }
    }

