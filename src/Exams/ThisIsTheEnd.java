package Exams;



class Master {
    public String s;
    public int i;
    Master() {
        this("Isaac", 12);
    }
    public Master(String s,int i) {
        this.s=s;
        this.i=i;
    }
}


class Builder {
    int x,y;

    public Builder setX(int x){
        this.x=x;
        return this;
    }
    public Builder setY(int y){
        this.y=y;
        return this;
    }
}



class Test {
    int x;
    public int counter() {
        return x++;
    }
}
public class ThisIsTheEnd {
    public static void main(String[] args) {

        Builder b = new Builder();
        b.setX(10);
//        System.out.println(b.x + " " + b.y);

        Test t1 = new Test();
        System.out.println(t1.x);
        System.out.println(t1.counter());
        System.out.println(t1.x);
        Test t2 = new Test();
        System.out.println(t2.x);
        System.out.println(t2.counter());
    }
}
