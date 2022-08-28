package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter num1 and num2 to perform add, subtract, multiply and divide");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println(calculator.addNumbers(num1, num2));

    }

    public double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public double subtractNumber(double num1, double num2) {
        return num1 - num2;
    }

    public double divideNumber(double num1, double num2) {
        return num1 / num2;
    }

    public double multiplyNumber(double num1, double num2) {
        return num1 * num2;
    }
}
