public class return1 {
    int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        return1 r = new return1();
        int c=r.sum(15, 15);
        int d=r.sum(15, 20);
       System.out.println(c);
       System.out.println(d);
    }
}
