
class compare{
    public static void main(String[] args) {
        String s1=new String("SK");
        String s2=new String("SK");
        System.out.println(s1==s2);
        //Thz create a new address.so,o/p will be false//
        String s3="SK";
        System.out.println(s1==s3);
        //Here also op will be false
        //compares address
        System.out.println(s1.equals(s3));
        //Here OP will be true bcz it compares the string
    }
}