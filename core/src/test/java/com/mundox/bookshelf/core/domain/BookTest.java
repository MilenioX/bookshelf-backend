package com.mundox.bookshelf.core.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

  @Test
  public void testing_model() {
    Book book = new Book(101L,"The power of habits");
    assertEquals((Long) 101L, book.getId());
    assertEquals("The power of habits", book.getTitle());
  }
}