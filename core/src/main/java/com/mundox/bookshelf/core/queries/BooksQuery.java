package com.mundox.bookshelf.core.queries;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.GetBooksService;

import java.util.List;

public class BooksQuery {

    private final GetBooksService bookService;

    public BooksQuery(GetBooksService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        // TODO: Validate the session and authorization is a must in this step
        return bookService.getBooks();
    }

    public List<Book> getAllBooksByTitle(String title) {
        // TODO: Validate the session and authorization is a must in this step
        return bookService.getBooksByTitle(title);
    }

}
