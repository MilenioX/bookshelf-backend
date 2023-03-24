package com.mundox.bookshelf.ports.database.adapters;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.GetBooksService;

import java.util.List;

public class GetBooksAdapter implements GetBooksService {

    @Override
    public List<Book> getBooks() {
        System.out.println("Connecting to the no relational database");
        System.out.println("searching all books");
        return List.of(
                new Book(101L, "The power of habits"),
                new Book(102L, "The man search for meaning"));
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        System.out.println("Connecting to the no relational database");
        System.out.println("searching all books with title " + title);
        return List.of(
                new Book(101L, "The power of habits"));
    }
}
