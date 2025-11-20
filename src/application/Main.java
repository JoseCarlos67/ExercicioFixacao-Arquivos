package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File file = new File("src/files/in.csv");
    BufferedReader bufferedReader = null;
    FileReader fileReader = null;
    Scanner scanner = null;
    try {
      fileReader = new FileReader("src/files/in.csv");
      bufferedReader = new BufferedReader(fileReader);

      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close();
        if (fileReader != null)
          fileReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}