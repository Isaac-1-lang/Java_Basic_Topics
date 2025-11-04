package catPrep;
class A {
    static int a;
    int b;
}
public class Two {
    public static void main(String[] args) {
       // Checked,Unchecked and Custom Exceptions
        int a=1;
        int b=0;


        try {
            System.out.println(a/b);
        } catch(ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
