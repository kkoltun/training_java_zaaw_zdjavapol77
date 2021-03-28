package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OperationsApp {
  public static void main(String[] args) {
    Path relativePath = Paths.get("input.txt");

    System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));

    Path projectRootDirectory = Paths.get("D:\\dev\\training\\java_zaawansowana\\java_zaaw_zdjavapol77");
    Path inputPath = projectRootDirectory.resolve("input.txt");
    System.out.println(inputPath + " jest plikiem: " + Files.isRegularFile(inputPath));

    Path path = Paths.get("C", "Windows", "system.ini");
    System.out.println("Zapis do pliku " + path + ": " + Files.isWritable(path));

    try {
      Predicate<Path> isFile = anyPath -> Files.isRegularFile(anyPath);
      Consumer<Path> printPath = anyPath -> System.out.println("Plik " + anyPath);

      Files.list(projectRootDirectory)
          .filter(isFile)
          .forEach(printPath);

    } catch (IOException exception) {
      System.out.println("Wystąpił błąd: " + exception);
    }
  }
}
