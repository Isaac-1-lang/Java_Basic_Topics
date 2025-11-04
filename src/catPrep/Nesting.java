package catPrep;

public class Nesting {
    public static class Inner {
        public static void printMe() {
            System.out.println("Inner printMe");
        }
    }
    Nesting.Inner.printMe()
}
