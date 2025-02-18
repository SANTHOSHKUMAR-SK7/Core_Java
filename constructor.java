public class constructor {
    int i;
    String c;
    constructor()
    {
        System.out.println("When we create an object,Thz constructor will automatically called");
    }
    public static void main(String[] args) {
        constructor c = new constructor();//When we create thz automatically consturctor will create out of main function
        System.out.println(c.i);//OP will be 0 bcz,Constructor defaultly set as 0
        System.out.println(c.c);//op will be NULL
    }
}
