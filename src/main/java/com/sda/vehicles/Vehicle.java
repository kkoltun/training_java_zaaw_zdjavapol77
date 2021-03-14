package com.sda.vehicles;

public class Vehicle {

  int wheels;
  String name;
  int seats;

  public Vehicle() {
    this(4);

    System.out.println("Tworzenie vehicle z " + wheels + " kołami.");
  }

  public Vehicle(int wheels) {
    this(wheels, "nieznana");

    System.out.println("Tworzenie vehicle z " + wheels + " kołami.");
  }

  public Vehicle(int wheels, String name) {
    this.wheels = wheels;
    this.name = name;

    System.out.println("Tworzenie vehicle " + name + " z " + wheels + " kołami.");
  }

  public void run(double velocity) {
    System.out.println("Vehicle running at " + velocity);
  }

  public int getWheels() {
    return wheels;
  }
}
