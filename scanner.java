import java.util.*;
class scanner{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("This program is for getting int i/p nd String i/p from user");
    System.out.print("Enter a Number:");
    int i=scan.nextInt();
    scan.nextLine();
    System.out.print("Enter a String:");
    String s=scan.nextLine();
    System.out.println("Entered nbr. "+i);
    System.out.println("Entered string  "+s);
    scan.close();
    }
}