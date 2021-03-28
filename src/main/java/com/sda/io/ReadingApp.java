package com.sda.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingApp {
  public static void main(String[] args) throws Exception {
    Path path = Paths.get("input.txt");

    Reader reader = new FileReader(path.toFile());
    BufferedReader bufferedReader = new BufferedReader(reader);

    // Alternatywne tworzenie BufferedReadera
    BufferedReader otherBufferedReader = Files.newBufferedReader(path);

    String line = bufferedReader.readLine();
    while (line != null) {
      System.out.println(line);

      line = bufferedReader.readLine();
    }
  }

  private static void readFileWithRawReader() throws Exception {
    Path path = Paths.get("input.txt");

    Reader reader = new FileReader(path.toFile());

    int number = reader.read();

    while (number != -1) {
      char character = (char) number;
      System.out.println(character);

      number = reader.read();
    }
  }
}
