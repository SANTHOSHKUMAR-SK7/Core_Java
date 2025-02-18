public class thiskeyword {
    int i=7;
    void thi(int i)
    {
       this.i = i;
       System.out.println(i);
    }
    public static void main(String[] args) {
        thiskeyword t = new thiskeyword();
        t.thi(10);
        System.out.println(t.i);
    }
}
 