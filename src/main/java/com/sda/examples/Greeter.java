package com.sda.examples;

public class Greeter {

  public static void main(String[] args) {
    Greeter obiektGreeter = new Greeter();
    obiektGreeter.greet();
    obiektGreeter.greet("Karol");

    greet("Cześć", "Aga");
  }

  void greet() {
    greet("World");
  }

  void greet(String name) {
    greet("Hello", name);
  }

  static void greet(String greeting, String name) {
    System.out.println(greeting + ", " + name + "!");
  }
}
