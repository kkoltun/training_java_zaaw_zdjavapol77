package com.sda.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingApp {
  public static void main(String[] args) throws Exception {
    Path path = Paths.get("input.txt");

    Writer writer = new FileWriter(path.toFile(), true);
    BufferedWriter bufferedWriter = new BufferedWriter(writer);

    bufferedWriter.write("Nowy tekst");
    bufferedWriter.newLine();
    bufferedWriter.write("Druga linia");
    bufferedWriter.newLine();
    bufferedWriter.close();
  }
}
