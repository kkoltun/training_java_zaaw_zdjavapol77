package com.sda.vehicles;

public class Car extends Vehicle {
  private int passengers;

  public Car() {
    System.out.println("Tworzenie car");
  }

  @Override
  public void run(double velocity) {
    System.out.println("Car with " + passengers + " passengers running at " + velocity);
  }

  public void addPassenger() {
    passengers = passengers + 1;
    // passengers += 1; to samo
    // ++passengers; to samo tez
  }

  public void removePassenger() {
    passengers = passengers - 1;
  }
}
