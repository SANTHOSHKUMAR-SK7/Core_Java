// Base class (Parent class)
class java {
    // Method in the base class
    public void dis() {
        System.out.println("Java is oops");
    }
}

// Derived class (Child class) inheriting from Java
class Python extends java {
    // Method in the derived class
    public void dipl() {
        System.out.println("Python is oops");
    }       
}
public class SingleInherit {
    public static void main(String[] args) {
        // Creating an instance of python
        Python obj = new Python();
        
        // Calling methods from both the parent and child classes
        obj.dis(); // Method from Java (parent class)
        obj.dipl(); // Method from Python (child class)
    }
}
