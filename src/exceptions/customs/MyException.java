package exceptions.customs;

public class MyException extends Exception {
   private String message;
   public MyException(String message) {
       super(message);
   }
   public String toString() {
       return "MyException[" + message + "]";
   }
}


class ExceptionDemo {
    static  void compute(int a) throws MyException {
        System.out.println("Called compute(" + a+")");
        if(a>10) {
            throw new MyException("Number is above 10");
        }
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        try {
             compute(10);
//             compute(11);
             compute(12);   // if it reaches here and found not executing then no any other next wul be executed.
             compute(30);
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
