package com.sda.exceptions;

public class MyExceptionApp {

  static void greet(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Imię jest puste");
    }
    if (name.length() == 1) {
      throw new IllegalArgumentException("Imię jest zbyt krótkie");
    }

    System.out.println("Hello " + name);
  }
}
