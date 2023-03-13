package com.mundox.bookshelf;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest{

  @Test
  public void testing_salute() {
    assertEquals("Hello World", Main.salute());
  }

}