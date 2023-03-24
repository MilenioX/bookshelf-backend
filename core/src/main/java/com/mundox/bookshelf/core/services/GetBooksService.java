package com.mundox.bookshelf.core.services;

import com.mundox.bookshelf.core.domain.Book;

import java.util.List;

public interface GetBooksService {

    public List<Book> getBooks();

    public List<Book> getBooksByTitle(String title);
}
