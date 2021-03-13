package com.sda.vehicles;

public class Motorcycle extends Vehicle {

  public Motorcycle() {
    super(2, "Zed's motorcycle");

    System.out.println("Tworzenie motocykla.");
    System.out.println("Liczba kół: " + getWheels());
  }

  @Override
  public void run(double velocity) {
    System.out.println("Motorcycle running at " + velocity);
  }
}
