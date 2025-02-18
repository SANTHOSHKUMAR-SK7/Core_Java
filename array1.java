
import java.util.*;
public class array1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size=scan.nextInt();
        int[] j=new int[size];
        for(int i=0;i<=size-1;i++){
            System.out.print("Enter the mark "+i+" :");
            j[i]=scan.nextInt();
        }
        for(int i=0;i<=size-1;i++){
            System.out.println("Mark is : "+j[i]);
         }
         scan.close();
    }
}
