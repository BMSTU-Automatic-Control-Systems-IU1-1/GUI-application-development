package com.company.Task_3_Vector_4D;

import java.util.Scanner;

public class Test {
    private static final String print_text_menu = "\nMenu:\n\t" +
            "1. Scalar product of vectors\n\t" +
            "2. Addition vectors\n\t" +
            "3. Subtraction vectors\n\t" +
            "4. Product vectors\n\t" +
            "5. Injection between vectors\n\t" +
            "6. Length vector 1\n\t" +
            "7. Length vector 2\n\t" +
            "8. Square parallelogram of vectors\n\t" +
            "0. Exist";

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double[] vectorFirst = new double[4];
        System.out.println("Input first vector in 4D space: ");
        for(int i = 0; i < 4; ++i){
            double element = scan.nextDouble();
            vectorFirst[i] = element;
        }
        Vector vector1 = new Vector(vectorFirst);

        byte program = 1;
        System.out.println(print_text_menu);
        program = scan.nextByte();

        while(program > 0 && program < 9){

            double[] vectorSecond = new double[4];
            System.out.println("Input second vector in 4D space: ");
            for(int i = 0; i < 4; ++i){
                double element = scan.nextDouble();
                vectorSecond[i] = element;
            }
            Vector vector2 = new Vector(vectorSecond);


            switch (program){
                case 1:
                    System.out.println("Скалярное произведение векторов: ");
                    Vector scalar_of_vectors = vector1.scalar_product(vector2);
                    System.out.println(scalar_of_vectors.toString(scalar_of_vectors));
                    break;
                case 2:
                    System.out.println("Addition of vectors - vector: ");
                    Vector addition_vectors = vector1.addition_vectors(vector2);
                    System.out.println(addition_vectors.toString(addition_vectors));
                    break;
                case 3:
                    System.out.println("Subtraction vectors - vector: ");
                    Vector subtraction_vectors = vector1.subtraction_vectors(vector2);
                    System.out.println(subtraction_vectors.toString(subtraction_vectors));
                    break;
                case 4://
                    System.out.println("Product vectors - vector: " + vector1.product_vectors(vector2));
                    break;
                case 5:
                    System.out.println("Injection between vectors: " + vector1.injection_between_vectors(vector1,vector2));
                    break;
                case 6:
                    System.out.println("Length vectors 1: " + vector1.length_vector(vector1));
                    break;
                case 7:
                    System.out.println("Length vectors 2: " + vector1.length_vector(vector2));
                case 8:
                    System.out.println("Square parallelogram of vectors: " + vector1.square_vectors(vector1, vector2));
                    break;
                case 0://
                    break;
                default:
                    System.out.println("INCORRECT INPUT COMMAND\n" + print_text_menu);
                    program = scan.nextByte();
            }
            System.out.println(print_text_menu);
            program = scan.nextByte();
        }
    }
}
