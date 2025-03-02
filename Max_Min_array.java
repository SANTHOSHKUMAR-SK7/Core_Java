public class Max_Min_array {
    public static void main(String[] args) {
        int[] arr ={1,-4,-12,3,6,44,7,-55,18,111,5,2};
        max(arr);
        min(arr);
    }

    static void max(int[] arr){
        int max = arr[0];
        int index=0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Max value in this array is "+max+" at "+index+" position");
    }

    static  void min(int[] arr){
        int min = arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
            System.out.println("Min value in this array is "+min+" at "+index+" position");
    }
}
