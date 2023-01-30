package com.company.Task_1_Function;

public class Function_Test {

    public static void main(String[] args) {
        Function first = new Function(4, 5, 7);
        int number = first.getNumberOfRoot();
        System.out.println(number);
        double[] roots = first.getRoot();

        if (roots.length == 0) {
            System.out.println("Корней нет");
        } else if(roots.length == 1) {
            System.out.println("Один корень");
            System.out.println(roots[0]);
        } else {
            System.out.println("Два корня");
            System.out.println(roots[0]);
            System.out.println(roots[1]);
        }

        Function function = new Function(1.0, 1.0, 1.0);
        int number_2 = first.getNumberOfRoot();
        System.out.println(number_2);
        double[] roots_2 = function.getRoot();

        if (roots_2.length == 0) {
            System.out.println("Корней нет");
        } else if(roots.length == 1) {
            System.out.println("Один корень");
            System.out.println(roots[0]);
        } else {
            System.out.println("Два корня");
            System.out.println(roots[0]);
            System.out.println(roots[1]);
        }

    }
}
