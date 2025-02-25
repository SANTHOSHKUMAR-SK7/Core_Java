import java.util.Arrays;

public class Primitive_NonPrimitive {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println();
        System.out.println("Initially value of a and b is "+a+" "+b);

        swap(a,b);  //here value will be chance
        System.out.println("Value of a and b in main function "+a+" "+b); //where here value is unchanced bcz here just create new obj and not changing value

        String name ="SANTHOSH";
        changeName(name);
        System.out.println(name);

        int[] arr={1,2,3,4,5};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;

        System.out.println("value of a in swap function : "+a);
        System.out.println("Value of b in swap function : "+b);
    }

    static  void changeName(String name){
        name ="Kumar";
        System.out.println(name);
    }

    static void changeArr(int[] ar){
        ar[0]=10;
    }
}
