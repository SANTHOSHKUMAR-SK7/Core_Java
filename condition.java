import java.util.*;
//Util.* includes all classes and package,libaries
class s
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the n1 ");
        int n1=scan.nextInt();
        System.out.print("Enter the n2 ");
        int n2=scan.nextInt();
        if(n1>n2)
        {
            System.out.println("n1 is bigger than n2");
        }
        else if(n2>n1)
        {
            System.out.println("n2 is bigger than n1");
        }
        else
        {
            System.out.println("Both are equal");
        }
        scan.close();
        
    }   
}