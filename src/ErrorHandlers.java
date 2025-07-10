import java.io.*;
public class ErrorHandlers {
    public static void main(String[] args) {
        //  int x=10/0; // Unchecked:ArithmeticException
        String str=null;
        // System.out.println(str.length()); //Checked:NullPointerException
            BankAccount acc = new BankAccount();
            try {
                acc.withdraw(6000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message)  {
        super(message);
    }
}


class BankAccount {
    int balance = 5000;
    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

class FileUpload {
    public  static  void main(String[] args) {
        try {
            FileReader fr  =new FileReader("document.pdf");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}

