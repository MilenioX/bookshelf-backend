package com.mundox.bookshelf.core.domain;

public class Book {

  private Long id;
  private String title;

  public Book(Long id, String title) {
    this.id = id;
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public Long getId() {
    return id;
  }
}