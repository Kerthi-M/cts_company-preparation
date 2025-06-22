package work;
import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add 2. Update 3. Delete 4. View 5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter id name quantity price: ");
                int id = sc.nextInt();
                String name = sc.next();
                int qty = sc.nextInt();
                double price = sc.nextDouble();
                Product p = new Product(id, name, qty, price);
                inventory.put(id, p);
            } 
            else if (ch == 2) {
                System.out.print("Enter id to update: ");
                int id = sc.nextInt();
                if (inventory.containsKey(id)) {
                    System.out.print("Enter new quantity and price: ");
                    int qty = sc.nextInt();
                    double price = sc.nextDouble();
                    Product p = inventory.get(id);
                    p.quantity = qty;
                    p.price = price;
                }
            } 
            else if (ch == 3) {
                System.out.print("Enter id to delete: ");
                int id = sc.nextInt();
                inventory.remove(id);
            } 
            else if (ch == 4) {
                for (Product p : inventory.values()) {
                    System.out.println(p.productId + " " + p.productName + " " + p.quantity + " " + p.price);
                }
            } 
            else {
                break;
            }
        }
    }
}
