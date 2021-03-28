package com.sda.strings;

import java.util.ArrayList;
import java.util.List;

public class StringApp {

  public static void main(String[] args) {
    List<String> texts = new ArrayList<>();
    texts.add("first");
    texts.add("second");
    texts.add("third");

    // Tutaj interfejs jest zaimplementowany za pomocą klasy
    UpperCase upperCase = new UpperCase();

    // Tutaj interfejs jest zaimplementowany klasą anonimową
    StringOperation duplicate = new StringOperation() {
      @Override
      public String modify(String text) {
        return text + text;
      }
    };

    // Tutaj interfejs jest zaimplementowany za pomocą lambdy, napisanej bardzo dosłownie (charakterystyczne "->")
    StringOperation removeLetterI = (String text) -> {
      return text.replace("i", "");
    };

    // Tutaj interfejs jest zaimplementowany za pomocą lambdy, napisanej maksymalnie krótko (charakterystyczne "->")
    StringOperation shorten = text -> text.substring(0, 3);

    // Tutaj interfejs jest zaimplementowany za pomocą referencji do metody (charakterystyczne "::")
    StringOperation textToUpperCaseMethodReference = String::toUpperCase;
    StringOperation doklejHello = StringApp::doklejHello;

    for (String text : texts) {
      String modified = upperCase.modify(text);
      System.out.println(modified);
    }

    for (String text : texts) {
      String modified = duplicate.modify(text);
      System.out.println(modified);
    }

    for (String text : texts) {
      String modified = removeLetterI.modify(text);
      System.out.println(modified);
    }

    for (String text : texts) {
      String modified = shorten.modify(text);
      System.out.println(modified);
    }
  }

  private static String doklejHello(String text) {
    return "HELLO " + text;
  }
}
