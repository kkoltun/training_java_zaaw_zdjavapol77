package com.sda.generic;

public class Box<T> {
  T item;

  public T get() {
    return item;
  }

  public void set(T item) {
    this.item = item;
  }
}
