import java.awt.*;

public class Reference_datatype {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        b=a;
        a = 77;
        System.out.println("The value of a : "+a);
        System.out.println("The value of b : "+b);
        Point p2 = new Point(4,5);
        Point p1 = p2;
        p2.x = 7;
        System.out.println("The value of p1 is : "+p1);
        System.out.println("The value of p2 is : "+p2);
    }
}