package self.example.pos.domain;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        // Adding 100 items
        items.add(new Item("Apple", "Produce", 0.50, 100));
        items.add(new Item("Banana", "Produce", 0.30, 150));
        items.add(new Item("Carrot", "Produce", 0.25, 120));
        items.add(new Item("Tomato", "Produce", 0.70, 80));
        items.add(new Item("Potato", "Produce", 0.40, 200));
        items.add(new Item("Lettuce", "Produce", 1.00, 50));
        items.add(new Item("Spinach", "Produce", 1.50, 40));
        items.add(new Item("Broccoli", "Produce", 1.20, 60));
        items.add(new Item("Cucumber", "Produce", 0.60, 70));
        items.add(new Item("Bell Pepper", "Produce", 0.80, 50));
        items.add(new Item("Strawberry", "Produce", 2.50, 30));
        items.add(new Item("Blueberry", "Produce", 3.00, 20));
        items.add(new Item("Milk", "Dairy", 2.50, 100));
        items.add(new Item("Cheddar Cheese", "Dairy", 3.50, 80));
        items.add(new Item("Butter", "Dairy", 3.00, 60));
        items.add(new Item("Eggs (dozen)", "Dairy", 4.00, 50));
        items.add(new Item("Yogurt", "Dairy", 1.00, 100));
        items.add(new Item("Cream Cheese", "Dairy", 2.50, 40));
        items.add(new Item("Ice Cream", "Frozen", 4.50, 30));
        items.add(new Item("Frozen Pizza", "Frozen", 5.00, 20));
        items.add(new Item("Chicken Breast", "Meat", 5.00, 60));
        items.add(new Item("Ground Beef", "Meat", 6.00, 40));
        items.add(new Item("Pork Chops", "Meat", 7.00, 30));
        items.add(new Item("Salmon", "Seafood", 10.00, 25));
        items.add(new Item("Shrimp", "Seafood", 8.00, 20));
        items.add(new Item("Bread", "Bakery", 2.00, 80));
        items.add(new Item("Bagels", "Bakery", 3.00, 50));
        items.add(new Item("Tortillas", "Bakery", 1.50, 70));
        items.add(new Item("Croissant", "Bakery", 1.75, 40));
        items.add(new Item("Pasta", "Dry Goods", 1.20, 100));
        items.add(new Item("Rice", "Dry Goods", 1.00, 120));
        items.add(new Item("Cereal", "Breakfast", 3.50, 60));
        items.add(new Item("Oatmeal", "Breakfast", 2.50, 50));
        items.add(new Item("Sugar", "Baking", 2.00, 70));
        items.add(new Item("Flour", "Baking", 1.80, 60));
        items.add(new Item("Salt", "Spices", 0.80, 100));
        items.add(new Item("Pepper", "Spices", 1.00, 90));
        items.add(new Item("Ketchup", "Condiments", 2.00, 80));
        items.add(new Item("Mustard", "Condiments", 1.50, 70));
        items.add(new Item("Mayonnaise", "Condiments", 2.50, 60));
        items.add(new Item("Olive Oil", "Condiments", 5.00, 40));
        items.add(new Item("Canola Oil", "Condiments", 4.00, 50));
        items.add(new Item("Honey", "Condiments", 6.00, 30));
        items.add(new Item("Peanut Butter", "Spreads", 3.50, 70));
        items.add(new Item("Jelly", "Spreads", 3.00, 60));
        items.add(new Item("Chips", "Snacks", 2.50, 100));
        items.add(new Item("Pretzels", "Snacks", 2.00, 80));
        items.add(new Item("Cookies", "Snacks", 3.00, 70));
        items.add(new Item("Popcorn", "Snacks", 1.80, 90));
        items.add(new Item("Soda", "Beverages", 1.50, 120));
        items.add(new Item("Juice", "Beverages", 2.50, 100));
        items.add(new Item("Water Bottle (24 pack)", "Beverages", 4.00, 50));
        items.add(new Item("Coffee", "Beverages", 8.00, 40));
        items.add(new Item("Tea", "Beverages", 5.00, 50));
        items.add(new Item("Energy Drink", "Beverages", 3.00, 30));
        items.add(new Item("Chicken Noodle Soup", "Canned Goods", 1.50, 70));
        items.add(new Item("Tomato Soup", "Canned Goods", 1.30, 60));
        items.add(new Item("Black Beans", "Canned Goods", 1.20, 80));
        items.add(new Item("Corn", "Canned Goods", 1.10, 90));
        items.add(new Item("Tuna", "Canned Goods", 2.00, 50));
        items.add(new Item("Spaghetti Sauce", "Dry Goods", 2.50, 70));
        items.add(new Item("Pickles", "Condiments", 2.50, 50));
        items.add(new Item("Granola Bars", "Snacks", 3.50, 60));
        items.add(new Item("Trail Mix", "Snacks", 4.00, 40));
        items.add(new Item("Frozen Vegetables", "Frozen", 2.00, 70));
        items.add(new Item("Frozen Fries", "Frozen", 2.50, 50));
        items.add(new Item("Diapers", "Household", 20.00, 30));
        items.add(new Item("Toilet Paper (12 pack)", "Household", 10.00, 40));
        items.add(new Item("Paper Towels", "Household", 8.00, 50));
        items.add(new Item("Dish Soap", "Household", 3.50, 60));
        items.add(new Item("Laundry Detergent", "Household", 12.00, 40));
        items.add(new Item("Cleaning Spray", "Household", 4.00, 50));
        items.add(new Item("Trash Bags", "Household", 6.00, 70));
        items.add(new Item("Shampoo", "Personal Care", 5.00, 40));
        items.add(new Item("Conditioner", "Personal Care", 5.00, 40));
        items.add(new Item("Toothpaste", "Personal Care", 2.50, 80));
        items.add(new Item("Toothbrush", "Personal Care", 1.50, 100));
        items.add(new Item("Deodorant", "Personal Care", 3.50, 60));
        items.add(new Item("Soap", "Personal Care", 1.50, 90));
        items.add(new Item("Body Wash", "Personal Care", 4.00, 70));
        items.add(new Item("Pain Reliever", "Pharmacy", 6.00, 40));
        items.add(new Item("Vitamins", "Pharmacy", 10.00, 30));
        items.add(new Item("Baby Formula", "Baby", 25.00, 20));
        items.add(new Item("Dog Food", "Pet Supplies", 15.00, 30));
        items.add(new Item("Cat Food", "Pet Supplies", 12.00, 40));
        items.add(new Item("Batteries", "Electronics", 6.00, 50));
        items.add(new Item("Light Bulbs", "Electronics", 4.00, 60));
        items.add(new Item("Gift Card", "Miscellaneous", 25.00, 100));

        // Displaying all items
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
