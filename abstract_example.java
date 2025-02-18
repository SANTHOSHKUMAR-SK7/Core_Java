abstract class Shape {

    abstract double calculateArea();

    void displayArea() {
        System.out.println("The area is: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // π * r^2
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height; // width * height
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

     @Override
    double calculateArea() {
        return 0.5 * base * height; // 0.5 * base * height
    }
}

public class abstract_example {
    public static void main(String[] args) {
        Shape circle = new Circle(7); // Radius = 5
        Shape rectangle = new Rectangle(2, 3); // Width = 4, Height = 6
        Shape triangle = new Triangle(5, 6); // Base = 3, Height = 8

        System.out.println("Circle:");
        circle.displayArea();

        System.out.println("\nRectangle:");
        rectangle.displayArea();

        System.out.println("\nTriangle:");
        triangle.displayArea();
    }
}
