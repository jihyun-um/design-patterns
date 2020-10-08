package com.jihyunum.patterns.structural.flyweight.library;

import com.jihyunum.patterns.structural.flyweight.books.BookRental;
import com.jihyunum.patterns.structural.flyweight.books.BookFactory;
import com.jihyunum.patterns.structural.flyweight.books.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BookRental> bookRentals = new ArrayList<>();

    public void addBook(String title, String author, String isbn, boolean isRented, LocalDate rentedDate) {
        Book book = BookFactory.getBook(title, author, isbn);
        BookRental bookRental = new BookRental(book, isRented, rentedDate);
        bookRentals.add(bookRental);
    }

    public void printAllBookRentalStatus() {
        for (BookRental bookRental : bookRentals) {
            bookRental.printBookRentalStatus();
        }
    }
}
