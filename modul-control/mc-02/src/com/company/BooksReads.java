package com.company;

public class BooksReads {
    String[] books = new String[] {""};

    public BooksReads(String book) {
        this.books[0] = book;
    }

    public void print() {
        for (int i = 0; i < books.length; ++i) {
            System.out.println(books[i]);
        }
    }

    public int newBooksReads (String book) {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] == book) { return -1; }
        }

        String[] newBooks = new String[books.length + 1];

        for (int i = 0; i < books.length; ++i) {
            newBooks[i] = books[i];
        }
        newBooks[books.length + 1] = book;

        return 0;
    }

}
