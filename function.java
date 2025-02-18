public class function {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        else
        {
            System.out.println(a/b);
        }
    }
    void mod(int a,int b)
    {
        System.out.println(a%b);
    }
    public static void main(String[] args) {
        function f = new function();
        f.sum(20,30);
        f.sub(10,10);
        f.mul(12, 10);
        f.div(2, 0);
        f.mod(12, 2);
    }
}
