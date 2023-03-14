package com.mundox.bookshelf.ports;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

  @Test
  public void testing_salute() {
    assertEquals("Hello World!", Main.salute());
  }
  
  @Test
  public void testing_model() {
    assertEquals("The power of habits", Main.getFirstBook());
  }
}