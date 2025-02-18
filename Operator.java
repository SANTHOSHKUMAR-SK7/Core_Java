import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;

        //Arthematic Operator
        System.out.println("The value of a is "+a+" and b is "+b );
        int c = a+b;
        int d = a-b;
        int e = a*b;
        float f = a/b; //Ans will be 0.0 bcz a and b is in int data type.So System will automatically converted into float.Rhz is called implicit conversion
        float F = (float) a/ (float) b; // Now the ans will be 0.7,bcz we converted tht int into float.Thz is called explicit
        int g = a%b;
        System.out.println("ADDITION : "+c);
        System.out.println("SUBTRACTION : "+d);
        System.out.println("MULTIPLICATION : "+e);
        System.out.println("DIVISION :(implicit) "+f);
        System.out.println("DIVISION :(explicit) "+F);
        System.out.println("MODULOUS : "+g);

        //UNARY OPERTOR
        System.out.println("The value of a is "+a+" and b is "+b );
        System.out.println("a++ ="+a++);// Thz will first print the value and do increment
        System.out.println("a = "+a);
        System.out.println("++a ="+ ++a);//Thz will first do increment and print the value
        System.out.println("a = "+a);
        System.out.println("b-- ="+ b--);//print and decrement
        System.out.println("b = "+b);
        System.out.println("--b = "+ --b);// decrement and print
        System.out.println("b = " +b);

        //RELATIONAL OPERATOR
        boolean A = true;
        boolean B = false;
        System.out.println(A||B); //OR operator
        System.out.println(A && B); //AND operator
        System.out.println(!A); //NOT operator
        int C = 10;
        int D = 15;
        System.out.println( C > D);
        System.out.println( C < D);
        System.out.println( C == D);



    }
}
