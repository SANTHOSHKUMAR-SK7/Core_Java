import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number greater than 10 :");
        int i=scan.nextInt();
        do{
            System.out.println("You Entered the number :"+i);
            System.out.println("Enter the number greater than 10 :");
            i=scan.nextInt();
        }while(i>10);
        scan.close();
    }
}
