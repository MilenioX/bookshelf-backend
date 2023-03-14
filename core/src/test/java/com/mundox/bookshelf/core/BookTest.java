package com.mundox.bookshelf.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

  @Test
  public void testing_model() {
    Book book = new Book("The power of habits");
    assertEquals("The power of habits", book.getTitle());
  }
}