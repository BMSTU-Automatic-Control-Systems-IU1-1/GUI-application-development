package com.company.Task_1_Roots_of_equels_Version_2;

import static java.lang.Math.sqrt;

public class Equation {
    private double a;
    private double b;
    private double c;
    private double discriminant;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = b * b - 4 * a * c;
    }

    public int get_numbers_of_roots() {
        if (discriminant < 0) {
            return 0;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 2;
        }
    }


    public double[] get_roots(){
        if(discriminant < 0){ return new double[]{}; }
        else if(discriminant == 0){ return new double[]{ - b / (2 * a)}; }
        else { return new double[]{ -b + sqrt(discriminant) / (2 * a) , -b - sqrt(discriminant) / (2 * a)}; }
    }

}
