package work;
import java.util.*;

class Products {
    int productId;
    String productName;
    String category;

    Products(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }
}

public class EcommerceSearch {
    static int linearSearch(Products[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    static int binarySearch(Products[] arr, String name) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = arr[m].productName.compareToIgnoreCase(name);
            if (cmp == 0) return m;
            if (cmp < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Products[] products = new Products[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id name category: ");
            int id = sc.nextInt();
            String name = sc.next();
            String cat = sc.next();
            products[i] = new Products(id, name, cat);
        }
        System.out.print("Enter name to search: ");
        String key = sc.next();
        int lIndex = linearSearch(products, key);
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int bIndex = binarySearch(products, key);
        System.out.println("Linear Search Index: " + lIndex);
        System.out.println("Binary Search Index (sorted): " + bIndex);
    }
}
