import java.util.Arrays;

public class Static {
    public static void main(String[] args) {
      student std1 = new student("Santhosh",48,"CSE");
      student std2 = new student("santho",47,"CSE");
      student std3 = new student("Kumar",49,"CSE" );

      System.out.println("Total student count : "+student.stdCount);

    }
}

class student {
    String name;
    int roll;
    String dept;
    static int stdCount;

    public student(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
        student.stdCount+=1;

    }
}

