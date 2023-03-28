package com.mundox.bookshelf.ports.database.adapters;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.GetBooksService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class GetBooksAdapter implements GetBooksService {

    private static final Logger LOGGER = LogManager.getLogger(GetBooksAdapter.class);

    @Override
    public List<Book> getBooks() {
        LOGGER.info("Connecting to the no relational database");
        LOGGER.info("searching all books");
        return List.of(
                new Book(101L, "The power of habits"),
                new Book(102L, "The man search for meaning"));
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        LOGGER.info("Connecting to the no relational database");
        LOGGER.info("searching all books with title " + title);
        return List.of(
                new Book(101L, "The power of habits"));
    }
}
