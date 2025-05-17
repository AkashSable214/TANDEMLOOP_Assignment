package test;

import java.util.Scanner;

public class Calculator {

    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN;
                }
                return a / b;

            default:
                System.out.println("Invalid operation type.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); // consume newline

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        double result = calc.calculate(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}


