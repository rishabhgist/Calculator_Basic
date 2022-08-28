package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

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
