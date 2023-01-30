package com.company.Task_1_Function;

import static java.lang.Math.sqrt;

public class Function {

    private double a;
    private double b;
    private double c;

    public Function(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getNumberOfRoot (){
        double d = b * b - 4 * a * c;
        if (d < 0){
            return 0;
        } else if (d == 0){
            return 1;
        } else {
            return 2;
        }
    }

    public double[] getRoot(){
        double d = b * b - 4 * a * c;

        if(d < 0){ return new double[]{}; }
        else if(d == 0){ return new double[]{ - b / (2 * a)}; }
        else { return new double[]{ -b + sqrt(d) / (2 * a) , -b - sqrt(d) / (2 * a)}; }

    }
}
