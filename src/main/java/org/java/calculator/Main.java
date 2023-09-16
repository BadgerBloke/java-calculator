package org.java.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        num1 = sc.nextDouble();

        char op = isValidOperator(sc);

        System.out.print("Enter second value: ");
        num2 = sc.nextDouble();

        performOperation(num1, num2, op);

    }

    private static char isValidOperator(Scanner sc){
        System.out.print("Enter one operator +, -, *, /: ");
        char op = sc.next().charAt(0);

        char[] supportedOperators = {'+', '-', '*', '/'};
        boolean test = false;

        for (char c : supportedOperators) {
            if (c == op) {
                test = true;
                break;
            }
        }

        if (!test) {
            System.out.println("Ops, You provided unsupported operator, try again...");
            op = isValidOperator(sc);
        }
        return op;
    }

    private static void performOperation(double a, double b, char op) {
        double result = 0;
        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> System.out.println("You provided unsupported operator sign :(");
        }
        System.out.println("Result: " + result);
    }
}