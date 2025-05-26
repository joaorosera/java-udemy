package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Construtor padrão (sem argumentos)
    public Product() {
    }

    // Construtor completo (nome, preço e quantidade)
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor com apenas nome e preço
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $"
            + String.format("%.2f", totalValueInStock());
    }
}

