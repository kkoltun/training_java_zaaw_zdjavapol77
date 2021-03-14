package com.sda.post.office;

import java.util.UUID;

public class Package {
  private PackageStatus status;
  private String contents;
  private String id;

  public Package(PackageStatus status, String contents) {
    this.status = status;
    this.contents = contents;
    this.id = UUID.randomUUID().toString();
  }

  void changeStatus(PackageStatus packageStatus) {
    this.status = packageStatus;
  }

  @Override
  public String toString() {
    return "Package{" +
        "status=" + status +
        ", contents='" + contents + '\'' +
        ", id='" + id + '\'' +
        '}';
  }
}
