package com.company.Task_2_Array;

public class Array {
    private int[] array;

    public Array(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j)
                if (array[j] < array[i]) {
                    int temp_value = array[i];
                    array[i] = array[j];
                    array[j] = temp_value;
                }
        }

        this.array = array;
    }

    public void add_element_in_array(int element) {
        int[] new_array = new int[array.length + 1];

        boolean isElementAdd = false;
        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (element < array[i] && !isElementAdd) {
                new_array[j] = element;
                isElementAdd = true;
                ++j;
                --i;
            } else {
                new_array[j] = array[i];
                ++j;
            }
        }
        if (!isElementAdd) {
            new_array[array.length]= element;
        }

        this.array = new_array;
    }

    public void print() {
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }

    public void sort_array(int[] array) {
        if (array.length <= 1) {
            return ;
        }

        for (int i = array.length - 1; i >= 1; --i){
            for (int j = 0; j < i; ++j){
                if(array[j] > array[j + 1]) {
                    int time_value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = time_value;
                }
            }
        }
    }

    public int get_maximum_of_array() {
        if (array.length == 0) {
            return -1;
        }
        return array[array.length - 1];
    }

    public double get_average_value() {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        int number = 0;

        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
            number += 1;
        }
        return sum / number;
    }

}
