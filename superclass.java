class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
}
class Employee extends Person
{
    Employee(String name)
   {
        super("SK");
   }
}
public class superclass {
    public static void main(String[] y) {
        Employee e = new Employee("SK");
        e.name="SK";
        System.out.println(e.name);
    }
}       