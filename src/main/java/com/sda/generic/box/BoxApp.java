package com.sda.generic.box;

import com.sda.generic.road.Road;
import com.sda.vehicles.Car;

import java.math.BigDecimal;

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

    // ŹLE! UŻYCIE SUROWEGO TYPU ROAD, RZUTOWANIE
    Box rawBox = new Box();
    rawBox.set(1234);

    Object rawRoadItem = rawBox.get();
    // WYWALI SIĘ W RUNTIME, NIE JEST SPRAWDZANE PRZY KOMPILACJI
    Car car = (Car) rawBox.get();
  }
}
