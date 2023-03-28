package com.mundox.bookshelf.ports.api;

import com.mundox.bookshelf.core.commands.BooksCommand;
import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.queries.BooksQuery;
import com.mundox.bookshelf.ports.database.adapters.ActionBooksAdapter;
import com.mundox.bookshelf.ports.database.adapters.GetBooksAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server {

    private static final Logger LOGGER = LogManager.getLogger(Server.class);

    private final ActionBooksAdapter actionBooksAdapter = new ActionBooksAdapter();
    private final GetBooksAdapter getBooksAdapter = new GetBooksAdapter();

    /*
     * Commands & Queries
     */
    private final BooksCommand booksCommand = new BooksCommand(actionBooksAdapter);
    private final BooksQuery booksQuery = new BooksQuery(getBooksAdapter);

    public void serverMock() {
        LOGGER.info("Starting the server...");
        LOGGER.info("Starting server...");
        booksCommand.addBook(new Book(200L, "the alchemist"));
        booksCommand.updateTitle("The alchemist", 200L);
        booksCommand.deleteBook(101L);
        getBooksAdapter.getBooks();
        getBooksAdapter.getBooksByTitle("The alchemist");
    }
}
