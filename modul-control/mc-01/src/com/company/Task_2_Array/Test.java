package com.company.Task_2_Array;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------ Tests ------------");
        System.out.println();

        System.out.println("-----------Test № 1----------");

        int[] first = {1, 2, 3, 4, 5};
        Array first_array = new Array(first);

        System.out.println("Average value of this array: " + first_array.get_average_value());
        System.out.println("Maximus element: " + first_array.get_maximum_of_array());
        first_array.print();
        first_array.add_element_in_array(6);
        System.out.println("Average value of this array: " + first_array.get_average_value());
        System.out.println("Maximus element: " + first_array.get_maximum_of_array());
        first_array.print();

        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("-----------Test № 2----------");

        int[] second = {};
        Array second_array = new Array(second);

        System.out.println("Average value of this array: " + second_array.get_average_value());
        System.out.println("Maximus element: " + second_array.get_maximum_of_array());
        second_array.print();
        second_array.add_element_in_array(3);
        System.out.println("Average value of this array: " + second_array.get_average_value());
        System.out.println("Maximus element: " + second_array.get_maximum_of_array());
        second_array.print();

        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("-----------Test № 3----------");

        int[] third = {7, 3, 5, -1000, 4, 897, 11};
        Array third_array = new Array(third);

        System.out.println("Average value of this array: " + third_array.get_average_value());
        if (third_array.get_maximum_of_array() != 0) {
            System.out.println("This array have nothing elements");
        }
        System.out.println("Maximus element: " + third_array.get_maximum_of_array());
        third_array.print();
        third_array.add_element_in_array(3);
        System.out.println("Average value of this array: " + third_array.get_average_value());
        System.out.println("Maximus element: " + third_array.get_maximum_of_array());
        third_array.print();

        System.out.println("-----------------------------");
    }
}
