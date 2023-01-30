package com.company.Task_1_Roots_of_equels_Version_2;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = "yes";

        while (Objects.equals(command, "yes")) {
            System.out.println("Input parameters - a, b and c: ");
            System.out.println("a:\t");
            double a = scan.nextDouble();
            System.out.println("b:\t");
            double b = scan.nextDouble();
            System.out.println("c:\t");
            double c = scan.nextDouble();
            Equation equation = new Equation(a, b, c);

            System.out.println("Numbers of roots: " + equation.get_numbers_of_roots());

            double[] roots = equation.get_roots();

            if (roots.length == 0) {
                System.out.println("Nothing roots");
            } else if (roots.length == 1) {
                System.out.println("Root: " + roots[0]);
            } else if (roots.length == 2 && roots[0] == roots[1]){
                System.out.println("Roots are equal: " + roots[0] + "\t" + roots[1]);
            } else {
                System.out.println("Root 1: " + roots[0] + "\tRoot 2: " + roots[1]);
            }

            System.out.println();
            System.out.println("If you want continue - yes: ");
            command = scan.next();
            System.out.println();
        }
        System.out.println("Thanks for using our calculator! :)");
    }
}
