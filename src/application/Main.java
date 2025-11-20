package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/files/in.csv"))) {

      String line = bufferedReader.readLine();
      while (line != null) {
        String[] data = line.split(",");

        Product product = new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
        products.add(product);
        System.out.println(product);

        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}