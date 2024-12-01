package self.example.pos.domain;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
    private static HashMap<Integer, Customer> customerDatabase = new HashMap<>();
    private static int nextCustomerId = 1;

    private int customerId;
    private String name;
    private String phone;
    private String address;

    public Customer(String name, String phone, String address) {
        this.customerId = nextCustomerId++;
        this.name = name;
        this.phone = phone;
        this.address = address;
        customerDatabase.put(this.customerId, this);
    }

    public static void createCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a new customer:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(name, phone, address);
        System.out.println("Customer created successfully! Your customer ID is " + newCustomer.customerId);
    }

    public static void findCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your customer ID: ");
        try {
            int customerId = Integer.parseInt(scanner.nextLine());
            Customer customer = customerDatabase.get(customerId);

            if (customer != null) {
                System.out.println("Customer Information:");
                System.out.println("Name: " + customer.name);
                System.out.println("Phone: " + customer.phone);
                System.out.println("Address: " + customer.address);
            } else {
                System.out.println("No customer found with that ID.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter a valid numeric ID.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCustomer Management System");
            System.out.println("1. Create a new customer");
            System.out.println("2. Find an existing customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createCustomer();
                    break;
                case "2":
                    findCustomer();
                    break;
                case "3":
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
