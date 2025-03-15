import java.util.Arrays;

public class ArrayList1 {
    int[] arr;
    int size= 0;
    int Default_Size=10;

    ArrayList1(){
        this.arr=new int[Default_Size];
    }
    void add(int val){
        if(isFull()){
            resize();
        }
        arr[size++]=val;
    }
    boolean isFull(){
        return size==0;
    }

    void resize(){
        int[] temp = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
    }

    @Override
    public String toString() {
        return "ArrayList1{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size + '}';
    }

    public static void main(String[] args) {
        ArrayList1 arr = new ArrayList1();
        arr.add(2);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        System.out.println(arr);
    }
}
