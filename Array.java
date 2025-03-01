import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[5];
        System.out.println("Enter a string : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        System.out.println("Displying :");
        for(String i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

}
