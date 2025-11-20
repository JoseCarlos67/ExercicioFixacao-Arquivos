package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    // Leitura do arquivo
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

    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/files/out/summary.csv"))) {
      for (Product product : products) {
        String outLine = product.getName() + ", " + String.valueOf(product.totalValue() + "\n");
        bufferedWriter.write(outLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}