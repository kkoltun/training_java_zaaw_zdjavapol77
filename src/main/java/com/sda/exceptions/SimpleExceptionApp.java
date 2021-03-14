package com.sda.exceptions;

public class SimpleExceptionApp {
  public static void main(String[] args) {
    String tekst = "Karol";

    try {
      System.out.println(tekst.toUpperCase());
    } catch (NullPointerException exception) {
      System.out.println("Wystąpił wyjątek " + exception.getMessage());
    } finally {
      System.out.println("Czyszczę po sobie!");
    }
  }
}
