import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        double result;

        switch(op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if(b != 0)
                    result = a / b;
                else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
