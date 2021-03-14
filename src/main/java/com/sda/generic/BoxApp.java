package com.sda.generic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BoxApp {
  public static void main(String[] args) {
    Box<Integer> boxLiczba = new Box<>();
    boxLiczba.set(1234);
    System.out.println(boxLiczba.get());

    Box<String> boxTekst = new Box<>();
    boxTekst.set("tekst");
    System.out.println(boxTekst.get());

    BigDecimal bigDecimal = BigDecimal.valueOf(1.123456);

    System.out.println(bigDecimal);
  }
}
