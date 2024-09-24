import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Display the operation menu
        System.out.println("Choose any Calculation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = sc.nextInt();

        double result;

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition of " + num1 + " + " + num2 + " is: " + result);

                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction of " + num1 + " + " + num2 + " is: " + result);

                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " + " + num2 + " is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of " + num1 + " + " + num2 + " is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        sc.close();
    }
}
