package exceptions.unchecked;

class NullPointerException1 {
    String name=null;
    void result() {
        try {
            System.out.println("Result: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Length is not available "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
        NullPointerException1 npe = new NullPointerException1();
        npe.result();
    }
}
