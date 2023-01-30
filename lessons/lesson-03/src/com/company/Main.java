package com.company;

public class Main {

    public static void main(String[] args) {
        IUStudent student_2 = new IUStudent("Roman", "Maksimov",
                "Pavlovich", 1, 5);
        MathStudent student_3 = new MathStudent("Timofey", "Utkin",
                "Olegovich", 1, 5);

        student_2.writeExam();
        student_3.writeExam();
    }
}
