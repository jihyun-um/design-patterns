package com.jihyunum.patterns.structural.flyweight.books;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    static Map<String, BookInfo> bookInfoInventory = new HashMap<>();

    public static BookInfo getBookInfo(String title, String author, String isbn) {
        BookInfo bookInfo = bookInfoInventory.get(isbn);
        if (bookInfo == null) {
            System.out.println("Adding a new book to inventory > " + title);
            bookInfo = new BookInfo(title, author, isbn);
            bookInfoInventory.put(isbn, bookInfo);
        }
        return bookInfo;
    }
}
