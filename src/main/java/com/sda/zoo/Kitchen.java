package com.sda.zoo;

public class Kitchen {

  void eatInKitchen(Animal animal) {
    if (animal.doYouEatMeat()) {
      System.out.println("Got an animal which eats meat!");
    } else {
      System.out.println("This animal does not eat meat!");
    }

    animal.eat("something");
  }

}
