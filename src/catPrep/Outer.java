package catPrep;

class Outer {
    int x = 10;
    class Inner {
        int x = 20;
        void print() {
            int x = 30;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }
    }
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.print();
    }
}

