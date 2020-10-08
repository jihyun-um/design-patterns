package com.jihyunum.patterns.structural.flyweight.books;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void printBookInfo() {
        System.out.println("<<" + this.title + ">> by " + this.author);
    }
}
