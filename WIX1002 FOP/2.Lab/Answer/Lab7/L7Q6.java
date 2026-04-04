package Lab7;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class L7Q6 {
    public static void main(String[] args) {
        // We will store products in memory to look them up later
        ArrayList<String> productIDs = new ArrayList<>();
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();

        // 1. Read product.txt
        try (Scanner productScanner = new Scanner(new File("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\product.txt"))) {
            while (productScanner.hasNextLine()) {
                String line = productScanner.nextLine();
                String[] parts = line.split(",");
                
                // Parts: [0] = ID, [1] = Name, [2] = Price
                productIDs.add(parts[0]);
                productNames.add(parts[1]);
                productPrices.add(Double.parseDouble(parts[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: product.txt not found.");
            return;
        }

        // 2. Print the Header
        System.out.printf("%-15s %-25s %-10s %-15s %-10s%n", 
            "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");

        // 3. Read order.txt and generate output
        try (Scanner orderScanner = new Scanner(new File("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\order.txt"))) {
            while (orderScanner.hasNextLine()) {
                String line = orderScanner.nextLine();
                String[] parts = line.split(",");
                
                // Parts: [0] = OrderID, [1] = ProductID, [2] = Quantity
                String orderProductID = parts[1];
                int quantity = Integer.parseInt(parts[2]);

                // Find the matching product info
                int index = productIDs.indexOf(orderProductID);

                if (index != -1) {
                    String name = productNames.get(index);
                    double price = productPrices.get(index);
                    double total = price * quantity;

                    // Print formatted row
                    System.out.printf("%-15s %-25s %-10d %-15.2f %-10.2f%n", 
                        orderProductID, name, quantity, price, total);
                }
                else    
                    System.out.println("Product ID not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: order.txt not found.");
        }
    }
}