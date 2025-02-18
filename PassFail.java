import java.util.Scanner;

public class PassFail {
   String pf(int i)
   {
    if (i<35)
    {
      return "FAIL";
    }
    else
    {
      return "PASS";
    }
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the Mark : ");
      int i = scan.nextInt();
      PassFail o = new PassFail();
      String d=o.pf(i);
      System.out.println(d);
      scan.close();
   } 
}
