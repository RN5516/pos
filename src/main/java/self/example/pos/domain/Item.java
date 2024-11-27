package self.example.pos.domain;


//import lombok.Data;
//
//@Data
public class Item {
    private Integer itemId;
    private String name;
    private String category;
    private double price;

    public Item(Integer itemId, String name, String category, double price) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
