package com.mundox.bookshelf.core.services;

import com.mundox.bookshelf.core.domain.Book;

public interface ActionBooksService {

    public boolean addBook(Book book);

    public boolean updateTitle(Long id, String title);

    public boolean deleteBook(Long id);
}
