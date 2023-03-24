package com.mundox.bookshelf.core.commands;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.ActionBooksService;

public class BooksCommand {

    private final ActionBooksService booksService;

    public BooksCommand(ActionBooksService booksService) {
        this.booksService = booksService;
    }

    public boolean addBook(Book book) {
        // TODO: Validate the session and authorization is a must in this step
        return booksService.addBook(book);
    }

    public boolean updateTitle(String title, Long id) {
        // TODO: Validate the session and authorization is a must in this step
        return booksService.updateTitle(id, title);
    }

    public boolean deleteBook(Long id) {
        // TODO: Validate the session and authorization is a must in this step
        return booksService.deleteBook(id);
    }
}
