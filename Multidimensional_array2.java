import java.util.Arrays;

public class Multidimensional_array2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2},{1,2,3,4,5}};

        for (int row = 0 ;row< arr.length;row++){
            for (int col = 0 ; col < arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for (int[] ar : arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}
