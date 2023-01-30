package com.company;

public class IUStudent extends Student {

    public IUStudent(String firstName, String lastName, String dadName, int course, int examMark) {
        super(firstName, lastName, dadName, course, examMark);
    }

    @Override
    public void writeExam () {
        System.out.println("IUStudent write exam");
    }

}


