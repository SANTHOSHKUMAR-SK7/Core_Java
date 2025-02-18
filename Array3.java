import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a first nbr : ");
        arr[0]= scan.nextInt();
        System.out.print("2nd nbr ");
        arr[1]= scan.nextInt();
        System.out.print("3rd nbr ");
        arr[2]= scan.nextInt();

        System.out.println("Sum of three nbrs : "+(arr[0]+arr[1]+arr[2]));
    }
}