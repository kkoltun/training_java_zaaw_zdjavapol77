package com.sda.zoo;

public class Duck extends Animal implements FlyBehavior {

  public Duck() {
    super(false);
  }

  @Override
  public void eat(String something) {
    System.out.println("Duck is eating " + something);
  }

  @Override
  public void fly(double height) {
    double actualHeight = Math.min(height, 100);

    System.out.println("Duck flying at " + actualHeight);
  }

}
