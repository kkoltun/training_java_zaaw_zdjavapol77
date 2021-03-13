package com.sda.zoo;

public class ZooApp {

  public static void main(String[] args) {
    Eagle eagle = new Eagle();
    eagle.fly(120);

    Duck duck = new Duck();
    duck.fly(200);

    Air air = new Air();
    air.flyInAir(eagle);
    air.flyInAir(duck);

    FlyBehavior flyBehavior = new FlyBehavior() {
      @Override
      public void fly(double height) {
        System.out.println("ANONIMOWA KLASA LATA " + height);
      }
    };
    flyBehavior.fly(120);

    Animal animal = new Animal() {
      @Override
      void eat(String something) {
        System.out.println("ANONIMOWA KLASA JJE " + something);
      }
    };
    animal.eat("cos");

    Animal anotherDuck = new Duck();
    anotherDuck.eat("vegetables");

    Animal anotherEagle = new Eagle();
    anotherEagle.eat("mouse");

    Kitchen kitchen = new Kitchen();
    kitchen.eatInKitchen(duck);
    kitchen.eatInKitchen(eagle);
    kitchen.eatInKitchen(anotherDuck);
    kitchen.eatInKitchen(anotherEagle);

    Duck.DuckPrinter duckPrinter = new Duck.DuckPrinter();
    duckPrinter.print();
  }

}
