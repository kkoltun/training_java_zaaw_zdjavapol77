package com.sda.io;

import com.sda.post.office.Package;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapToCsv {
  public static void main(String[] args) {
    Map<String, String> values = new HashMap<>();
    values.put("Karol", "Koltun");
    values.put("Alicja", "Sokołowska");
    values.put("Maria", "Kowalska");

    Path path = Paths.get("mapa.csv");

    writeToFile(path, values);
  }

  private static void writeToFile(Path path, Map<String, String> values) {
    String dane = "";
    for (String name : values.keySet()) {
      String lastName = values.get(name);

      dane = dane + name + "," + lastName + "\n";
    }

    try {
      Files.writeString(path, dane);
    } catch (IOException exception) {
      System.out.println("Wystąpił błąd " + exception.getMessage());
    }
  }
}
