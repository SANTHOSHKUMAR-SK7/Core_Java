import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter a number 2 : ");
        int num2 = in.nextInt();

        System.out.println("Addition : "+add(num1,num2));
        System.out.println("Subtraction : "+sub(num1,num2));
        System.out.println("Multiplication : "+mul(num1,num2));
        System.out.println("Division : "+div(num1,num2));
        System.out.println("Modulus : "+mod(num1,num2));

    }
    static int add(int a ,int b){
        return a+b;
    }

    static int sub(int a ,int b){
        return a-b;
    }

    static int mul(int a ,int b){
        return a*b;
    }

    static float div(int a ,int b){
        return (float) a /b;
    }

    static int mod(int a,int b){
        return a%b;
    }
}
