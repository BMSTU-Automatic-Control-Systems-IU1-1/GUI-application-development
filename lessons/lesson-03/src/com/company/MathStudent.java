package com.company;

public class MathStudent extends Student {
    public MathStudent(String firstName, String lastName, String dadName, int course, int examMark) {
        super(firstName, lastName, dadName, course, examMark);
    }

    @Override
    public void writeExam () {
        System.out.println("MathStudent write exam");
    }
}