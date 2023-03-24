package com.mundox.bookshelf.ports.database.adapters;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.core.services.ActionBooksService;

public class ActionBooksAdapter implements ActionBooksService {

    @Override
    public boolean addBook(Book book) {
        System.out.println("Connecting to the relational database");
        System.out.println("Adding a new book");
        System.out.println("Committing transaction");
        return true;
    }

    @Override
    public boolean updateTitle(Long id, String title) {
        System.out.println("Connecting to the relational database");
        System.out.println("Updating the title of the book with id " + id);
        System.out.println("Committing transaction");
        return true;
    }

    @Override
    public boolean deleteBook(Long id) {
        System.out.println("Connecting to the relational database");
        System.out.println("Deleting the book with id" + id);
        System.out.println("Committing transaction");
        return true;
    }
}
