package self.example.pos.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String category;
    private double price;
    private int quantity;

    // Constructor
    public Item(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " - " + category + ": $" + String.format("%.2f", price) + " (Quantity: " + quantity + ")";
    }
}


