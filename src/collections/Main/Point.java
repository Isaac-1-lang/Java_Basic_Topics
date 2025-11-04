package collections.Main;
import java.lang.Integer;

public class Point<Integer> {
    protected double x;
    protected double y;
}


class Main {
    public static void main(String[] args) {
        Point<Integer> p1 = new Point<>();
        p1.x = 100;
        p1.y = 100;
        System.out.println(p1.x+","+p1.y);
        Point<Double> p2= new Point<>();
        p2.x= 12.0;
        p2.y=12.0;
        System.out.println(p2.x+","+p2.y);
    }
}
