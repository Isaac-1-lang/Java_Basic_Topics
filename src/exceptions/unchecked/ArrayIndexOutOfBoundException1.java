package exceptions.unchecked;

public class ArrayIndexOutOfBoundException1 {
    Integer[] numbers = {12,34,45,67,890,12};

    void result() {
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound"+ e);
        }
    }
    public static void main(String[] args) {
        ArrayIndexOutOfBoundException1 obj = new ArrayIndexOutOfBoundException1();
        obj.result();
    }
}
