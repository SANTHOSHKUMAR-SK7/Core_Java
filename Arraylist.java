import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int count =0;

       for(int i = 1;i<=100;i+=2){
           list.add(i);
           count++;
       }

        System.out.println(list);
        System.out.println("There are "+count+" even numbers");
    }
}
