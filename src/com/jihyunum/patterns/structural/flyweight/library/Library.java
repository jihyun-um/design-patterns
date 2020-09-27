package com.jihyunum.patterns.structural.flyweight.library;

import com.jihyunum.patterns.structural.flyweight.books.Book;
import com.jihyunum.patterns.structural.flyweight.books.BookFactory;
import com.jihyunum.patterns.structural.flyweight.books.BookInfo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String isbn, boolean isRented, LocalDate rentedDate) {
        BookInfo bookInfo = BookFactory.getBookInfo(title, author, isbn);
        Book book = new Book(isRented, rentedDate, bookInfo);
        books.add(book);
    }

    public void printAllBookStatus() {
        for (Book book: books) {
            book.printBookStatus();
        }
    }
}
