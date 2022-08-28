package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter num1 and num2 to perform add, subtract, multiply and divide");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Sum is: " + calculator.addNumbers(num1, num2));
        System.out.println("Difference is: " + calculator.subtractNumber(num1, num2));
        System.out.println("Multiplied is: " + calculator.multiplyNumber(num1, num2));
        System.out.println("Division is: " + calculator.divideNumber(num1, num2));

    }

    /**
     * This function takes two numbers as arguments and returns the sum of those numbers.
     *
     * @param num1 The first number to add.
     * @param num2 The second number to add.
     * @return The sum of the two numbers.
     */
    public double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * This function subtracts num2 from num1 and returns the result.
     *
     * @param num1 The first number to subtract from.
     * @param num2 The second number to subtract from the first number.
     * @return The difference between the two numbers.
     */
    public double subtractNumber(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * This function takes two numbers and returns the result of dividing the first number by the second number.
     *
     * @param num1 The first number to be divided.
     * @param num2 The second number to divide by.
     * @return The result of the division of num1 by num2.
     */
    public double divideNumber(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * This function takes two numbers as parameters and returns the product of the two numbers.
     *
     * @param num1 The first number to multiply
     * @param num2 The second number to multiply.
     * @return The product of num1 and num2
     */
    public double multiplyNumber(double num1, double num2) {
        return num1 * num2;
    }
}
