import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int op;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program is for arithmetic operations!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter the operation you need to perform: ");
        
        op = scan.nextInt();
        System.out.print("Enter the first number: ");
        int i = scan.nextInt();
        System.out.print("Enter the second number: ");
        int j = scan.nextInt();
        
        int a = 0; // Declare the variable a outside the switch case

        switch (op) {
            case 1:
                System.out.println("Your operation is Addition:");
                a = i + j;
                break;
            case 2:
                System.out.println("Your operation is Subtraction:");
                a = i - j;
                break;
            case 3:
                System.out.println("Your operation is Multiplication:");
                a = i * j;
                break;
            case 4:
                if (j != 0) {
                    System.out.println("Your operation is Division:");
                    a = i / j;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scan.close();
                    return;
                }
                break;
            case 5:
                System.out.println("Your operation is Modulus:");
                a = i % j;
                break;
            default:
                System.out.println("Enter a valid option.");
                scan.close();
                return; // Exit the program
        }
        System.out.println("The result is: " + a);
        scan.close();
    }
}
