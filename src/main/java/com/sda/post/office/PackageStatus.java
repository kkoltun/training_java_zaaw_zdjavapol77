package com.sda.post.office;

public enum PackageStatus {
  SENT("Wysłana"),
  TRAVELLING("Podróżuje"),
  COURIER("W doręczeniu"),
  DELIVERED("Dostarczona"),
  LOST("Zagubiona"),
  RETURNED("Zwrócona");

  private String description;

  PackageStatus(String d) {
    this.description = d;
  }

  public String getDescription() {
    return description;
  }

  // Niestatyczna metoda w klasie enum
  public boolean isError() {
    return this == RETURNED || this == LOST;
  }

  // Statyczna metoda w klasie enum
  public static PackageStatus[] getErrorStatuses() {
    return new PackageStatus[] {LOST, RETURNED};
  }

  @Override
  public String toString() {
    return "PackageStatus{" +
        "description='" + description + '\'' +
        '}';
  }
}
