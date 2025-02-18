class outside{
    public String msg;
    private String position;
    void Message()
    {
        System.out.println(msg);
        System.out.println("Thz can be access anywhere in the Program---------Calling from another class");
    }
    private void message()
    {
        System.out.println(position);
        System.out.println("Thz can be access only from thz class bcz itz method is declared as private");
    }
    void SetValue(String str) //Setter function
    {
        position = str ;
    }
    void GetValue()  //Getter function
    {
        System.out.println(position);
    }

}
public class Access_modifier {
    public static void main(String[] args) {
        outside d = new outside();
        d.SetValue("Setting value for the position which is decelare as private from outside of other class");
        d.msg="At outside class";
        System.out.println("");
        d.Message();
        System.out.println("");
        d.GetValue();
    }
}