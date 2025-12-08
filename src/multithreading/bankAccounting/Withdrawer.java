package multithreading.bankAccounting;
import java.util.Random;

public class Withdrawer extends Thread {

    private final BankAccount account;
    private final Random random = new Random();

    public Withdrawer(BankAccount account,String name) {
        super(name);
        this.account = account;
    }
    @Override
    public void run() {
        while(!isInterrupted()) {
            int amt = 10 + random.nextInt(71);
            account.withdraw(amt);


            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                break;
            }
        }
    }
}
