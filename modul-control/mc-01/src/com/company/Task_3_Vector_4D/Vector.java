package com.company.Task_3_Vector_4D;

import static java.lang.Math.*;

public class Vector {
    private double[] vector;

    public Vector (double[] vector) {
        this.vector = vector;
    }

    public Vector scalar_product(Vector vector2) {
        double[] scalar_product = new double[4];

        for(int i = 0; i < 4; ++i) {
            scalar_product[i] = vector[i] * vector2.vector[i];
        }

        return new Vector(scalar_product);
    }

    public Vector addition_vectors(Vector vector2) {
        double[] addition_vectors = new double[4];

        for(int i = 0; i < 4; ++i) {
            addition_vectors[i] = vector[i] + vector2.vector[i];
        }

        return new Vector(addition_vectors);
    }

    public Vector subtraction_vectors(Vector vector2) {
        double[] subtraction_vectors = new double[4];

        for(int i = 0; i < 4; ++i) {
            subtraction_vectors[i] = vector[i] - vector2.vector[i];
        }

        return new Vector(subtraction_vectors);
    }

    public double product_vectors(Vector vector2) {
        double product_vectors = 0;

        for (int i = 0; i < 4; ++i) {
            product_vectors += vector[i] * vector2.vector[i];
        }

        return product_vectors;
    }

    public double length_vector(Vector vector) {
        double length = 0;
        length =  sqrt(
                pow(vector.vector[0], 2)
                        + pow(vector.vector[1], 2)
                        + pow(vector.vector[2], 2)
                        + pow(vector.vector[3], 2));
        return length;
    }

    public double injection_between_vectors(Vector vector1, Vector vector2) {
        double injection_between_vectors = 0;
        double product_vectors = product_vectors(vector2);
        double length_vector_1 = length_vector(vector1);
        double length_vector_2 = length_vector(vector2);

        injection_between_vectors = acos(product_vectors / abs(length_vector_1) / abs(length_vector_2));

        return injection_between_vectors;
    }

    public double square_vectors(Vector vector1, Vector vector2) {
        double injection_between_vectors = injection_between_vectors(vector1, vector2);
        double length_vector_1 = length_vector(vector1);
        double length_vector_2 = length_vector(vector2);

        return sin(injection_between_vectors) * length_vector_1 * length_vector_2;
    }

    public String toString(Vector input_vector) {
        return  "[ " + input_vector.vector[0]
                + ", " + input_vector.vector[1]
                + ", " + input_vector.vector[2]
                + ", " + input_vector.vector[3]
                + " ]";
    }
}
