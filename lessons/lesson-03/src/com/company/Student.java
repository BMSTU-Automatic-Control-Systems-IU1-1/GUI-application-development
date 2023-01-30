package com.company;

public abstract class Student {
    private String firstName = "";
    private String lastName = "";
    private String dadName = "";

    private int course = 0;
    private int examMark = 0;

    public Student(String firstName, String lastName, String dadName, int course, int examMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dadName = dadName;
        this.course = course;
        this.examMark = examMark;
    }

    public abstract void writeExam () ;

}
