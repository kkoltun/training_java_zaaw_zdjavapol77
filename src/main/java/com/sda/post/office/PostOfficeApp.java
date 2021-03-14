package com.sda.post.office;

import java.time.Month;

public class PostOfficeApp {
  public static void main(String[] args) {
    PackageStatus status = PackageStatus.LOST;
    System.out.println(status);

    Package newPackage = new Package(PackageStatus.SENT, "toys");
    System.out.println(newPackage);

    newPackage.changeStatus(PackageStatus.COURIER);
    System.out.println(newPackage);

    PackageStatus[] packageStatuses = PackageStatus.values();
    for (PackageStatus packageStatus : packageStatuses) {
      System.out.println(packageStatus);
    }

    PackageStatus packageStatus = PackageStatus.valueOf("SENT");
    System.out.println(packageStatus);

    // Przykladowe uzycie enum
    Month september = Month.of(9);
    System.out.println(september);

    // Uzycie statycznej metody enum
    PackageStatus[] errorStatuses = PackageStatus.getErrorStatuses();
    for (PackageStatus errorStatus : errorStatuses) {
      System.out.println(errorStatus);
    }

    // Uzycie niestatycznej metody enum
    System.out.println(PackageStatus.RETURNED.isError());
    System.out.println(PackageStatus.DELIVERED.isError());
  }
}
