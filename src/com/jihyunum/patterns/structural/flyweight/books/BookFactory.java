package com.jihyunum.patterns.structural.flyweight.books;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    static Map<String, Book> bookInventory = new HashMap<>();

    public static Book getBook(String title, String author, String isbn) {
        Book book = bookInventory.get(isbn);
        if (book == null) {
            System.out.println("Adding a new book to inventory > " + title);
            book = new Book(title, author, isbn);
            bookInventory.put(isbn, book);
        }
        return book;
    }
}
