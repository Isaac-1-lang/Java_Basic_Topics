package exceptions.unchecked;

class ClassCastException1 {
    void classCast() {
        Object string = "Hello";
        try {
            Integer num1 = (Integer) string;
            System.out.println("Casting is possible with this data type");
        } catch (ClassCastException e) {
            System.out.println("Casting not possible" + e.getLocalizedMessage());
        }
    }
    public static void main(String[] args) {
           ClassCastException1 obj = new ClassCastException1();
           obj.classCast();
    }
}
