import java.util.Random;
public class whileloop{
    public static void main(String[] args) 
    {
        Random r=new Random();
        int i=0;
        int count=0;
        while(i!=7)
        {
            i=r.nextInt(10);
            System.out.println(i);
            count=count+1;
        }
        System.out.println("Total Excution :"+count);
}
}