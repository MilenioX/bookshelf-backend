package com.mundox.bookshelf.ports.database.adapters;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.ActionBooksService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActionBooksAdapter implements ActionBooksService {

    private static final Logger LOGGER = LogManager.getLogger(ActionBooksAdapter.class);

    @Override
    public boolean addBook(Book book) {
        LOGGER.info("Connecting to the relational database");
        LOGGER.info("Adding a new book");
        LOGGER.info("Committing transaction");
        return true;
    }

    @Override
    public boolean updateTitle(Long id, String title) {
        LOGGER.info("Connecting to the relational database");
        LOGGER.info("Updating the title of the book with id " + id);
        LOGGER.info("Committing transaction");
        return true;
    }

    @Override
    public boolean deleteBook(Long id) {
        LOGGER.info("Connecting to the relational database");
        LOGGER.info("Deleting the book with id" + id);
        LOGGER.info("Committing transaction");
        return true;
    }
}
