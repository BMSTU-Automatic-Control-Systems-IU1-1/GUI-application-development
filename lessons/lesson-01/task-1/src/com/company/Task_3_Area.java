package com.company;
import java.util.Scanner;

public class Task_3_Area {
    public static double functionF(double x, double index){
        return (Math.pow(x, index + 1)) / (index + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number with comma:");
        double firstNumber = scan.nextDouble();

        System.out.println("Input second number with comma:");
        double secondNumber = scan.nextDouble();

        if (firstNumber > secondNumber) {
            double timeValue = firstNumber;
            firstNumber = secondNumber;
            secondNumber = timeValue;
        }

        double F_a = functionF(firstNumber, 4) + functionF(firstNumber, 2)
                + functionF(firstNumber, 1) - 7 * firstNumber;
        double F_b = functionF(secondNumber, 4) + functionF(secondNumber, 2)
                + functionF(secondNumber, 1) - 7 * secondNumber;

        System.out.println("Area is equal:");
        if (F_b - F_a < 0) {
            throw new RuntimeException("Error input parameters: area < 0");
        }
        System.out.println(F_b - F_a);
    }

}
