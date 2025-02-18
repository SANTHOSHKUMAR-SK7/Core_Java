// Base class
class ProgrammingLang{
    void hello() {
        System.out.println("Hello Guys!!!");
    }
}

// Derived cls inheriting from ProgrammingLang
class CompiledLang extends ProgrammingLang {
    void compileCode() {
        System.out.println("This language is compiled before execution");
    }
}

// Another derived cls inheriting from CompiledLang
class JavaLang extends CompiledLang{
    void JVM() {
        System.out.println("Java code runs on the JVM (Java Virtual Machine)");
    }
}

public class Multilevel {
    public static void main(String[] args) 
    {
        JavaLang myJava = new JavaLang();//Obj created for only one cls bcz we can access other cls
        // Calling methods from all levels of inheritance
        myJava.hello();         // Method from ProgrammingLang class
        myJava.compileCode();     // Method from CompiledLang class
        myJava.JVM();          // Method from JavaLang class
    }
}