package com.mundox.bookshelf.ports;

import com.mundox.bookshelf.core.domain.Book;
import com.mundox.bookshelf.ports.application.Environment;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Environment.createEnv();
  }

  public static String salute() {
    return "Hello World!";
  }

  public static String getFirstBook() {
    Book firstBook = new Book(101L, "The power of habits");
    return firstBook.getTitle();
  }
}
