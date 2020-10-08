package com.jihyunum.patterns.structural.flyweight;

import com.jihyunum.patterns.structural.flyweight.library.Library;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();

        // Add new books
        library.addBook(
                "Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert C. Martin",
                "9780132350884",
                false,
                null);
        library.addBook(
                "Design Patterns: Elements of Reusable Object-Oriented Software",
                "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
                "9780201633610",
                true,
                LocalDate.of(2020, 9, 1));

        library.printAllBookRentalStatus();

        System.out.println("\n--------------------------------------------------\n");

        // Add a copy of an existing book
        library.addBook(
                "Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert C. Martin",
                "9780132350884",
                true,
                LocalDate.now());

        library.printAllBookRentalStatus();
    }
}
