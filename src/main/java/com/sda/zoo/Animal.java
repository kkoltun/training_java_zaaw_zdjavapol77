package com.sda.zoo;

public abstract class Animal {

  private boolean eatsMeat;

  public Animal() {
    this.eatsMeat = true;
  }

  public Animal(boolean eatsMeat) {
    this.eatsMeat = eatsMeat;
  }

  abstract void eat(String something);

  boolean doYouEatMeat() {
    return eatsMeat;
  }
}
