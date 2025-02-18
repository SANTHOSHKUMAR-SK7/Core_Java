public class function1 {
    void getchocolate(int money)
    {
        System.out.println(money);
        System.out.println("chocolate purchased");
    }
    void getdrink(int money)
    {
        System.out.println(money);
        System.out.println("Drink purchased");
    }
    public static void main(String[] args) {
        function1 f = new function1();
        f.getchocolate(10);
        f.getdrink(20);
    }
}
