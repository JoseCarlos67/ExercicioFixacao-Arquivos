package entities;

public class Product {
  private String name;
  private Double price;
  private Integer quantity;

  public Product(String name, Double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Produto:" +
            "\n-Nome: " + getName() +
            "\n-Valor: " + getPrice() +
            "\n-Quantidade: " + getQuantity() +
            "\n";
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Double totalValue() {
    return price * quantity;
  }
}
