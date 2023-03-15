package com.mundox.bookshelf.ports;

import com.mundox.bookshelf.core.Book;

public class Main {
  public static void main(String[] args) {
    System.out.println(salute());
  }

  public static String salute() {
    return "Hello World!";
  }

  public static String getFirstBook() {
    Book firstBook = new Book("The power of habits");
    return firstBook.getTitle();
  }
}