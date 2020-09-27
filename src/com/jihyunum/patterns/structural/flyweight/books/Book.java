package com.jihyunum.patterns.structural.flyweight.books;

import java.time.LocalDate;

public class Book {
    private boolean isRented;
    private LocalDate rentedDate;
    private BookInfo info;

    public Book(boolean isRented, LocalDate rentedDate, BookInfo info) {
        this.isRented = isRented;
        this.rentedDate = rentedDate;
        this.info = info;
    }

    public void printBookStatus() {
        info.printBookInfo();
        System.out.println("-> " + (isRented ? "Rented on " + rentedDate : "Available"));
    }
}
