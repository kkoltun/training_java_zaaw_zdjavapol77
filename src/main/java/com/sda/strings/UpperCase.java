package com.sda.strings;

public class UpperCase implements StringOperation {

  @Override
  public String modify(String text) {
    return text.toUpperCase();
  }

}
