package com.mundox.bookshelf.ports.api;

import com.mundox.bookshelf.core.commands.BooksCommand;
import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.queries.BooksQuery;
import com.mundox.bookshelf.ports.database.adapters.ActionBooksAdapter;
import com.mundox.bookshelf.ports.database.adapters.GetBooksAdapter;

public class Server {

    private final ActionBooksAdapter actionBooksAdapter = new ActionBooksAdapter();
    private final GetBooksAdapter getBooksAdapter = new GetBooksAdapter();

    /*
     * Commands & Queries
     */
    private final BooksCommand booksCommand = new BooksCommand(actionBooksAdapter);
    private final BooksQuery booksQuery = new BooksQuery(getBooksAdapter);

    public void serverMock() {
        System.out.println("Starting server...");
        booksCommand.addBook(new Book(200L, "the alchemist"));
        booksCommand.updateTitle("The alchemist", 200L);
        booksCommand.deleteBook(101L);
        getBooksAdapter.getBooks();
        getBooksAdapter.getBooksByTitle("The alchemist");
    }
}
