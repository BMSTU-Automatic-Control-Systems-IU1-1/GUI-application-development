package com.company.Task_4_Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton The_Earth = Singleton.createObject();
        System.out.println(The_Earth);

        System.out.println(Singleton.createObject());

    }
}
