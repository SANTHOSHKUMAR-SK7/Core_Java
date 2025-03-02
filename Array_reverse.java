import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,5,6,7,4,3,5,3,4,77,66,1+55,-99};
        reverse(arr);
    }

    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
