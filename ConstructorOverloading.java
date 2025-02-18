public class ConstructorOverloading {
    int i;
    String s;
    ConstructorOverloading(int a,String b)
    {
        i=a;
        s=b;
    }
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(7077,"SK");
        System.out.println(obj.s);
        System.out.println(obj.i);
    }
}
 