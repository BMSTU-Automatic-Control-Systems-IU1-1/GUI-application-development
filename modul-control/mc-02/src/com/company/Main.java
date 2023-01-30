package com.company;

public class Main {

    public static void main(String[] args) {

        BooksReads firstList = new BooksReads("Harry Potter");

        if (firstList.newBooksReads("Harry Potter") == -1) {
            throw new RuntimeException("This book had been read before");
        }

        firstList.print();

    }
}
