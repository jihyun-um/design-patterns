package com.jihyunum.patterns.structural.flyweight.books;

import java.time.LocalDate;

public class BookRental {
    private Book book;
    private boolean isRented;
    private LocalDate rentedDate;

    public BookRental(Book book, boolean isRented, LocalDate rentedDate) {
        this.book = book;
        this.isRented = isRented;
        this.rentedDate = rentedDate;
    }

    public void printBookRentalStatus() {
        book.printBookInfo();
        System.out.println("-> " + (isRented ? "Rented on " + rentedDate : "Available"));
    }
}
