package exceptions.checked;

public class ThrowProgram {
    public static void printStringLength(String str) throws NullPointerException {
        if(str == null) throw new NullPointerException();
        else
            System.out.println(str.length());

    }
    public static void main(String[] args) {
        try {

            printStringLength(null);
            printStringLength("Isaac");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}


class Main {
    public static void main(String[] args) {}
}