package multithreading.bankAccounting;

enum days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
        }
enum gender {
    Male,Female;
}
class Counter {
    private int count=0;
    public void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

public class Interference {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(()-> {
            for(int i=0;i<1_000_000;i++) c.increment();
        });


        Thread t2 = new Thread(()-> {
            for(int i=0;i<1_000_000;i++) c.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.getCount());
        days d1 = days.SUNDAY;

        System.out.println(d1.name());
        System.out.println(d1.ordinal());
    }
}
