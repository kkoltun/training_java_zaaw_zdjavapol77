package com.sda.vehicles;

public class VehicleApp {

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle(4);
    runThisVehicle(vehicle);

    Car car = new Car();
    runThisVehicle(car);

    Motorcycle motorcycle = new Motorcycle();
    runThisVehicle(motorcycle);
  }

  private static void runThisVehicle(Vehicle vehicle) {
    vehicle.run(100);
  }
}
