public class ClassObject {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.rolnum=48;
        System.out.println(std1.rolnum);
        std1.name="SK";
        System.out.println(std1.name);
    }
}

class Student{
    int rolnum;
    String name="santho";
    String dept;
}
