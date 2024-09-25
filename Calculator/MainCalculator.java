package Calculator;
import Calculator.basic.Addition;
import Calculator.basic.Subtraction;
import Calculator.basic.Multiplication;
import Calculator.basic.Division;
import Calculator.advance.Exponentiation;
import Calculator.advance.Factorial;
import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select operation: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Power 6. Factorial");
        int choice = scanner.nextInt();
        
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        Exponentiation exp = new Exponentiation();
        Factorial fact = new Factorial();
        
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to add:");
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.println("Result: " + add.add(a1, b1));
                break;
                
            case 2:
                System.out.println("Enter two numbers to subtract:");
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                System.out.println("Result: " + sub.subtract(a2, b2));
                break;
                
            case 3:
                System.out.println("Enter two numbers to multiply:");
                double a3 = scanner.nextDouble();
                double b3 = scanner.nextDouble();
                System.out.println("Result: " + mul.multiply(a3, b3));
                break;
                
            case 4:
                System.out.println("Enter two numbers to divide:");
                double a4 = scanner.nextDouble();
                double b4 = scanner.nextDouble();
                System.out.println("Result: " + div.divide(a4, b4));
                break;
                
            case 5:
                System.out.println("Enter base and exponent:");
                double base = scanner.nextDouble();
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + exp.power(base, exponent));
                break;
                
            case 6:
                System.out.println("Enter a number to find factorial:");
                int n = scanner.nextInt();
                System.out.println("Result: " + fact.factorial(n));
                break;
                
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
