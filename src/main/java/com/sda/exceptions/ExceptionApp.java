package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your name: ");

      String input = scanner.nextLine();

      greet(input);
    } catch (IllegalArgumentException exception) {
      System.out.println("Wystąpił błąd: " + exception.getMessage());
    }

    System.out.println("Zamykam program.");
  }

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
