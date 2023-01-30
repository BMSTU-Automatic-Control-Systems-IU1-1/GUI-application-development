package com.company.Task_4_Singleton;

public class Singleton {

    private static Singleton Earth;

    private Singleton(){};

    public static Singleton createObject(){
        if (Earth == null){
            Earth = new Singleton();
        }
        return Earth;
    }


}
